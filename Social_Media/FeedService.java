import java.util.List;

public class FeedService {
    private FeedStratagy feedStratagy;
    private Usermanager usermanager;

    public FeedService(FeedStratagy feedStratagy) {
        this.feedStratagy = feedStratagy;
        this.usermanager = Usermanager.getUserManager();
    }

    public List<Post> getFeed(String username) {
        User user = usermanager.getUser(username);

        return feedStratagy.generateFeed(user);
    }
}
