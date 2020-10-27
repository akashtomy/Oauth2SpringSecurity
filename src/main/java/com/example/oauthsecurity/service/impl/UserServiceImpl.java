/**************************************************
 * Copyright (c) 2020 RIA Advisory LLC.
 * All rights reserved.
 * @author Akash Thomas
 * Date: 10/27/2020
 * Time: 12:58 PM
 *
 **************************************************/
package com.example.oauthsecurity.service.impl;


import com.example.oauthsecurity.dto.UserDto;
import com.example.oauthsecurity.entity.SecurityUser;
import com.example.oauthsecurity.entity.User;
import com.example.oauthsecurity.repository.UserRepository;
import com.example.oauthsecurity.service.UserService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service(value = "userService")
public class UserServiceImpl implements UserService, UserDetailsService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ObjectMapper userMapper;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public UserDto saveUser(UserDto userDto) throws JsonProcessingException {
        userDto.setPassword(passwordEncoder.encode(userDto.getPassword()));
        User user = userMapper.readValue(userMapper.writeValueAsString(userDto), User.class);
        return userMapper.readValue(userMapper.writeValueAsString(userRepository.save(user)), UserDto.class);
    }


    //    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findUserByUsername(username).orElseThrow(() -> new UsernameNotFoundException(username));
        return new SecurityUser(user);
    }
}