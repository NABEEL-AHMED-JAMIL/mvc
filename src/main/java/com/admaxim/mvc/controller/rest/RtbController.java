package com.admaxim.mvc.controller.rest;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;


//@RtbRestController
@Controller
@RequestMapping("/rtb")
public class RtbController {


    @RequestMapping(value = "/{user}", method = RequestMethod.GET)
    public String listAllUsers(@PathVariable String user) {
        return user;
    }

    @RequestMapping( method = RequestMethod.POST)
    @ResponseBody
    public String testSerializable(@RequestBody User user) {
        return user.toString();
    }

    @RequestMapping( method = RequestMethod.GET)
    @ResponseBody
    public String makeResponse(HttpServletRequest request) {
        return request.getHeader("X-FORWARDED-FOR");
    }

}


