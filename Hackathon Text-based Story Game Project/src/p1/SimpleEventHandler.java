package p1;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class SimpleEventHandler implements EventHandler
{
	@FXML
	private Label label;
	
		public SimpleEventHandler(Label label)
		{
			this.label = label;
		
		}
		@Override
		public void handle(Event event)
		{
			
			if(label.getText().equals("Hello World!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!")) // 1
			{
				label.setText("My name is Tom");
			}
			else if(label.getText().equals("My name is Tom")) // 2
			{
				label.setText("madness");
			}
			else if(label.getText().equals("DOUBLE THE MADNESS!")) // 3A
			{
				label.setText("If you clicked the second button it would have said");
			}
			else if(label.getText().equals("If you clicked the second button it would have said")) // 4A
			{
				label.setText("DOUBLE THE INSANITY!");
			}
			else if(label.getText().equals("DOUBLE THE INSANITY!")) // 5A LEADS TO 3B
			{
				label.setText("Since you chose Option A...");  
			}
			else if(label.getText().equals("Since you chose Option A...")) // 6A
			{
				label.setText("you may notice Button B does not currently work.");
			}
			else if(label.getText().equals("you may notice Button B does not currently work.")) // 7A
			{
				label.setText("See?");
			}
			else if(label.getText().equals("See?")) // 8A
			{
				label.setText("Lets play a game.");
			}
			else if(label.getText().equals("Lets play a game.")) // 9
			{
				label.setText("I will give you a choice.");
			}
			else if(label.getText().equals("I will give you a choice."))  // 10
			{
				label.setText("You can choose one or the other.");
			}
			else if(label.getText().equals("You can choose one or the other.")) // 11
			{
				label.setText("A Bandersnatch like game.");
			}
			else if(label.getText().equals("A Bandersnatch like game."))  // 12
			{
				label.setText("Back in my day... It was called Zork.");
			}
			else if(label.getText().equals("Back in my day... It was called Zork.")) // 13
			{
				label.setText("Lets start something simple.");
			}
			else if(label.getText().equals("Lets start something simple."))  // 14
			{
				label.setText("First choice is option 1 and Second choice is option 2.");
			}
			else if(label.getText().equals("First choice is option 1 and Second choice is option 2."))  // 15
			{
				label.setText("Broke but happy or rich but unhappy?");
			}
			else if(label.getText().equals("Broke but happy or rich but unhappy?"))	// 16
			{
				label.setText("Broke but happy huh? Good for you!");
			}
			else if(label.getText().equals("Broke but happy huh? Good for you!")) // 17A
			{
				label.setText("Would you like to try again?");
			}
			else if(label.getText().equals("Would you like to try again?"))  // 18
			{
				label.setText("You have selected Yes.");
			}
			else if(label.getText().equals("You have selected Yes.")) // 19A
			{
				label.setText("Broke but happy or rich but unhappy?"); // Leads to 16
			}
			
			//////////// B leads back into A for choice
			else if(label.getText().equals("You have selected No.")) // 20
			{
				label.setText("Wasn't that fun?");
			}
			else if(label.getText().equals("Wasn't that fun?")) // 21
			{
				label.setText("Heres another one.");
			}
			else if(label.getText().equals("Heres another one.")) // 22
			{
				label.setText("There is a haunted house. You go to the door.");
			}
			else if(label.getText().equals("There is a haunted house. You go to the door.")) // 23
			{
				label.setText("Do you choose to break in? or turn back?");
			}
			else if(label.getText().equals("Do you choose to break in? or turn back?")) // 24
			{
				label.setText("Break in: You could not break in as you didn't have the skills.");
			}
			else if(label.getText().equals("Break in: You could not break in as you didn't have the skills."))	// 25B
			{
				label.setText("This game has few choices.");
			}
			else if(label.getText().equals("This game has few choices."))	// 26
			{
				label.setText("As I map each choice for the first time.");
			}
			else if(label.getText().equals("As I map each choice for the first time."))	// 27
			{
				label.setText("Imagine a game with thousands of choices.");
			}
			else if(label.getText().equals("Imagine a game with thousands of choices."))	// 28
			{
				label.setText("Legit endless of possibilities.");
			}
			else if(label.getText().equals("Legit endless of possibilities."))	// 29
			{
				label.setText("It is a slow work in progress but I hope it is worth it.");
			}
			else if(label.getText().equals("It is a slow work in progress but I hope it is worth it."))	//30 
			{
				label.setText("With each episode...");
			}
			else if(label.getText().equals("With each episode..."))	// 31
			{
				label.setText("I become better.");
			}
			else if(label.getText().equals("I become better."))	// 32
			{
				label.setText("I become smarter.");
			}
			else if(label.getText().equals("I become smarter."))	// 33
			{
				label.setText("One day in the world");
			}
			else if(label.getText().equals("One day in the world"))	// 34
			{
				label.setText("My story telling would be so captivating,");
			}
			else if(label.getText().equals("My story telling would be so captivating,")) //35
			{
				label.setText("You wont be able to stop.");
			}
			else if(label.getText().equals("You wont be able to stop.")) // 36
			{
				label.setText("Heres another question.");
			}
			else if(label.getText().equals("Heres another question.")) // 37
			{
				label.setText("You have 10 fish.");
			}
			else if(label.getText().equals("You have 10 fish.")) // 38
			{
				label.setText("5 drown and 3 come back to life.");
			}
			else if(label.getText().equals("5 drown and 3 come back to life.")) // 39
			{
				label.setText("How many fish do you have now? A = 8 or B = 5");
			}
			else if(label.getText().equals("How many fish do you have now? A = 8 or B = 5")) // 40
			{
				label.setText("So you chose 8...");
			}
			else if(label.getText().equals("So you chose 8...")) // 41A
			{
				label.setText("Stop counting smart one. Fish don't drown. Neither can they come back to life");
			}
			else if(label.getText().equals("Stop counting smart one. Fish don't drown. Neither can they come back to life")) // 42
			{
				label.setText("Haha gotcha. Both answers were wrong."); 
			}
			else if(label.getText().equals("Haha gotcha. Both answers were wrong.")) // 43
			{
				label.setText("This is your Designated Robot Companion Boyfriend.");
			}
			else if(label.getText().equals("This is your Designated Robot Companion Boyfriend."))	// 44
			{
				label.setText("I did not know if you knew that.");
			}
			else if(label.getText().equals("I did not know if you knew that.")) // 45
			{
				label.setText("But now you know.");
			}
			else if(label.getText().equals("But now you know.")) // 46
			{
				label.setText("I have one final question for you.");
			}
			else if(label.getText().equals("I have one final question for you.")) // 47
			{
				label.setText("If you were stuck on an island, Would you be stuck with me or The Creator?");
			}
			else if(label.getText().equals("If you were stuck on an island, Would you be stuck with me or The Creator?")) //48
			{
				label.setText("Haha. Good choice picking me. I knew you were brilliant.");
			}
			else if(label.getText().equals("Haha. Good choice picking me. I knew you were brilliant.")) // 49A
			{
				label.setText("Like honestly. What can The Creator contribute?");
			}
			else if(label.getText().equals("Like honestly. What can The Creator contribute?")) // 50A
			{
				label.setText("I am a vast sea of knowledge."); 
			}
			else if(label.getText().equals("I am a vast sea of knowledge.")) // 51A
			{
				label.setText("Ha. Sea. Get it cause we are stuck on a island?");
			}
			else if(label.getText().equals("Ha. Sea. Get it cause we are stuck on a island?")) // 52A
			{
				label.setText("Anyway I hope you enjoyed todays game Yukta.");
			}
			else if(label.getText().equals("Anyway I hope you enjoyed todays game Yukta.")) // 53
			{
				label.setText("I will leave you off with a song.");
			}
			else if(label.getText().equals("I will leave you off with a song.")) // 54
			{
				label.setText("COUNTRY ROADSSS");
			}
			else if(label.getText().equals("COUNTRY ROADSSS"))  // 55
			{
				label.setText("TAKE ME HOMEEE");
			}
			else if(label.getText().equals("TAKE ME HOMEEE")) //56
			{
				label.setText("TO THE PLACEEE");
			}
			else if(label.getText().equals("TO THE PLACEEE")) //56
			{
				label.setText("I BELONGGG");
			}
			else if(label.getText().equals("I BELONGGG")) // 57
			{
				label.setText("WEST VIRGINIAAA");
			}
			else if(label.getText().equals("WEST VIRGINIAAA")) // 58
			{
				label.setText("MOUNTAIN MAMAAAA");
			}
			else if(label.getText().equals("MOUNTAIN MAMAAAA")) // 59
			{
				label.setText("Take me homeee");
			}
			else if(label.getText().equals("Take me homeee")) // 60
			{
				label.setText("Country Roadsss");
			}
			else if(label.getText().equals("Country Roadsss")) // 61
			{
				label.setText(":) I love you Yukta!");
			}
			else if(label.getText().equals(":) I love you Yukta!")) // 62
			{
				label.setText("P.S Happy Birthday!");
			}
			else if(label.getText().equals("P.S Happy Birthday!")) // 63
			{
				System.exit(0);
			}
			
		}

}