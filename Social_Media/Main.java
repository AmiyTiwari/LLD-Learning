import java.util.List;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        Usermanager usermanager = Usermanager.getUserManager();

        String username1 = usermanager.createUser("tom", "tom532", "tom532@gmail.com");
        String username2 = usermanager.createUser("steve", "steve32", "steve32@gmail.com");
        String username3 = usermanager.createUser("tomy", "tomy532", "tomy532@gmail.com");
        String username4 = usermanager.createUser("steven", "steven32", "steven32@gmail.com");
        String username5 = usermanager.createUser("tom", "tom52", "tom52@gmail.com");
        String username6 = usermanager.createUser("steve", "steve10", "steve21@gmail.com");

        usermanager.followUser(username1, username2);
        usermanager.followUser(username1, username3);
        usermanager.followUser(username2, username1);
        usermanager.followUser(username1, username5);
        usermanager.followUser(username3, username4);
        usermanager.followUser(username5, username6);
        usermanager.followUser(username6, username1);
        usermanager.followUser(username5, username2);
        usermanager.followUser(username4, username3);
        usermanager.followUser(username3, username6);
        usermanager.followUser(username6, username2);
        usermanager.followUser(username3, username5);

        usermanager.unfollowUser(username3, username4);
        usermanager.unfollowUser(username5, username6);
        usermanager.unfollowUser(username6, username1);
        usermanager.unfollowUser(username5, username2);
        usermanager.unfollowUser(username4, username3);

        UUID postID1 = usermanager.createPost(username1, "Post created 1");
        UUID postID2 = usermanager.createPost(username1, "Post created 2");
        UUID postID3 = usermanager.createPost(username1, "Post created 3");
        UUID postID4 = usermanager.createPost(username1, "Post created 4");

        UUID postID5 = usermanager.createPost(username3, "Post created 5");
        UUID postID6 = usermanager.createPost(username3, "Post created 6");
        UUID postID7 = usermanager.createPost(username3, "Post created 7");
        UUID postID8 = usermanager.createPost(username3, "Post created 8");

        FirstPostFeedStratagy firstPostFeedStratagy = new FirstPostFeedStratagy();
        FeedService feedService = new FeedService(firstPostFeedStratagy);

        List<Post> posts = feedService.getFeed(username1);

        for (Post post : posts) {
            System.out.println("Post details -> \nID : " + post.getId() + " \nTime : " + post.getTime() + " \nUser : " + post.getUser().getUsername() + " \nContent : " + post.getContent());
        }

        usermanager.deletePost(postID2);

        posts = feedService.getFeed(username1);

        for (Post post : posts) {
            System.out.println("Post details -> \nID : " + post.getId() + " \nTime : " + post.getTime() + " \nUser : " + post.getUser().getUsername() + " \nContent : " + post.getContent());
        }
    }
}
