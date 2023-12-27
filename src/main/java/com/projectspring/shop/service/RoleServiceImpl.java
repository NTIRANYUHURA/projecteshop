package com.projectspring.shop.service;

import com.projectspring.shop.Repository.RoleRepository;
import com.projectspring.shop.model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleRepository roleRepository;
    @Override
    public Role createNewRole(Role role) {
        return roleRepository.save(role);
    }
}
