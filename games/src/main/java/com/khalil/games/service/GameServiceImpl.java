package com.khalil.games.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.khalil.games.entities.Game;
import com.khalil.games.entities.Genre;
import com.khalil.games.repos.GameRepository;
@Service
public class GameServiceImpl implements GameService{

	@Autowired
	GameRepository gameRepository;
	
	@Override
	public Game saveGame(Game p) {
		return gameRepository.save(p);
	}

	@Override
	public Game updateGame(Game p) {
		return gameRepository.save(p);
	}

	@Override
	public void deleteGame(Game p) {
		gameRepository.delete(p);
		
	}

	@Override
	public void deleteGameById(Long id) {
		gameRepository.deleteById(id);
		
	}

	@Override
	public Game getGame(Long id) {
		return gameRepository.findById(id).get();
	}

	@Override
	public List<Game> getAllGames() {
		
		return gameRepository.findAll();
	}

	@Override
	public List<Game> findByNomGame(String nom) {
		return gameRepository.findByNomGame(nom);
	}

	@Override
	public List<Game> findByNomGameContains(String nom) {
		return gameRepository.findByNomGameContains(nom);

	}

	@Override
	public List<Game> findByNomPrix(String nom, Double prix) {
		return gameRepository.findByNomPrix(nom, prix);

	}

	@Override
	public List<Game> findByGenre(Genre genre) {
		return gameRepository.findByGenre(genre);
	}

	@Override
	public List<Game> findByGenreIdGenre(Long id) {
		return gameRepository.findByGenreIdGenre(id);
	}

	@Override
	public List<Game> findByOrderByNomGameAsc() {
		return gameRepository.findByOrderByNomGameAsc();
	}

	@Override
	public List<Game> trierGamesNomsPrix() {
		return gameRepository.trierGamesNomsPrix();

	}
	
	

}