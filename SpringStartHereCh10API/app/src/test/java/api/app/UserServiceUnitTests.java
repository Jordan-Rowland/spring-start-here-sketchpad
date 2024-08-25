package api.app;

import api.app.model.User;
import api.app.repository.UserRepository;
import api.app.service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class UserServiceUnitTests {
//
    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserService userService;

    @Test
    public void TestGetUsers() {
        ArrayList users = new ArrayList<>();
        users.add(new User("Djavid"));
        users.add(new User("Slimjob Dopamine"));
        given(userRepository.getAll()).willReturn(users);

        var res = userService.getUsers();

        verify(userRepository).getAll();
        assertEquals(2, res.size());
    }

    @Test
    public void TestAddUser() {
        var newUser = new User("Hannah");

        var userAdded = userService.addUser(newUser);

        verify(userRepository).addUser(newUser);
        assertTrue(userAdded);
    }
}
