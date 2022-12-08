package com.khalil.games.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.khalil.games.entities.Game;
import com.khalil.games.entities.Genre;
@RepositoryRestResource(path = "rest")
public interface GameRepository extends JpaRepository<Game, Long> {
	
	List<Game> findByNomGame(String nom);
	List<Game> findByNomGameContains(String nom);
	List<Game> findByGenreIdGenre(Long id);
	List<Game> findByOrderByNomGameAsc();
	List<Game> findByOrderByNomGameDesc();


	/*@Query("select p from Game p where p.nomGame like %?1 and p.prixGame > ?2")
	List<Game> findByNomPrix (String nom, Double prix);*/
	
	@Query("select p from Game p where p.nomGame like %:nom and p.prixGame > :prix")
	List<Game> findByNomPrix (@Param("nom") String nom,@Param("prix") Double prix);

	@Query("select p from Game p where p.genre = ?1")
	List<Game> findByGenre (Genre genre);
	
	@Query("select p from Game p order by p.nomGame ASC, p.prixGame DESC")
	List<Game> trierGamesNomsPrix ();
	 

}
