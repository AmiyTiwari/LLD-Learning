import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserRepository {
    Map<String, User> users = new HashMap<>();

    public void save(User user) {
        users.put(user.getUsername(), user);
    }

    public User getUserByUsername(String username) {
        return users.get(username);
    }

    public List<User> getAllUsers() {
        return new ArrayList<>(users.values());
    }
}
