package app;

import model.StoryNode;

import java.util.LinkedList;

import model.Game;
import model.Music;

public class Demo {

	public static void main(String[] args) {
		final String pianoMusic = "music/Soft-piano-music.wav";
		final String hauntingMusic = "music/Haunt.wav";
		StoryNode beginning = new StoryNode("This is the start of the journey.", pianoMusic);
		StoryNode darkRoom = new StoryNode("Pithc Black. Can't see nothing.", hauntingMusic);
		StoryNode grue = new StoryNode("Eaten by grue.", pianoMusic);
		StoryNode trap = new StoryNode("Fall into a pit.", pianoMusic);
		StoryNode treasure = new StoryNode("Got Treasure.", pianoMusic);

		beginning.addDecision("N", "Go North", darkRoom);
		beginning.addDecision("S", "Go South", darkRoom);
		beginning.addDecision("E", "Go East", trap);

		darkRoom.addDecision("S", "Go back South.", grue);
		darkRoom.addDecision("O", "Turn On Lantern.", beginning);
		

		Game newGame = new Game(beginning);

		newGame.play();

		System.out.println("The end.");

		// LinkedList<String> list = new LinkedList();
		//
		// list.add("a");
		// list.add("b");
		// list.add("c");
		//
		// String result = compare("d", list);
		// System.out.println(result);
		// }
		//
		// public static String compare(String input, LinkedList list) {
		// int i = 0;
		// while(i < list.size()) {
		// if(input.toLowerCase().equals(list.get(i)))
		// return "Matched";
		// i++;
		// }
		//
		// return "Didn't match";
		// }
	}
}
