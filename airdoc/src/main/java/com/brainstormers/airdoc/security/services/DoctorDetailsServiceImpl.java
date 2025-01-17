package com.brainstormers.airdoc.security.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.brainstormers.airdoc.services.DoctorService;


/**
 * @author Mustapha Ouarrain
 * @since version 1.0.0
 * 
 */
@Service
public class DoctorDetailsServiceImpl implements UserDetailsService {
	
	
	@Autowired
	DoctorService doctorService;


	@Override
	@Transactional
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        return  UserDetailsImpl.build(doctorService.findByEmail(username)
				.orElseThrow(() -> new UsernameNotFoundException("Doctor Not Found with Email: " + username)));
	}

}
