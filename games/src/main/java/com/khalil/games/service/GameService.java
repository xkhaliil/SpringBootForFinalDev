package com.khalil.games.service;
import java.util.List;
import com.khalil.games.entities.Game;
import com.khalil.games.entities.Genre;
public interface GameService {
Game saveGame(Game p);
Game updateGame(Game p);
void deleteGame(Game p);
void deleteGameById(Long id);
Game getGame(Long id);
List<Game> getAllGames();
List<Game> findByNomGame(String nom);
List<Game> findByNomGameContains(String nom);
List<Game> findByNomPrix (String nom, Double prix);
List<Game> findByGenre (Genre genre);
List<Game> findByGenreIdGenre(Long id);
List<Game> findByOrderByNomGameAsc();
List<Game> trierGamesNomsPrix();
}
