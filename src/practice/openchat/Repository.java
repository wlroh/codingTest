package practice.openchat;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Repository {

    private Map<String, User> userMap = new HashMap<>();

    public Optional<User> findOne(String userId) {
        return Optional.ofNullable(userMap.get(userId));
    }

    public void save(User user) {
        userMap.put(user.getUserId(), user);
    }
}
