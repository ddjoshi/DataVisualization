package com.cygnet.datavisualization;

import com.cygnet.datavisualization.Model.Role;
import com.cygnet.datavisualization.Model.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CustomUserDetails implements UserDetails {
    private String username;
    private String password;
    Collection<? extends GrantedAuthority> authorities;
    public CustomUserDetails(User byEmail) {
        this.username=byEmail.getEmail();
        this.password=byEmail.getPassword();
        List<GrantedAuthority> auth=new ArrayList<>();
        for(Role role:byEmail.getRoles())
            auth.add(new SimpleGrantedAuthority(role.getRole_name().toUpperCase()));
        this.authorities=auth;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
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
        return true;
    }
}
