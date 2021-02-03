package model;

import java.util.Scanner;

public class Game {
	private StoryNode root;

	public Game(StoryNode root) {
		this.root = root;
	}

	public static Scanner sc = new Scanner(System.in);

	public void play() {
		StoryNode currentNode = root;
		while(currentNode != null) {
			currentNode.getMusic().play();
			currentNode.displayStory();									
			String input = sc.nextLine();		
			currentNode.getMusic().stop();
			currentNode = currentNode.goToNextStoryNode(input);		
		}
	}
}
