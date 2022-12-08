package com.khalil.games.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "nomGame", types = { Game.class })
public interface GameProjection {
	public String getNomGame();
}
