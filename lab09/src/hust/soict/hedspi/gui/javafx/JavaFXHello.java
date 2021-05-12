package hust.soict.hedspi.gui.javafx;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Button;


public class JavaFXHello extends Application {
	private Button btnHello;
	@Override
	public void start(Stage primaryStage) {
		try {
			Button btnHello = new Button();
			btnHello.setText("Say Hello");
			btnHello.setOnAction(evt -> System.out.println("Hello World!"));
			StackPane root = new StackPane();
			root.getChildren().add(btnHello);
			Scene scene = new Scene(root,400,400);
			primaryStage.setScene(scene);
			primaryStage.setTitle("Hello");
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}