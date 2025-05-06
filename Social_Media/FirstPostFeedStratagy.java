import java.util.*;

public class FirstPostFeedStratagy implements FeedStratagy {
    public List<Post> generateFeed(User user) {
        PriorityQueue<Post> postsForFeed = new PriorityQueue<>((a,b) -> b.getTime().compareTo(a.getTime()));
        List<Post> posts = user.getPosts();

        for (int i = 0; i<Math.min(10, posts.size()); ++i) {
            postsForFeed.add(posts.get(posts.size() - 1 - i));
        }

        Set<User> following = user.getFollowing();

        for (User followed : following) {
            posts = followed.getPosts();
            for (int i = 0; i<Math.min(10, posts.size()); ++i) {
                postsForFeed.add(posts.get(posts.size() - 1 - i));
            }
        }

        List<Post> Feed = new ArrayList<>();
        for (int i = 0; i<10; ++i) {
            if (postsForFeed.isEmpty()) break;

            Feed.add(postsForFeed.poll());
        }

        return Feed;
    }
}
