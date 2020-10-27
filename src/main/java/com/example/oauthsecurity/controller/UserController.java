/**************************************************
 * Copyright (c) 2020 RIA Advisory LLC.
 * All rights reserved.
 * @author Akash Thomas
 * Date: 10/27/2020
 * Time: 3:37 PM
 *
 **************************************************/
package com.example.oauthsecurity.controller;


import com.example.oauthsecurity.dto.ResponseDto;
import com.example.oauthsecurity.dto.UserDto;
import com.example.oauthsecurity.service.UserService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping
    public ResponseDto saveUser(@RequestBody UserDto userDto) throws JsonProcessingException {
        return ResponseDto.builder().isError(true).data(userService.saveUser(userDto)).build();
    }


}
