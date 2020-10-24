package com.nick.apirestcursofullstack.jwt;

import com.nick.apirestcursofullstack.entity.User;
import com.nick.apirestcursofullstack.service.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class JwtInMemoryUserDetailsService implements UserDetailsService {

  @Autowired
  private UserRepository userRepository;

  @Override
  @Transactional(readOnly = true)
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

    User user = userRepository.findByUsername(username);
    if(user == null)
      throw new UsernameNotFoundException(String.format("USER_NOT_FOUND '%s'.", username));

    return new JwtUserDetails(user.getId(), user.getUsername(), user.getPassword(), user.getUserRole());
  }
}


