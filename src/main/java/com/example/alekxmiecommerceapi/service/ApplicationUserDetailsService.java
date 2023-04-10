package com.example.alekxmiecommerceapi.service;

import com.example.alekxmiecommerceapi.auth.UserPrincipal;
import com.example.alekxmiecommerceapi.repository.UserAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
public class ApplicationUserDetailsService implements UserDetailsService {
    private static final String USER_NOT_FOUND_MESSAGE = "Not found user %s";

    @Autowired
    private UserAccountRepository userAccountRepository;

    @Override
    public UserDetails loadUserByUsername(String username) {
        return userAccountRepository
                .findByUsername(username)
                .map(UserPrincipal::new)
                .orElseThrow(() -> new UsernameNotFoundException(String.format(USER_NOT_FOUND_MESSAGE, username)));
    }
}