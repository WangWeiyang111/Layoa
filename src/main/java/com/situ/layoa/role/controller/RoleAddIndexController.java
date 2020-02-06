package com.situ.layoa.role.controller;

import java.io.Serializable;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class RoleAddIndexController implements Serializable {
	private static final long serialVersionUID = 1L;
	private static final String PAGE_ROLE_Add_INDEX = "role/role_add"; 
	
	//进角色新增首页
	@GetMapping
	public ModelAndView goAddIndex(ModelAndView modelAndView) {
		modelAndView.setViewName(PAGE_ROLE_Add_INDEX);
		return modelAndView;
	}
	
	
	
}
