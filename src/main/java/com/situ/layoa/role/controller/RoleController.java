package com.situ.layoa.role.controller;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.situ.layoa.role.domain.Role;
import com.situ.layoa.role.service.RoleService;

@RequestMapping("/role")
@RestController
public class RoleController implements Serializable {
	private static final long serialVersionUID = 1L;
    
	@Autowired RoleService roleService;
	
	@PostMapping("/add")
	public Long doAdd(Role role) {
		
		return roleService.add(role);
	}
	
	@GetMapping("/checkname")
	public 	Integer checkName(String roleName) {
		
		return roleService.findByName(roleName);
	}
}
