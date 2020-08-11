package com.cbd.clicker.services;

import java.util.Collection;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
public class CurrentUser extends User {
    private final com.cbd.clicker.entities.User user;
    public CurrentUser(String username, String password,
                       Collection<? extends GrantedAuthority> authorities,
                       com.cbd.clicker.entities.User user) {
        super(username, password, authorities);
        this.user = user;
    }
    public com.cbd.clicker.entities.User getUser() {return user;}


}