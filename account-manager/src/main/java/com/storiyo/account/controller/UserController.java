package com.storiyo.account.controller;

import com.storiyo.account.model.User;
import com.storiyo.account.service.JPA.UsersRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    private UsersRepository usersRepository;

    @Autowired
    public UserController(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @ResponseBody
    @PostMapping(path = "/signUp")
    public String addNewUser(@RequestBody User user) {
        logger.info("Signing up new user");
        User newUser = new User();
        newUser.setUserName(user.getUserName());
        newUser.setEmail(user.getEmail());
        newUser.setPassword(user.getPassword());

        logger.debug("Inserting User: {}, in the database", newUser);
        User savedUser = usersRepository.save(newUser);
        logger.info("User {} successfully saved in the database", savedUser);
        return "User saved successfully";
    }
}
