package com.khalil.games;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.khalil.games.entities.Game;
import com.khalil.games.entities.Genre;
import com.khalil.games.repos.GameRepository;

@SpringBootTest
class GamesApplicationTests {
	@Autowired
	private GameRepository gameRepository;

	@Test
	public void testCreateGame() {
	Game prod = new Game("iphone x",1500.500,new Date());
    gameRepository.save(prod);
	}
	
	@Test
	public void testFindGame()
	{
	Game p = gameRepository.findById(1L).get();
	System.out.println(p);
	}
	
	@Test
	public void testUpdateGame()
	{
	Game p = gameRepository.findById(1L).get();
	p.setPrixGame(2000.0);
	gameRepository.save(p);
	
	System.out.println(p);
	}
	
	@Test
	public void testDeleteGame()
	{
		gameRepository.deleteById(1L);
	}
	
	@Test
	public void testFindAllGames()
	{
		List<Game> prods = gameRepository.findAll();
		
		for (Game p:prods)
			 System.out.println(p);
		
	}
	
	@Test
	public void testFindGameByNom()
	{
	List <Game> p = gameRepository.findByNomGame("PC Asus");
	System.out.println(p);
	}
	
	@Test
	public void testFindGameByNomContains()
	{
	List <Game> p = gameRepository.findByNomGameContains("P");
	System.out.println(p);
	}
	@Test
	public void testfindByNomPrix()
	{
	List<Game> prods = gameRepository.findByNomPrix("iphone X", 1000.0);
	for (Game p : prods)
	{
	System.out.println(p);
	}
	}
	
	@Test
	public void testfindByGenre()
	{
	Genre cat = new Genre();
	cat.setIdGenre(2L);
	List<Game> prods = gameRepository.findByGenre(cat);
	for (Game p : prods)
	{
	System.out.println(p);
	}
	}
	@Test
	public void findByGenreIdGenre()
	{
	List<Game> prods = gameRepository.findByGenreIdGenre(1L);
	for (Game p : prods)
	{
	System.out.println(p);
	}
	 }
	@Test
	public void testfindByOrderByNomGameAsc()
	{
	List<Game> prods =
	gameRepository.findByOrderByNomGameAsc();
	for (Game p : prods)
	{
	System.out.println(p);
	}
	}
	@Test
	public void testfindByOrderByNomGameDesc()
	{
	List<Game> prods =
	gameRepository.findByOrderByNomGameDesc();
	for (Game p : prods)
	{
	System.out.println(p);
	}
	}
	@Test
	public void testTrierGamesNomsPrix()
	{
	List<Game> prods = gameRepository.trierGamesNomsPrix();
	for (Game p : prods)
	{
	System.out.println(p);
	}
	}




}
