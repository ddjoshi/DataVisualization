package com.cygnet.datavisualization.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Role")

public class Role

{
    @Id
    @GeneratedValue
    @Column(name="role_id")
    private Long id;
    @Column(name="role_name")
    private String role_name;

    public Role() {

    }
    public Role(String role_name) {
        this.role_name=role_name;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getRole_name() {
        return role_name;
    }
    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }




}
