package com.example.oauthsecurity.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * The type Auth request dto.
 *
 * @author Akash Thomas
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthRequestDto {
    /**
     * The Id.
     */
    private String id;
    /**
     * The Username.
     */
    private String username;
    /**
     * The Password.
     */
    private String password;
    /**
     * The Account number.
     */
    private String accountNumber;
    /**
     * The Account type.
     */
    private String accountType;
    /**
     * The First name.
     */
    private String firstName;
    /**
     * The Last name.
     */
    private String lastName;
    /**
     * The Email.
     */
    private String email;


    /**
     * The Account non expired.
     */
    private boolean accountNonExpired;
    /**
     * The Account non locked.
     */
    private boolean accountNonLocked;
    /**
     * The Credentials non expired.
     */
    private boolean credentialsNonExpired;
    /**
     * The Enabled.
     */
    private boolean enabled;
}
