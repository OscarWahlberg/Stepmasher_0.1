package view;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import stepmasher.IJsonReader;
import stepmasher.IJsonWriter;
import stepmasher.JsonReader;
import stepmasher.JsonWriter;
import stepmasher.Main;
import stepmasher.MashingProgram;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Slider;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller_root_01 implements Initializable {
	
	@FXML
	MenuItem menuItemOpen, menuItemSave;
	
	@Override
	public void initialize (URL location, ResourceBundle resources) {
		
		menuItemOpen.setOnAction(e->{
			openProgram();
		});
		
		menuItemSave.setOnAction(e->{
			saveProgram();
		});
		
	}
	
	private void openProgram(){
		final FileChooser fileChooser = new FileChooser();
		File currentDir = new File(System.getProperty("user.dir"));
		fileChooser.setInitialDirectory( currentDir);
		fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("JSON", "*.json*"));
        File file = fileChooser.showOpenDialog(null);
        if (file != null) {
            System.out.println(file);
            
			IJsonReader jsonReader = new JsonReader();
			try {
				Main.setMashingProgram(jsonReader.Read(file.getPath(), MashingProgram.class));
				Main.getMashingProgram().printMashingProgram();
				setView();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				System.out.println("Unable to open file");
			}
        }
	}
	
	private void saveProgram(){
		final FileChooser fileChooser = new FileChooser();
		File currentDir = new File(System.getProperty("user.dir"));
		fileChooser.setInitialDirectory( currentDir);
		fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("JSON", "*.json*"));
        File file = fileChooser.showSaveDialog(null);
        if (file != null) {
        	
            System.out.println(file.getPath());
			IJsonWriter jsonWriter = new JsonWriter();
			MashingProgram programToSave = Main.getMashingProgram();
			
			try {
				jsonWriter.Write(programToSave, file.getPath());
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				System.out.println("unable to save file");
			}
        }
	}
	
	private void setView(){
		
		// NAME ###############################################################
		// ####################################################################
		TextField nameTextField = (TextField) Main.scene.lookup("#textFieldName");
		String nameText = MashingProgram.getInstance().getName();
		nameTextField.setText(nameText);
		
		// DESCRIPTION ########################################################
		// ####################################################################
		TextArea descriptionTextArea = (TextArea) Main.scene.lookup("#textAreaDescription");
		String descriptionText = MashingProgram.getInstance().getDescription();
		descriptionTextArea.setText(descriptionText);
		
		// PARAMETERS #########################################################
		// ####################################################################
		Slider proportionalSlider = (Slider) Main.scene.lookup("#sliderProportional");
		int proportionalValue = MashingProgram.getInstance().getMashParameters().getProportional();
		proportionalSlider.setValue(proportionalValue);
		
		Slider integralSlider = (Slider) Main.scene.lookup("#sliderIntegral");
		int integralValue = MashingProgram.getInstance().getMashParameters().getIntegral();
		integralSlider.setValue(integralValue);
		
		Slider memorySlider = (Slider) Main.scene.lookup("#sliderMemory");
		int memoryValue = MashingProgram.getInstance().getMashParameters().getMemory();
		memorySlider.setValue(memoryValue);
		
		Slider maxOutputSlider = (Slider) Main.scene.lookup("#sliderMaxOutput");
		int maxOutputValue = MashingProgram.getInstance().getMashParameters().getMaxOutput();
		maxOutputSlider.setValue(maxOutputValue);
		
		Slider periodSlider = (Slider) Main.scene.lookup("#sliderPeriod");
		int periodValue = MashingProgram.getInstance().getMashParameters().getPwmPeriod();
		periodSlider.setValue(periodValue);
		
		// GOAL ###############################################################
		// ####################################################################
		Slider goal1Slider = (Slider) Main.scene.lookup("#sliderStep1Goal");
		int goal1Value = MashingProgram.getInstance().getMashSteps()[0].getGoalTemp();
		goal1Slider.setValue(goal1Value);
		
		Slider goal2Slider = (Slider) Main.scene.lookup("#sliderStep2Goal");
		int goal2Value = MashingProgram.getInstance().getMashSteps()[1].getGoalTemp();
		goal2Slider.setValue(goal2Value);
		
		Slider goal3Slider = (Slider) Main.scene.lookup("#sliderStep3Goal");
		int goal3Value = MashingProgram.getInstance().getMashSteps()[2].getGoalTemp();
		goal3Slider.setValue(goal3Value);
		
		Slider goal4Slider = (Slider) Main.scene.lookup("#sliderStep4Goal");
		int goal4Value = MashingProgram.getInstance().getMashSteps()[3].getGoalTemp();
		goal4Slider.setValue(goal4Value);
		
		Slider goal5Slider = (Slider) Main.scene.lookup("#sliderStep5Goal");
		int goal5Value = MashingProgram.getInstance().getMashSteps()[4].getGoalTemp();
		goal5Slider.setValue(goal5Value);
		
		// REACH ###############################################################
		// #####################################################################
		Slider reach1Slider = (Slider) Main.scene.lookup("#sliderStep1Reach");
		int reach1Value = MashingProgram.getInstance().getMashSteps()[0].getReachTemp();
		reach1Slider.setValue(reach1Value);
		
		Slider reach2Slider = (Slider) Main.scene.lookup("#sliderStep2Reach");
		int reach2Value = MashingProgram.getInstance().getMashSteps()[1].getReachTemp();
		reach2Slider.setValue(reach2Value);
		
		Slider reach3Slider = (Slider) Main.scene.lookup("#sliderStep3Reach");
		int reach3Value = MashingProgram.getInstance().getMashSteps()[2].getReachTemp();
		reach3Slider.setValue(reach3Value);
		
		Slider reach4Slider = (Slider) Main.scene.lookup("#sliderStep4Reach");
		int reach4Value = MashingProgram.getInstance().getMashSteps()[3].getReachTemp();
		reach4Slider.setValue(reach4Value);
		
		Slider reach5Slider = (Slider) Main.scene.lookup("#sliderStep5Reach");
		int reach5Value = MashingProgram.getInstance().getMashSteps()[4].getReachTemp();
		reach5Slider.setValue(reach5Value);
		
		// DURATION ############################################################
		// #####################################################################
		Slider duration1Slider = (Slider) Main.scene.lookup("#sliderStep1Duration");
		int duration1Value = MashingProgram.getInstance().getMashSteps()[0].getDuration();
		duration1Slider.setValue(duration1Value);
		
		Slider duration2Slider = (Slider) Main.scene.lookup("#sliderStep2Duration");
		int duration2Value = MashingProgram.getInstance().getMashSteps()[1].getDuration();
		duration2Slider.setValue(duration2Value);
		
		Slider duration3Slider = (Slider) Main.scene.lookup("#sliderStep3Duration");
		int duration3Value = MashingProgram.getInstance().getMashSteps()[2].getDuration();
		duration3Slider.setValue(duration3Value);
		
		Slider duration4Slider = (Slider) Main.scene.lookup("#sliderStep4Duration");
		int duration4Value = MashingProgram.getInstance().getMashSteps()[3].getDuration();
		duration4Slider.setValue(duration4Value);
		
		Slider duration5Slider = (Slider) Main.scene.lookup("#sliderStep5Duration");
		int duration5Value = MashingProgram.getInstance().getMashSteps()[4].getDuration();
		duration5Slider.setValue(duration5Value);
		
	}

}
