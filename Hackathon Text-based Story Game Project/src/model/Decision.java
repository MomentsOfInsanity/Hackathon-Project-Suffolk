package model;

public class Decision {
	private String input;
	private String description;
	private StoryNode nextStoryNode;
	
	public Decision(String input, String description, StoryNode nextStoryNode) {
		super();
		this.input = input;
		this.description = description;
		this.nextStoryNode = nextStoryNode; 
	}
	
	public void displayDecision() {
		System.out.println(input + ": " + description);
	}

	public String getInput() {
		return input;
	}

	public void setInput(String input) {
		this.input = input;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public StoryNode getNextStoryNode() {
		return nextStoryNode;
	}

	public void setNextStoryNode(StoryNode nextStoryNode) {
		this.nextStoryNode = nextStoryNode;
	}

	@Override
	public String toString() {
		return "input=" + input + ", description=" + description + ", nextStoryNode=" + nextStoryNode;
	}
	
}
