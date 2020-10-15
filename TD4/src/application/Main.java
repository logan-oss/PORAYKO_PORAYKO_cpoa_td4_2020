package application;
	
import java.io.IOException;
import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;


public class Main extends Application {
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("modele.fxml"));
        primaryStage.setTitle("Application JavaFX");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
	}

	
	public static void main(String[] args) {
		launch(args);
	}
}
