package com.hackathon3.model;

import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.*;
/**
@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode */
public class Users {
/*
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;
    @Column (nullable = false)
    private String name;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private boolean locked;
    @Column(nullable = false)
    private boolean enabled;


    public Users(Users user) {
        this.name = name;
        this.password = password;
        this.enabled = user.enabled;
        this.locked = user.locked;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        SimpleGrantedAuthority authority = new SimpleGrantedAuthority("ROLE_ADMIN");
        return Collections.singletonList(authority);
    }

    @Override
    public String getPassword() {
        return password;
    }
    public void setPassword(String encryptpassword) {
        this.password = encryptpassword;
    }

    @Override
    public String getUsername() {
        return name;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return !locked;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    } */
}
