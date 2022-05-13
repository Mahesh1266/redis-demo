package com.javamaterials01.springdataredispoc.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import com.javamaterials01.springdataredispoc.model.Profile;


@Repository
public class ProfileDao {

	public static final String HASH_KEY = "Profile";
	
	@Autowired
	private RedisTemplate redisTemplate;

	public Profile save(Profile profile) {
	 redisTemplate.opsForHash().put(HASH_KEY, profile.getBan(), profile);
		
		return profile;
	}

	
    public List<Profile> getAllProfiles(){
    	  return redisTemplate.opsForHash().values(HASH_KEY);
    }
	public Profile findProfileById(int id) {
		return (Profile) redisTemplate.opsForHash().get(HASH_KEY, id);
	}
}
