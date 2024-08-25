package api.app.service;

import api.app.model.User;
import api.app.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public boolean addUser(User user) {
        userRepository.addUser(user);
        return true;
    }

    public List<User> getUsers() {
        return userRepository.getAll();
    }
}
