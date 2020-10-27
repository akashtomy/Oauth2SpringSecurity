
package com.example.oauthsecurity.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;

/**
 * The type User dto.
 *
 * @author Akash Thomas
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * The Organization id.
     */
    private String organizationId;
    /**
     * The Password.
     */
    private String password;
    /**
     * The Status.
     */
    private String status;
    /**
     * The User id.
     */
    private UUID userId;
    /**
     * The User role.
     */
    private String userRole;
    /**
     * The Username.
     */
    private String username;

}
