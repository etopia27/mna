package com.mna.auth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mna.auth.model.User;
import com.mna.auth.service.UserService;
import com.mna.dataCarrier.dto.UserDetailsDTO;

@RestController
@RequestMapping(value = "/user", produces = MediaType.APPLICATION_JSON_VALUE)
public class UserController {
	@Autowired
	private UserService userService;

	@RequestMapping(value = "/authenticate", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ResponseEntity<String> doAuthenticate(@RequestBody UserDetailsDTO userDetails) {

		if (StringUtils.isEmpty(userDetails.getUsername()) || StringUtils.isEmpty(userDetails.getPassword())) {
			return ResponseEntity.badRequest().body("{}");
		}
		User user = userService.findByUsername(userDetails.getUsername());
		if (user == null || !user.getPassword().equals(userDetails.getPassword())) {
			return ResponseEntity.badRequest().body("{}");
		}

		return ResponseEntity.ok().body("{}");
	}

}
