import java.time.LocalDateTime;
import java.util.UUID;

public class Usermanager {
    private PostFactory postFactory;
    private UserRepository userRepository;
    private PostRepository postRepository;
    private static Usermanager usermanager;

    private Usermanager() {
        this.postFactory = new PostFactory();
        this.userRepository = new UserRepository();
        this.postRepository = new PostRepository();
    }

    public static Usermanager getUserManager() {
        if (usermanager == null) {
            usermanager = new Usermanager();
        }
        return usermanager;
    }

    public String createUser(String name, String username, String emailId) {
        User user = new User(name,username,emailId);
        userRepository.save(user);

        System.out.println("User Created with username : " + user.getUsername());

        return user.getUsername();
    }

    public User getUser(String username) {
        return userRepository.getUserByUsername(username);
    }

    public void followUser(String followerUsername, String followingUsername) {
        User follower = userRepository.getUserByUsername(followerUsername);
        User following = userRepository.getUserByUsername(followingUsername);

        System.out.println("User " + follower.getUsername() + " have followed the User " + following.getUsername());

        follower.addFollowing(following);
        following.addFollower(follower);
    }

    public void unfollowUser(String followerUsername, String followingUsername) {
        User follower = userRepository.getUserByUsername(followerUsername);
        User following = userRepository.getUserByUsername(followingUsername);

        System.out.println("User " + follower.getUsername() + " have unfollowed the User " + following.getUsername());

        follower.removeFollowing(following);
        following.removeFollower(follower);
    }

    public UUID createPost(String username, String content) {
        User user = userRepository.getUserByUsername(username);

        Post post = postFactory.createTextPost(UUID.randomUUID(), LocalDateTime.now(), user, content);

        System.out.println("Post with ID " + post.getId() + " is created for user " + user.getUsername());

        user.addPost(post);
        postRepository.save(post);

        return post.getId();
    }

    public void deletePost(UUID id) {
        Post post = postRepository.getPostById(id);

        System.out.println("Deleted the post " + post.getId() + " of user " + post.getUser().getUsername());

        post.getUser().removePost(post);
        postRepository.removePostById(id);
    }
}
