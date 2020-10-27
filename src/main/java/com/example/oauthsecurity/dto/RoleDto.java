package com.example.oauthsecurity.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

/**
 * The type Role dto.
 *
 * @author Akash Thomas
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RoleDto implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * The Role id.
     */
    private UUID roleId;

    /**
     * The Role code.
     */
    private String roleCode;

    /**
     * The Resources.
     */
    private Set<String> resources = new HashSet<>(); // TODO: Make it Set<AppRegDto>
}

