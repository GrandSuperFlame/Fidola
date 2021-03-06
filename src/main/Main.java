package main;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Accordion;
import javafx.scene.control.Label;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.VBox;

public class Main extends Application{
	
	

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
        Accordion accordion = new Accordion();

        TitledPane pane1 = new TitledPane("Boats" , new Label("Show all boats available"));
        TitledPane pane2 = new TitledPane("Cars"  , new Label("Show all cars available"));
        TitledPane pane3 = new TitledPane("Planes", new Label("Show all planes available"));

        accordion.getPanes().add(pane1);
        accordion.getPanes().add(pane2);
        accordion.getPanes().add(pane3);

        VBox vBox = new VBox(accordion);
        Scene scene = new Scene(vBox);

        primaryStage.setScene(scene);

        primaryStage.show();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) 
	{
		// main GUI
		launch(args);
		
	}

}
