package hellofx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage stage) throws Exception {
		Group g = new Group();
		Scene sc = new Scene(g, Color.BLACK);
		
		stage.setScene(sc);
		stage.setWidth(400);
		stage.setHeight(400);
		stage.setTitle("My First App");
		stage.setResizable(false);
		stage.setX(100);
		stage.setY(100);
		
		Image img = new Image("ic.png");
		stage.getIcons().add(img);
		stage.setFullScreen(true);
		stage.setFullScreenExitHint("press M to exit full screen asshole");
		stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("m"));
		stage.show();
	}

}
