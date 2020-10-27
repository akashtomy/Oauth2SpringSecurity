package com.example.oauthsecurity.entity;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * The type Security user.
 *
 * @author Akash Thomas
 */
@Data
public class SecurityUser implements UserDetails {

    /**
     * The User.
     */
    private final User user;

    /**
     * Instantiates a new Security user.
     *
     * @param user the user
     */
    public SecurityUser(User user) {
        this.user = user;
    }

    /**
     * Gets authorities.
     *
     * @return the authorities
     */
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> authorities = new ArrayList<>();
//        authorities.add(new SimpleGrantedAuthority(user.getUserRoles().getRoles().getRoleCode()));
        authorities.add(new SimpleGrantedAuthority("ADMIN"));
        return authorities;
    }

    /**
     * Gets password.
     *
     * @return the password
     */
    @Override
    public String getPassword() {
        return user.getPassword();
    }

    /**
     * Gets username.
     *
     * @return the username
     */
    @Override
    public String getUsername() {
        return user.getUsername();
    }

    /**
     * Is account non expired boolean.
     *
     * @return the boolean
     */
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    /**
     * Is account non locked boolean.
     *
     * @return the boolean
     */
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    /**
     * Is credentials non expired boolean.
     *
     * @return the boolean
     */
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    /**
     * Is enabled boolean.
     *
     * @return the boolean
     */
    @Override
    public boolean isEnabled() {
        return true;
    }
}
