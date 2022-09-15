package com.devsuperior.movieflix.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.devsuperior.movieflix.entities.Review;
import com.devsuperior.movieflix.entities.User;

public class UserDTO implements Serializable{
	private static final long serialVersionUID = 1L;

	private Long id;
	
	@Size(min = 3, max = 60, message = "Entre com um nome entre 3 e 50 caracteres")
	@NotBlank(message = "Campo obrigatório")
	private String name;
	
	@Email(message = "Favor entrar com um email válido")
	private String email;
	
	List<Review> reviews = new ArrayList<>();
	
	public UserDTO() {
		
	}
	
	public UserDTO(Long id,
			@Size(min = 3, max = 60, message = "Entre com um nome entre 3 e 50 caracteres") @NotBlank(message = "Campo obrigatório") String name,
			@Email(message = "Favor entrar com um email válido") String email, List<Review> reviews) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.reviews = reviews;
	}



	public UserDTO(User entity) {
		id = entity.getId();
		name = entity.getName();
		email = entity.getEmail();
		reviews = entity.getReviews();
	}
}
