package com.pg.entity;



import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "Persons")
@Data
public class Person {

//	@EmbeddedId
//	private PersonPK personId;
	
	@Id
	@Column(name = "pid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "pemail")
	private String email;
	
	@Column(name = "pname", length=25)
	private String name;
	
	@Column(name = "pmobile")
	@Nonnull
	private String mobile;
	
}
