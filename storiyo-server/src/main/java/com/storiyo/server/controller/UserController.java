package com.storiyo.server.controller;

import com.storiyo.server.model.User;
import com.storiyo.server.service.JPA.UsersRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
//@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    private UsersRepository usersRepository;

    @Autowired
    public UserController(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @PostMapping(path = "/signUp")
    public @ResponseBody
    String addNewUser(@RequestParam String userName,
                      @RequestParam String userEmail,
                      @RequestParam String userPassword) {
        logger.info("Signing up new user");
        User newUser = new User();
        newUser.setName(userName);
        newUser.setEmail(userEmail);
        newUser.setPassword(userPassword);

        logger.debug("Inserting User: {}, in the database", newUser);
        User savedUser = usersRepository.save(newUser);
        logger.info("User {} successfully saved in the database", savedUser);

        return "User saved successfully";
    }

}
