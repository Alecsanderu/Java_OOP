package com.codecool.crudpractice.user.model;



import lombok.*;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Email;
import java.util.ArrayList;

import java.util.List;



@Entity
@Table

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class AppUser {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;


	@Column(name = "username") private String username;
	@NotNull @Email
	@Column(name ="email") private String email;
	@Column(name = "password") private String password;


	@ElementCollection(fetch = FetchType.EAGER)
	@Builder.Default
	private List<String> roles = new ArrayList<>();


}
