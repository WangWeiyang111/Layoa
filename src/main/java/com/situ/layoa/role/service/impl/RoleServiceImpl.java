package com.situ.layoa.role.service.impl;

import java.io.Serializable;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.situ.layoa.role.dao.RoleDao;
import com.situ.layoa.role.domain.Role;
import com.situ.layoa.role.service.RoleService;
import com.situ.layoa.util.ConfigUtils;
@Service
public class RoleServiceImpl implements Serializable, RoleService {
	private static final long serialVersionUID = 1L;

	@Autowired
	private RoleDao roleDao;
	
	@Override
	public Long add(Role role) {
		role.setActiveFlag(1);
		role.setCreateBy(ConfigUtils.SYS);
		role.setCreateDate(new Date());
		return roleDao.save(role);
	}

	@Override
	public Integer findByName(String roleName) {
		Integer result = 1;
		Role findByName = roleDao.findByName(roleName);
		if(findByName !=null) {
			result =0;
		}
		return result;
	}

}
