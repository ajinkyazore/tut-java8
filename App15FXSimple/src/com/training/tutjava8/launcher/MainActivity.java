package com.training.tutjava8.launcher;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class MainActivity extends Application {

	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Label label = new Label("Hello World");
		label.setFont(new Font(50));
		
		Scene scene=new Scene(label);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Hello World");
		
		primaryStage.show();
		
	}

}
