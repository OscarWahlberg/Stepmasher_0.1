package stepmasher;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

public class Main extends Application {

	public static BorderPane root = null;
	private static MashingProgram mashingProgram;
	int test = 0;
	public static Scene scene;

	@Override
	public void start(Stage primaryStage) throws IOException {

		FXMLLoader fxmlLoaderRoot = new FXMLLoader();
		fxmlLoaderRoot.setLocation(Main.class.getResource("/view/View_main_borderpane_01.fxml"));

		FXMLLoader fxmlLoaderSetup = new FXMLLoader();
		fxmlLoaderSetup.setLocation(Main.class.getResource("/view/View_setup_01.fxml"));
		HBox setup = null;

		try {
			root = fxmlLoaderRoot.load();
			setup = fxmlLoaderSetup.load();
		} catch (IOException e) {

			e.printStackTrace();
		}

		root.setCenter(setup);

		 scene = new Scene(root);
		

		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setTitle("StepMasher 0.1");
		primaryStage.setResizable(false);
		primaryStage.setScene(scene);
		primaryStage.show();

		MashStep mashStep1 = new MashStep(0, 0, 0);
		mashStep1.printStep();

		MashParameters mashParameters1 = new MashParameters(0, 0, 1, 100, 1);
		mashParameters1.printParameters();

		mashingProgram = MashingProgram.getInstance();
		mashingProgram.setName("");
		mashingProgram.setDescription("");
		mashingProgram.mashParameters = mashParameters1;
		mashingProgram.mashSteps = new MashStep[] { new MashStep(0, 0, 0), new MashStep(0, 0, 0), new MashStep(0, 0, 0),
				new MashStep(0, 0, 0), new MashStep(0, 0, 0) };

		mashingProgram.printMashingProgram();

	}

	public static MashingProgram getMashingProgram() {
		return MashingProgram.getInstance();
	}

	public static void setMashingProgram(MashingProgram mashingProgram) {
		MashingProgram.setInstance(mashingProgram);
	}

	public static void main(String[] args) {
		launch(args);
	}

}