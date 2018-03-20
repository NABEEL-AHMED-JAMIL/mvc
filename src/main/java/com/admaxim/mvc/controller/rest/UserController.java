package com.admaxim.mvc.controller.rest;

import com.admaxim.mvc.model.User;
import com.admaxim.mvc.services.UserService;
import com.admaxim.mvc.util.CustomErrorType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import javax.jws.soap.SOAPBinding;
import java.util.List;


@RestController
@RequestMapping("/api")
public class UserController {

    public static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    // -------------------Retrieve All Users---------------------------------
    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public ResponseEntity<List<User>> listAllUsers() {
        List<User> users = userService.findAllUsers();
        if(users.isEmpty()) {
            // this will show zero
            logger.info("User List empty value {} ", users.size());
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        logger.info("User List value {}", users.size());
        return new ResponseEntity<List<User>>(users, HttpStatus.OK);
    }

    //---------------------Retrieve Single User--------------------
    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> getUser(@PathVariable("id") Long id) {
        logger.info("Fetching User with id {}", id);
        User user = userService.findById(id);
        if(user == null) {
            logger.error("User with id {} not found.", id);
            return new ResponseEntity<>(new CustomErrorType("User with id " + id + "not found"), HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<User>(user, HttpStatus.OK);
    }

    //-------------------Create a User--------------------------
    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public ResponseEntity<?> createUser(@RequestBody User user, UriComponentsBuilder uriComponentsBuilder) {
        logger.info("Creating User : {}", user);
        if(userService.isUserExist(user)) {
            logger.error("Unable to Create. A User with name {} already exist", user.getName());
            return new ResponseEntity<>(new CustomErrorType("Unable to create. A User with name " + user.getName() + " already exist."), HttpStatus.CONFLICT);
        }
        userService.saveUser(user);

        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(uriComponentsBuilder.path("/api/user/{id}").buildAndExpand(user.getId()).toUri());
        return new ResponseEntity<String>(headers, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.PUT)
    public ResponseEntity<?> updateUser(@PathVariable("id") Long id, @RequestBody User user) {
        logger.info("Updating User with id {}", id);

        User currentUser = userService.findById(id);

        if(currentUser == null) {
            logger.error("Unable to update. User with id {} not found.", id);
            return  new ResponseEntity<>(
                    new CustomErrorType("Unable to update. User with id " + id + " not found."),
                    HttpStatus.NOT_FOUND);
       }

       currentUser.setName(user.getName());
       currentUser.setAge(user.getAge());
       currentUser.setSalary(user.getSalary());

       userService.updateUser(currentUser);

       return new ResponseEntity<User>(currentUser, HttpStatus.OK);

    }


    // ------------------- Delete a User-----------------------------------------

    @RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteUser(@PathVariable("id") long id) {
        logger.info("Fetching & Deleting User with id {}", id);

        User user = userService.findById(id);
        if (user == null) {
            logger.error("Unable to delete. User with id {} not found.", id);
            return new ResponseEntity(new CustomErrorType("Unable to delete. User with id " + id + " not found."),
                    HttpStatus.NOT_FOUND);
        }
        userService.deleteUserById(id);
        return new ResponseEntity<User>(HttpStatus.NO_CONTENT);
    }

    // ------------------- Delete All Users-----------------------------

    @RequestMapping(value = "/user/", method = RequestMethod.DELETE)
    public ResponseEntity<User> deleteAllUsers() {
        logger.info("Deleting All Users");

        userService.deleteAllUsers();
        return new ResponseEntity<User>(HttpStatus.NO_CONTENT);
    }

}
