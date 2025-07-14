package com.hcl.usermanagement.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {

	private Long id;
	private String firstname;
	private String lastname;
	private String email;
	private String mobile;
	
	private LocalDateTime createdAt;
}
