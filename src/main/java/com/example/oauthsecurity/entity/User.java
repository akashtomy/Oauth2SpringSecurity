package com.example.oauthsecurity.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.UUID;

/**
 * The type User.
 *
 * @author Akash Thomas
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "USERS")
public class User  {

    /**
     * The User id.
     */
    @Id
    @GeneratedValue(generator = "uuid-gen")
    @Column(name = "USER_ID")
    private UUID userId;

    /**
     * The Username.
     */
    @Column(name = "USERNAME", nullable = false)
    private String username;


    /**
     * The Password.
     */
    @Column(name = "PASSWORD")
    private String password;



}
