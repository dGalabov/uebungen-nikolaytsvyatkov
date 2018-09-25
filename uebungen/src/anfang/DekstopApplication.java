package anfang;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class DekstopApplication extends Application {
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) {
		Label joke= new Label("There are three kinds of mathematicians:" +"those who can count and those who cannot!");
		
		StackPane root=new StackPane();
		root.getChildren().add(joke);
		
		Scene scene=new Scene(root, 500, 250);
		
		primaryStage.setTitle("Mathematical Joke");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
