package com.yogaapp.api.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Table(name = "USERS")
@Data
public class User {
	
 	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    @Column
    private String name;
    @Column
    private String email;
    @Column
    private String username;
    @Column
    @JsonIgnore
    private String password;
    @Column
    private long mobile;
    @Column
    private int age;
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "user_role", joinColumns = { @JoinColumn(name = "user_id")}, inverseJoinColumns = {@JoinColumn(name = "role_id")})
    private List<Role> roles;
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "user_ailment", joinColumns = { @JoinColumn(name = "user_id")}, inverseJoinColumns = {@JoinColumn(name = "ailment_id")})
    private List<Ailment> ailments; 

}
