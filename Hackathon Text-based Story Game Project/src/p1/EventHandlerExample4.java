package p1;


import java.io.IOException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class EventHandlerExample4 extends Application
{

	public static void main(String[] args)
	{
		launch(args);
	}
	
	 public void start(Stage primaryStage) throws Exception 
	    {       
	        try
	        {
	            Parent rootContainer = FXMLLoader.load(getClass().getResource("HelloWorld!.fxml"));
	        Scene s=new Scene(rootContainer);
	        primaryStage.setScene(s);
	        primaryStage.show();
	        }
	        catch(IOException e)
	        {               
	        //          e.printStackTrace();
	        }
	}

}