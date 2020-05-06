package com.mna.auth;

import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.mna.auth.model.Role;
import com.mna.auth.model.User;
import com.mna.auth.repository.RoleRepository;
import com.mna.auth.repository.UserRepository;

@Component
public class DataLoader implements ApplicationRunner {

	@Autowired
	private UserRepository userRepository;
	@Autowired
	private RoleRepository roleRepository;

	@Override
	public void run(ApplicationArguments arg0) throws Exception {
		Role role = new Role();
		role.setName("Expert");
		roleRepository.save(role);
		role = new Role();
		role.setName("LocalTech");
		roleRepository.save(role);
		User user = new User();
		user.setUsername("admin");
		user.setPassword("123456");
		user.setPassword(user.getPassword());
		user.setRoles(new HashSet<>(roleRepository.findAll()));
		userRepository.save(user);

	}
}
