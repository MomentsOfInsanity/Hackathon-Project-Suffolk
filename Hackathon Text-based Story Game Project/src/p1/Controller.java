package p1;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller implements Initializable
{
	@FXML
	private Button button;
	@FXML
	private Button button2;
	
	@FXML 
	private Label label;

	
	@FXML // Button 1
	public void option1(ActionEvent e)
	{
		if(label.getText().equals("Darkness Surrounds you. Press a button to wake up."))
		{
			label.setText("You wake up and find yourself in an\r\n" + 
					"abandoned alleyway. There's blood\r\n" + 
					"dripping down your forehead.\r\n" + 
					"1) Wipe the blood off\r\n" + 
					"2) Let it be.\r\n" + 
					"");
		}
		else if(label.getText().equals("You wake up and find yourself in an\r\n" + 
				"abandoned alleyway. There's blood\r\n" + 
				"dripping down your forehead.\r\n" + 
				"1) Wipe the blood off\r\n" + 
				"2) Let it be.\r\n" + 
				""))
		{
			label.setText("You wipe the blood off your forehead. Making the night\r\n" + 
					"more visible. You can see the end of the alley in the\r\n" + 
					"faint moonlight.\r\n" + 
					"Press to continue...");
		}
		else if(label.getText().equals("You wipe the blood off your forehead. Making the night\r\n" + 
				"more visible. You can see the end of the alley in the\r\n" + 
				"faint moonlight.\r\n" + 
				"Press to continue..."))
		{
			label.setText("You reach the end of the alleyway. The night is dark.\r\n" + 
					"You feel the wind picking up. The night is becoming\r\n" + 
					"chillier by the second. You look to your left. A faint glow\r\n" + 
					"of incandescence is visible to you far out in the\r\n" + 
					"distance. While the right is oozing the same darkness\r\n" + 
					"that you currently reside in.\r\n" + 
					"1) Go left\r\n" + 
					"2) Go right");
		}
		else if(label.getText().equals("You reach the end of the alleyway. The night is dark.\r\n" + 
				"You feel the wind picking up. The night is becoming\r\n" + 
				"chillier by the second. You look to your left. A faint glow\r\n" + 
				"of incandescence is visible to you far out in the\r\n" + 
				"distance. While the right is oozing the same darkness\r\n" + 
				"that you currently reside in.\r\n" + 
				"1) Go left\r\n" + 
				"2) Go right"))
		{
			label.setText("You head towards the glow. On your journey towards\r\n" + 
					"the light you hear a faint growl near an abandoned\r\n" + 
					"wagon situated on the side of the path.\r\n" + 
					"1) Approach the wagon\r\n" + 
					"2) Ignore it");
		}
		else if(label.getText().equals("You head towards the glow. On your journey towards\r\n" + 
				"the light you hear a faint growl near an abandoned\r\n" + 
				"wagon situated on the side of the path.\r\n" + 
				"1) Approach the wagon\r\n" + 
				"2) Ignore it"))
		{
			label.setText("You cautiously approach the wagon. The growl grows\r\n" + 
					"larger with every step. The calm beat of your heart is\r\n" + 
					"racing. You slowly look inside the wagon, nothing's\r\n" + 
					"there. You bend your knees and tilt your head slightly to\r\n" + 
					"look under it. You see glowing eyes looking back at you.\r\n" + 
					"Press to continue...");
		}
		else if(label.getText().equals("You cautiously approach the wagon. The growl grows\r\n" + 
				"larger with every step. The calm beat of your heart is\r\n" + 
				"racing. You slowly look inside the wagon, nothing's\r\n" + 
				"there. You bend your knees and tilt your head slightly to\r\n" + 
				"look under it. You see glowing eyes looking back at you.\r\n" + 
				"Press to continue..."))
		{
			label.setText("\"Hey there, little buddy.\" Before long a furry surface\r\n" + 
					"emerges from the shadow underneath the wagon. The\r\n" + 
					"creature changes between the sounds of focused\r\n" + 
					"whimpers and barks directed at you.\r\n" + 
					"1) Pet the dog\r\n" + 
					"2) Do nothing and move on\r\n" + 
					"");
		}
		else if(label.getText().equals("\"Hey there, little buddy.\" Before long a furry surface\r\n" + 
				"emerges from the shadow underneath the wagon. The\r\n" + 
				"creature changes between the sounds of focused\r\n" + 
				"whimpers and barks directed at you.\r\n" + 
				"1) Pet the dog\r\n" + 
				"2) Do nothing and move on\r\n" + 
				""))
		{
			label.setText("The dog cuddles up next to you. Giving you a sense of\r\n" + 
					"warmth, you haven't felt in a while. A moment later he\r\n" + 
					"whisks away and bring you a steel rod.\r\n" + 
					"1) Take the rod\r\n" + 
					"2) Play fetch");
		}
		else if(label.getText().equals("The dog cuddles up next to you. Giving you a sense of\r\n" + 
				"warmth, you haven't felt in a while. A moment later he\r\n" + 
				"whisks away and bring you a steel rod.\r\n" + 
				"1) Take the rod\r\n" + 
				"2) Play fetch"))
		{
			label.setText("That is the end of the current story.\nThank you for playing");
		}
		else if(label.getText().equals("That is the end of the current story.\nThank you for playing"))
		{
			label.setText("Would you like to try again? Yes for 1 and No for 2");
		}
		else if(label.getText().equals("Would you like to try again? Yes for 1 and No for 2"))
		{
			label.setText("Darkness Surrounds you. Press a button to wake up.");
		}
		
		/////////
		else if(label.getText().equals("Your visibility is reduced and you aren't able to make\r\n" + 
				"out anything through the thick shadows of the alleyway.\r\n" + 
				"1) Go back to sleep.\r\n" + 
				"2) Get up and look for help.\r\n" + 
				""))
		{
			label.setText("You drift back to sleep. The blood loss becomes severe\r\n" + 
					"enough to put you in an eternal slumber");
		}
		else if(label.getText().equals("You drift back to sleep. The blood loss becomes severe\r\n" + 
				"enough to put you in an eternal slumber"))
		{
			label.setText("Would you like to try again? Yes for 1 and No for 2");
		}
		else if(label.getText().equals("Would you like to try again? Yes for 1 and No for 2"))
		{
			label.setText("Darkness Surrounds you. Press a button to wake up.");
		}
		else if(label.getText().equals("Darkness Surrounds you. Press a button to wake up."))
		{
			label.setText("You wake up and find yourself in an\r\n" + 
					"abandoned alleyway. There's blood\r\n" + 
					"dripping down your forehead.\r\n" + 
					"1) Wipe the blood off\r\n" + 
					"2) Let it be.\r\n" + 
					"");
		}
		else if(label.getText().equals("You think to yourself, it isn't worth the time. You need\r\n" + 
				"help. You need to know where you are. Press to continue..."))
		{
			label.setText("Thank you for playing.");
		}
		else if(label.getText().equals("Thank you for playing."))
		{
			label.setText("Would you like to try again? Yes for 1 and No for 2");
		}
		else if(label.getText().equals("Would you like to try again? Yes for 1 and No for 2"))
		{
			label.setText("Darkness Surrounds you. Press a button to wake up.");
		}
		else if(label.getText().equals("You decide to go right. You keep walking and walking\r\n" + 
				"deeper into the darkness. It's not long before you\r\n" + 
				"realize the darkness engulfs you leaving you an empty\r\n" + 
				"shell.\r\n" + 
				""))
		{
			label.setText("Would you like to try again? Yes for 1 and No for 2");
		}
		else if(label.getText().equals("Would you like to try again? Yes for 1 and No for 2"))
		{
			label.setText("Darkness Surrounds you. Press a button to wake up.");
		}
		
	}
	
	@FXML // button 2
	public void option2(ActionEvent e)
	{
		if(label.getText().equals("Darkness Surrounds you. Press a button to wake up."))
		{
			label.setText("You wake up and find yourself in an\r\n" + 
					"abandoned alleyway. There's blood\r\n" + 
					"dripping down your forehead.\r\n" + 
					"1) Wipe the blood off\r\n" + 
					"2) Let it be.\r\n" + 
					"");
		}
		else if(label.getText().equals("You wake up and find yourself in an\r\n" + 
				"abandoned alleyway. There's blood\r\n" + 
				"dripping down your forehead.\r\n" + 
				"1) Wipe the blood off\r\n" + 
				"2) Let it be.\r\n" + 
				""))
		{
			label.setText("Your visibility is reduced and you aren't able to make\r\n" + 
					"out anything through the thick shadows of the alleyway.\r\n" + 
					"1) Go back to sleep.\r\n" + 
					"2) Get up and look for help.\r\n" + 
					"");
		}
		else if(label.getText().equals("Your visibility is reduced and you aren't able to make\r\n" + 
				"out anything through the thick shadows of the alleyway.\r\n" + 
				"1) Go back to sleep.\r\n" + 
				"2) Get up and look for help.\r\n" + 
				""))
		{
			label.setText("You get up. Step by step, you slowly make your way\r\n" + 
					"through the maze of shadows eventually bumping your\r\n" + 
					"foot against an indent in the ground. You take a\r\n" + 
					"stumble . Your head hits the side of a rectangular object\r\n" + 
					"breaking your neck instantly, leaving your body cold\r\n" + 
					"in the dumps.\r\n" + 
					"");
		}
		else if(label.getText().equals("You get up. Step by step, you slowly make your way\r\n" + 
				"through the maze of shadows eventually bumping your\r\n" + 
				"foot against an indent in the ground. You take a\r\n" + 
				"stumble . Your head hits the side of a rectangular object\r\n" + 
				"breaking your neck instantly, leaving your body cold\r\n" + 
				"in the dumps.\r\n" + 
				""))
		{
			label.setText("Would you like to try again? Yes for 1 and No for 2");
		}
		else if(label.getText().equals("Would you like to try again? Yes for 1 and No for 2"))
		{
			System.exit(0);
		}
		/////////
		else if(label.getText().equals("You wipe the blood off your forehead. Making the night\r\n" + 
				"more visible. You can see the end of the alley in the\r\n" + 
				"faint moonlight.\r\n" + 
				"Press to continue..."))
		{
			label.setText("You reach the end of the alleyway. The night is dark.\r\n" + 
					"You feel the wind picking up. The night is becoming\r\n" + 
					"chillier by the second. You look to your left. A faint glow\r\n" + 
					"of incandescence is visible to you far out in the\r\n" + 
					"distance. While the right is oozing the same darkness\r\n" + 
					"that you currently reside in.\r\n" + 
					"1) Go left\r\n" + 
					"2) Go right");
		}
		else if(label.getText().equals("You reach the end of the alleyway. The night is dark.\r\n" + 
				"You feel the wind picking up. The night is becoming\r\n" + 
				"chillier by the second. You look to your left. A faint glow\r\n" + 
				"of incandescence is visible to you far out in the\r\n" + 
				"distance. While the right is oozing the same darkness\r\n" + 
				"that you currently reside in.\r\n" + 
				"1) Go left\r\n" + 
				"2) Go right"))
		{
			label.setText("You decide to go right. You keep walking and walking\r\n" + 
					"deeper into the darkness. It's not long before you\r\n" + 
					"realize the darkness engulfs you leaving you an empty\r\n" + 
					"shell.\r\n" + 
					"");
		}
		else if(label.getText().equals("You decide to go right. You keep walking and walking\r\n" + 
				"deeper into the darkness. It's not long before you\r\n" + 
				"realize the darkness engulfs you leaving you an empty\r\n" + 
				"shell.\r\n" + 
				""))
		{
			label.setText("Would you like to try again? Yes for 1 and No for 2");
		}
		else if(label.getText().equals("Would you like to try again? Yes for 1 and No for 2"))
		{
			System.exit(0);
		}
		//////
		else if(label.getText().equals("You drift back to sleep. The blood loss becomes severe\r\n" + 
				"enough to put you in an eternal slumber"))
		{
			label.setText("Would you like to try again? Yes for 1 and No for 2");
		}
		else if(label.getText().equals("Would you like to try again? Yes for 1 and No for 2"))
		{
			System.exit(0);
		}
		///
		else if(label.getText().equals("You head towards the glow. On your journey towards\r\n" + 
				"the light you hear a faint growl near an abandoned\r\n" + 
				"wagon situated on the side of the path.\r\n" + 
				"1) Approach the wagon\r\n" + 
				"2) Ignore it"))
		{
			label.setText("You think to yourself, it isn't worth the time. You need\r\n" + 
					"help. You need to know where you are. Press to continue...");
		}
		else if(label.getText().equals("You think to yourself, it isn't worth the time. You need\r\n" + 
				"help. You need to know where you are. Press to continue..."))
		{
			label.setText("Thank you for playing.");
		}
		else if(label.getText().equals("That is the end of the current story.\nThank you for playing"))
		{
			label.setText("Would you like to try again? Yes for 1 and No for 2");
		}
		else if(label.getText().equals("Would you like to try again? Yes for 1 and No for 2"))
		{
			System.exit(0);
		}
		

		
	}
	
	@FXML
	public void doThis(EventHandler e) {
		
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) 
	{
		
		label.setText("Darkness Surrounds you. Press a button to wake up.");
		
		
	}

}
