package com.roodymike.userhandler.userhandlerybmanager.controller;

import com.roodymike.userhandler.userhandlerybmanager.jpamodels.Users;
import com.roodymike.userhandler.userhandlerybmanager.jparepo.UsersRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserHandlerController {
    private final UsersRepository usersRepository;

    public UserHandlerController(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @GetMapping("/users/user/{username}")
    public ResponseEntity<Users> getUserWithUsername(@PathVariable String username) throws Exception {
        Users user = usersRepository.findByUsername(username).orElseGet(Users::new);
        return ResponseEntity.ok(user);
    }

    @GetMapping("/users/account/{accountId}")
    public ResponseEntity<Users> getUserWithAccountId(@PathVariable String accountId) throws Exception {
        Users user = usersRepository.findByAccountId(accountId).orElseGet(Users::new);
        return ResponseEntity.ok(user);
    }

    @GetMapping("/users/email/{email}")
    public ResponseEntity<Users> getUserWithEmail(@PathVariable String email) throws Exception {
        Users user = usersRepository.findByEmail(email).orElseGet(Users::new);
        return ResponseEntity.ok(user);
    }
}
