package com.example.oauthsecurity.repository;


import com.example.oauthsecurity.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

/**
 * The interface User repository.
 *
 * @author Akash Thomas
 */
public interface UserRepository extends JpaRepository<User, UUID> {
    /**
     * Find user by username optional.
     *
     * @param username the username
     * @return the optional
     */
    Optional<User> findUserByUsername(String username);
}
