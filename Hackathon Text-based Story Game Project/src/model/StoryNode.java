package model;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class StoryNode { 
	private String story;
	private Music music;
	private List<Decision> decisions;
	
	public StoryNode(String story, String filePath) {
		this.story = story;
		this.music = new Music(filePath);
		decisions = new LinkedList<>();
	}
	
	// Adds a decision to the StoryNode
	public void addDecision(String input, String description, StoryNode nextStoryNode) {
		Decision newDecision = new Decision(input, description, nextStoryNode);
		decisions.add(newDecision);
	}
	
	// displays the story paragraph and decisions
	public void displayStory() {
		System.out.println(story);				
		Iterator<Decision> decisionsItr = decisions.iterator();
		while(decisionsItr.hasNext()) {
			decisionsItr.next().displayDecision();
		}
	}
	
	public StoryNode goToNextStoryNode(String userInput) {	
		int i = 0;
		while(i < decisions.size()) {
			String currentInput = decisions.get(i).getInput();
			if(userInput.toLowerCase().equals(currentInput.toLowerCase())) {			
				return decisions.get(i).getNextStoryNode();			
			}
			i++;
		}	
		System.out.println("I didn't understand.");
		return null;
	}
	
	// Getters and Setters
	public String getStory() {
		return story;
	}

	public void setStory(String story) {
		this.story = story;
	}

	public List<Decision> getDecisions() {
		return decisions;
	}

	public void setDecisions(LinkedList<Decision> decisions) {
		this.decisions = decisions;
	}

	@Override
	public String toString() {
		return "story=" + story + ", decisions=" + decisions;
	}

	public Music getMusic() {
		return music;
	}

	public void setMusic(Music music) {
		this.music = music;
	}

	public void setDecisions(List<Decision> decisions) {
		this.decisions = decisions;
	}	
}
