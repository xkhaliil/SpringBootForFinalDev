package com.khalil.games.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;



@Entity
public class Genre {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long idGenre;
	private String nomGenre;
	
	@JsonIgnore
	@OneToMany (mappedBy = "genre")
	private List<Game> games;
	
	
	public Genre() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getIdGenre() {
		return idGenre;
	}
	public void setIdGenre(long idGenre) {
		this.idGenre = idGenre;
	}
	public String getNomGenre() {
		return nomGenre;
	}
	public void setNomGenre(String nomGenre) {
		this.nomGenre = nomGenre;
	}
	

}
