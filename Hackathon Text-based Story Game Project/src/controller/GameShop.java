package controller;

import model.Game;

public class GameShop {
	private Game game;

	public GameShop(Game game) {
		super();
		this.game = game;
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}
	
	
}
