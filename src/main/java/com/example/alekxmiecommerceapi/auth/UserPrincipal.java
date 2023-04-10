package com.example.alekxmiecommerceapi.auth;

import com.example.alekxmiecommerceapi.entity.account.AuthorityEntity;
import com.example.alekxmiecommerceapi.entity.account.UserAccountEntity;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import java.util.Collection;
import java.util.stream.Collectors;


public class UserPrincipal implements UserDetails {
    private final UserAccountEntity user;

    public UserPrincipal(UserAccountEntity user) {
        this.user = user;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return user.getAuthorities()
                .stream()
                .map(AuthorityEntity::getPermission)
                .map(SimpleGrantedAuthority::new)
                .collect(Collectors.toSet());

    }

    @Override
    public String getPassword() {
        return user.getPassword();
    }

    @Override
    public String getUsername() {
        return user.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return this.user.isEnabled();
    }
}
