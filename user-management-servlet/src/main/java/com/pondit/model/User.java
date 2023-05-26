package com.pondit.model;

import jakarta.persistence.*;
import org.hibernate.annotations.CollectionId;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.*;

@Getter
@Setter
@Builder
@Entity
@Table(name = "TBL_USER")
@AllArgsConstructor
public class User {
	@Id
	@GeneratedValue
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
