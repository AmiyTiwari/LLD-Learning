import java.util.*;

public class PostRepository {
    Map<UUID, Post> posts = new HashMap<>();

    public void save(Post post) {
        posts.put(post.getId(), post);
    }

    public Post getPostById(UUID id) {
        return posts.get(id);
    }

    public void removePostById(UUID id) {
        posts.remove(id);
    }

    public List<Post> getAllPosts() {
        return new ArrayList<>(posts.values());
    }
}
