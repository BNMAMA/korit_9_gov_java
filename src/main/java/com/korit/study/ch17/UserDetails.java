package com.korit.study.ch17;

public interface UserDetails {

    public abstract String getUsername();

    String getPassword();

    GrantedAuthority[] getAuthorities();
}
