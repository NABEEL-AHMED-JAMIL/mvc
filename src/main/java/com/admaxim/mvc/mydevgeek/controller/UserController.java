package com.admaxim.mvc.mydevgeek.controller;


import com.admaxim.mvc.mydevgeek.assemblers.UserAssembler;
import com.admaxim.mvc.mydevgeek.domain.User;
import com.admaxim.mvc.mydevgeek.service.UserService;
import com.admaxim.mvc.mydevgeek.vo.CreateUserVO;
import com.admaxim.mvc.mydevgeek.vo.UpdateUserVO;
import com.admaxim.mvc.mydevgeek.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * Created by DAM on 2/25/17.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserAssembler userAssembler;

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public UserVO getUser(@PathVariable("id") Long id) {
        return userAssembler.toUserVO(userService.getUserById(id));
    }

    @RequestMapping(method = RequestMethod.POST)
    public UserVO createUser(@Valid @RequestBody CreateUserVO userVO) {
        //convert to User
        User user = userAssembler.toUser(userVO);
        //save User
        User savedUser = userService.createUser(user);
        //convert to UserVO
        return userAssembler.toUserVO(savedUser);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public UserVO updateUser(@RequestBody UpdateUserVO updateUserVO) {
        //convert to User
        User user = userAssembler.toUser(updateUserVO);
        //update User
        User updatedUser = userService.updateUser(user);
        //convert to UserVO
        return userAssembler.toUserVO(user);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") Long id) {
        userService.deleteUser(id);
    }
}
