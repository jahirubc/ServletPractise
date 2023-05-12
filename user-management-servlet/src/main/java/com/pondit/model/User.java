package com.pondit.model;

import org.hibernate.annotations.CollectionId;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@Entity
@AllArgsConstructor
public class User {
	@Id
	private long id;
	@Column
	private String name;
	@Column
	private String email;
	@Column
	private String password;
	
	public User() {
		
	}
}
