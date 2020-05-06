package com.mna.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mna.auth.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
}
