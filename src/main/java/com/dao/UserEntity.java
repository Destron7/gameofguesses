package com.dao;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="users")
public class UserEntity {
	private int otp;
	
}