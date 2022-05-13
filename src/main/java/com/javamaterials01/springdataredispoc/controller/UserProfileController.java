package com.javamaterials01.springdataredispoc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javamaterials01.springdataredispoc.model.Profile;
import com.javamaterials01.springdataredispoc.repository.ProfileDao;

@RestController
public class UserProfileController {

	@Autowired
	private ProfileDao profileDao;

	@PostMapping("/addProfile")
	public Profile addProfile(@RequestBody Profile profile) {
		return profileDao.save(profile);
	}

	@GetMapping("/getAllProfiles")
	public List<Profile> getAllProfiles() {
		return profileDao.getAllProfiles();
	}

	@GetMapping("/getProfileById/{id}")
	public Profile findProfileById(@PathVariable int id) {
		return profileDao.findProfileById(id);
	}
}
