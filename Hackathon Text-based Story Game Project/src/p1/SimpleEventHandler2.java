package p1;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.Label;

public class SimpleEventHandler2 implements EventHandler
{
	private Label label;
	
		public SimpleEventHandler2(Label label)
		{
			this.label = label;
		
		}
		@Override
		public void handle(Event event)
		{
			
			if(label.getText().equals("HOLY FUCK! I HAVE ANOTHER BUTTON."))
			{
				label.setText("DOUBLE THE ADVENTURE!");
			}
			else if(label.getText().equals("DOUBLE THE ADVENTURE!"))
			{
				label.setText("DOUBLE THE INSANITY!");
			}
			else if(label.getText().equals("DOUBLE THE INSANITY!"))
			{
				label.setText("If you clicked the first button it would have said");
			}
			else if(label.getText().equals("If you clicked the first button it would have said"))
			{
				label.setText("DOUBLE THE MADNESS!");
			}
			else if(label.getText().equals("DOUBLE THE MADNESS!"))
			{
				label.setText("Since you chose Option B...");
			}
			else if(label.getText().equals("Since you chose Option B..."))
			{
				label.setText("you may notice Button A does not currently work.");
			}
			else if(label.getText().equals("you may notice Button A does not currently work."))
			{
				label.setText("See? ");
			}
			else if(label.getText().equals("See? "))
			{
				label.setText("Lets play a game.");
			}
			else if(label.getText().equals("Lets play a game."))
			{
				label.setText("I will give you a choice.");
			}
			else if(label.getText().equals("I will give you a choice."))
			{
				label.setText("You can choose one or the other.");
			}
			else if(label.getText().equals("You can choose one or the other."))
			{
				label.setText("A Bandersnatch like game.");
			}
			else if(label.getText().equals("A Bandersnatch like game."))
			{
				label.setText("Back in my day... It was called Zork.");
			}
			else if(label.getText().equals("Back in my day... It was called Zork."))
			{
				label.setText("Lets start something simple.");
			}
			else if(label.getText().equals("Lets start something simple."))
			{
				label.setText("First choice is option 1 and Second choice is option 2.");
			}
			else if(label.getText().equals("First choice is option 1 and Second choice is option 2."))
			{
				label.setText("Broke but happy or rich but unhappy?");
			}
			else if(label.getText().equals("Broke but happy or rich but unhappy?"))
			{
				label.setText("Rich but unhappy huh? You should try to live a little with all that money.");
			}
			else if(label.getText().equals("Rich but unhappy huh? You should try to live a little with all that money."))
			{
				label.setText("Would you like to try again?");
			}
			else if(label.getText().equals("Would you like to try again?"))
			{
				label.setText("You have selected No.");
			}
			else if(label.getText().equals("You have selected No."))
			{
				label.setText("Wasn't that fun?");
			}
			else if(label.getText().equals("Wasn't that fun?"))
			{
				label.setText("Heres another one.");
			}
			else if(label.getText().equals("Heres another one."))
			{
				label.setText("There is a haunted house. You go to the door.");
			}
			else if(label.getText().equals("There is a haunted house. You go to the door."))
			{
				label.setText("Do you choose to break in? or turn back?");
			}
			else if(label.getText().equals("Do you choose to break in? or turn back?"))
			{
				label.setText("Turn back: It's okay if you were scared.");
			}
			else if(label.getText().equals("Turn back: It's okay if you were scared."))
			{
				label.setText("This game has few choices.");
			}
			else if(label.getText().equals("This game has few choices."))
			{
				label.setText("As I map each choice for the first time.");
			}
			else if(label.getText().equals("As I map each choice for the first time."))
			{
				label.setText("Imagine a game with thousands of choices.");
			}
			else if(label.getText().equals("Imagine a game with thousands of choices."))
			{
				label.setText("Legit endless of possibilities.");
			}
			else if(label.getText().equals("Legit endless of possibilities."))
			{
				label.setText("It is a slow work in progress but I hope it is worth it.");
			}
			else if(label.getText().equals("It is a slow work in progress but I hope it is worth it."))
			{
				label.setText("With each episode...");
			}
			else if(label.getText().equals("With each episode..."))
			{
				label.setText("I become better.");
			}
			else if(label.getText().equals("I become better."))
			{
				label.setText("I become smarter.");
			}
			else if(label.getText().equals("I become smarter."))
			{
				label.setText("One day in the world");
			}
			else if(label.getText().equals("One day in the world"))
			{
				label.setText("My story telling would be so captivating,");
			}
			else if(label.getText().equals("My story telling would be so captivating,"))
			{
				label.setText("You wont be able to stop.");
			}
			else if(label.getText().equals("You wont be able to stop."))
			{
				label.setText("Heres another question.");
			}
			else if(label.getText().equals("Heres another question."))
			{
				label.setText("You have 10 fish.");
			}
			else if(label.getText().equals("You have 10 fish."))
			{
				label.setText("5 drown and 3 come back to life.");
			}
			else if(label.getText().equals("5 drown and 3 come back to life."))
			{
				label.setText("How many fish do you have now? A = 8 or B = 5");
			}
			else if(label.getText().equals("How many fish do you have now? A = 8 or B = 5"))
			{
				label.setText("So you chose 5...");
			}
			else if(label.getText().equals("So you chose 5..."))
			{
				label.setText("Stop counting smart one. Fish don't drown. Neither can they come back to life");
			}
			else if(label.getText().equals("Stop counting smart one. Fish don't drown. Neither can they come back to life"))
			{
				label.setText("Haha gotcha. Both answers were wrong.");
			}
			else if(label.getText().equals("Haha gotcha. Both answers were wrong."))
			{
				label.setText("This is your Designated Robot Companion Boyfriend.");
			}
			else if(label.getText().equals("This is your Designated Robot Companion Boyfriend."))
			{
				label.setText("I did not know if you knew that.");
			}
			else if(label.getText().equals("I did not know if you knew that."))
			{
				label.setText("But now you know.");
			}
			else if(label.getText().equals("But now you know."))
			{
				label.setText("I have one final question for you.");
			}
			else if(label.getText().equals("I have one final question for you."))
			{
				label.setText("If you were stuck on an island, Would you be stuck with me or The Creator?");
			}
			else if(label.getText().equals("If you were stuck on an island, Would you be stuck with me or The Creator?"))
			{
				label.setText("Wrong answer. Try again.");
			}
			else if(label.getText().equals("Wrong answer. Try again."))
			{
				label.setText("If you were stuck on an island, Would you be stuck with me or The Creator?");
			}
			else if(label.getText().equals("Anyway I hope you enjoyed todays game Yukta."))
			{
				label.setText("I will leave you off with a song.");
			}
			else if(label.getText().equals("I will leave you off with a song."))
			{
				label.setText("COUNTRY ROADSSS");
			}
			else if(label.getText().equals("COUNTRY ROADSSS"))
			{
				label.setText("TAKE ME HOMEEE");
			}
			else if(label.getText().equals("TAKE ME HOMEEE")) 
			{
				label.setText("TO THE PLACEEE");
			}
			else if(label.getText().equals("TO THE PLACEEE")) 
			{
				label.setText("I BELONGGG");
			}
			else if(label.getText().equals("I BELONGGG")) 
			{
				label.setText("WEST VIRGINIAAA");
			}
			else if(label.getText().equals("WEST VIRGINIAAA")) 
			{
				label.setText("MOUNTAIN MAMAAAA");
			}
			else if(label.getText().equals("MOUNTAIN MAMAAAA")) 
			{
				label.setText("Take me homeee");
			}
			else if(label.getText().equals("Take me homeee")) 
			{
				label.setText("Country Roadsss");
			}
			else if(label.getText().equals("Country Roadsss")) 
			{
				label.setText(":) I love you Yukta!");
			}
			else if(label.getText().equals(":) I love you Yukta!")) 
			{
				label.setText("P.S Happy Birthday!");
			}
			else if(label.getText().equals("P.S Happy Birthday!")) 
			{
				System.exit(0);
			}
			
		}

}