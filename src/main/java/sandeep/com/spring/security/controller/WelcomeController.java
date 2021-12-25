package sandeep.com.spring.security.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/welcome")
    public ResponseEntity<String> welcome(){
        String welcome="Welcome to App!";
     return new ResponseEntity<>(welcome, HttpStatus.OK);
    }
}
