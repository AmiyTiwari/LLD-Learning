import java.util.*;

public class User {
    private String name;
    private final String username;
    private final String emailId;
    private Set<User> follower;
    private Set<User> following;
    private List<Post> posts;

    public User(String name, String username, String emailId) {
        this.name = name;
        this.username = username;
        this.emailId = emailId;
        this.follower = new HashSet<>();
        this.following = new HashSet<>();
        this.posts =  new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public String getEmailId() {
        return emailId;
    }

    public Set<User> getFollower() {
        return follower;
    }

    public void addFollower(User user) {
        follower.add(user);
    }

    public void removeFollower(User user) {
        follower.remove(user);
    }

    public Set<User> getFollowing() {
        return following;
    }

    public void addFollowing(User user) {
        following.add(user);
    }

    public void removeFollowing(User user) {
        following.remove(user);
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void addPost(Post post) {
        posts.add(post);
    }

    public void removePost(Post post) {
        posts.remove(post);
    }
}