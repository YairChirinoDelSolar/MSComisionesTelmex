package com.telmex.demo.dto;

import com.telmex.demo.entity.Empleado;
import com.telmex.demo.entity.UserRole;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserRequest {

    private Long id;
    private String username;
    private String password;
    private Set<UserRole> roles;
    private Empleado empleado;
}
