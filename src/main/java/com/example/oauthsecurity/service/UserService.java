/**************************************************
 * Copyright (c) 2020 RIA Advisory LLC.
 * All rights reserved.
 * @author Akash Thomas
 * Date: 10/27/2020
 * Time: 12:57 PM
 *
 **************************************************/
package com.example.oauthsecurity.service;


import com.example.oauthsecurity.dto.UserDto;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.List;

/**
 * The interface User service.
 *
 * @author Akash Thomas
 */
public interface UserService {

    UserDto saveUser(UserDto dto) throws JsonProcessingException;

}