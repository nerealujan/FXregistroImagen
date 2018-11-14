package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	
	private AnchorPane mypane;
	
	@Override
	public void start(Stage stage) throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("SignUpImagen.fxml"));
		
		mypane = (AnchorPane) loader.load();
		stage.setScene(new Scene(mypane));
		stage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
