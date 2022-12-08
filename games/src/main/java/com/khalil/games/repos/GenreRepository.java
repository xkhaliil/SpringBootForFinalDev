package com.khalil.games.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.khalil.games.entities.Genre;

public interface GenreRepository extends JpaRepository<Genre, Long>{

	

}
