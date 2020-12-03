package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;



public class Main extends Application {
	@Override
	public void start(Stage Stage) {
		
		try {
			Parent root = FXMLLoader.load(getClass().getResource("../View/Menu.fxml"));
			Scene scene = new Scene(root);
			
			Stage.setScene(scene);
			Stage.setTitle("Sistema de academia");
			Stage.setResizable(false);
			Stage.show();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	public static void main(String[] args) {
		launch(args);
		
	
	}
}
