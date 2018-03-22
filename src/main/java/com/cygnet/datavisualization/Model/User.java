package com.cygnet.datavisualization.Model;

import org.springframework.boot.autoconfigure.web.ResourceProperties;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
    @Id
    @GeneratedValue
    @Column(name="user_id")
    private Long id;

    @Column(name="password")
    private String password;

    @Column(name="fname")
    private String fname;

    @Column(name="lname")
    private String lname;

    @Column(name="email")
    private String email;

    @Column(name="Active")
    private boolean Active;

    @OneToMany(fetch=FetchType.EAGER,cascade=CascadeType.ALL)
    private List<Role> roles;

    public User() {

    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isActive() {
        return Active;
    }

    public void setActive(boolean active) {
        Active = active;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }



}
