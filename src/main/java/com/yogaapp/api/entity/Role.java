package com.yogaapp.api.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="ROLE")
@Data
public class Role {
	
	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
	
	@Column
	private String code;
	
	@Column
	private String description;
	
	
}
