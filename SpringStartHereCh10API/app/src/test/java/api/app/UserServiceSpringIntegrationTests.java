package api.app;

import api.app.model.User;
import api.app.repository.UserRepository;
import api.app.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@ActiveProfiles("test")
public class UserServiceSpringIntegrationTests {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserService userService;

    @Test
    public void TestAddAndGetUsers() {
        userService.addUser(new User("Djavid"));
        userService.addUser(new User("Slimjob Dopamine"));

        var res = userService.getUsers();

        assertEquals(2, res.size());
    }
}
