package api.app.controller;

import api.app.model.User;
import api.app.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class hello {

    private final UserService userService;

    public hello(UserService userService) { this.userService = userService; }

    @GetMapping("/hello")
    public ResponseEntity<List<User>> getHello(){
        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .body(userService.getUsers());
    }

    @PostMapping("/hello")
    public ResponseEntity<String> createHello(@RequestBody User user) {
        userService.addUser(user);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(String.format("User %s created", user.getName()));
    }
}
