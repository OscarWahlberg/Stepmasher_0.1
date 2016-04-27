package view;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import stepmasher.Main;
import stepmasher.MashingProgram;
import javafx.scene.chart.AreaChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller_setup_01 implements Initializable {

	@FXML
	Button btnGraph;
	
	@FXML
	TextField textFieldName;
	
	@FXML
	TextArea textAreaDescription;

	@FXML
	Slider sliderProportional, sliderIntegral, sliderMemory, sliderMaxOutput, sliderPeriod;

	@FXML
	Label labelProportional, labelIntegral, labelMemory, labelMaxOutput, labelPeriod;

	@FXML
	Slider sliderStep1Goal, sliderStep2Goal, sliderStep3Goal, sliderStep4Goal, sliderStep5Goal;
	@FXML
	Slider sliderStep1Reach, sliderStep2Reach, sliderStep3Reach, sliderStep4Reach, sliderStep5Reach;
	@FXML
	Slider sliderStep1Duration, sliderStep2Duration, sliderStep3Duration, sliderStep4Duration, sliderStep5Duration;

	@FXML
	Label labelStep1Goal, labelStep2Goal, labelStep3Goal, labelStep4Goal, labelStep5Goal;
	@FXML
	Label labelStep1Reach, labelStep2Reach, labelStep3Reach, labelStep4Reach, labelStep5Reach;
	@FXML
	Label labelStep1Duration, labelStep2Duration, labelStep3Duration, labelStep4Duration, labelStep5Duration;

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		btnGraph.setOnAction(e -> {
			showGraph();
		});
		
		textFieldName.textProperty().addListener((observable, oldValue, newValue) -> {
			MashingProgram.getInstance().setName(newValue);
		});

		textAreaDescription.textProperty().addListener((observable, oldValue, newValue) -> {
			MashingProgram.getInstance().setDescription(newValue);
		});
		
		// #### Parameter-Sliders
		// #########################################################
		sliderProportional.valueProperty().addListener((observable, oldValue, newValue) -> {
			int value = newValue.intValue();
			labelProportional.textProperty().setValue(String.valueOf(value));
			MashingProgram.getInstance().getMashParameters().setProportional(value);
		});

		sliderIntegral.valueProperty().addListener((observable, oldValue, newValue) -> {
			int value = newValue.intValue();
			labelIntegral.textProperty().setValue(String.valueOf(value));
			MashingProgram.getInstance().getMashParameters().setIntegral(value);
		});

		sliderMemory.valueProperty().addListener((observable, oldValue, newValue) -> {
			int value = newValue.intValue();
			labelMemory.textProperty().setValue(String.valueOf(value));
			MashingProgram.getInstance().getMashParameters().setMemory(value);
			
		});

		sliderMaxOutput.valueProperty().addListener((observable, oldValue, newValue) -> {			
			int value = newValue.intValue();
			labelMaxOutput.textProperty().setValue(String.valueOf(value));
			MashingProgram.getInstance().getMashParameters().setMaxOutput(value);
		
		});

		sliderPeriod.valueProperty().addListener((observable, oldValue, newValue) -> {			
			int value = newValue.intValue();
			labelPeriod.textProperty().setValue(String.valueOf(value));
			MashingProgram.getInstance().getMashParameters().setPwmPeriod(value);
		});

		// #### GOAL-SLIDERS
		// ##############################################################
		sliderStep1Goal.valueProperty().addListener((observable, oldValue, newValue) -> {
			int value = newValue.intValue();
			labelStep1Goal.textProperty().setValue(String.valueOf(value));
			MashingProgram.getInstance().getMashSteps()[0].setGoalTemp(value);
		});

		sliderStep2Goal.valueProperty().addListener((observable, oldValue, newValue) -> {
			int value = newValue.intValue();
			labelStep2Goal.textProperty().setValue(String.valueOf(value));
			MashingProgram.getInstance().getMashSteps()[1].setGoalTemp(value);
		});

		sliderStep3Goal.valueProperty().addListener((observable, oldValue, newValue) -> {
			int value = newValue.intValue();
			labelStep3Goal.textProperty().setValue(String.valueOf(value));
			MashingProgram.getInstance().getMashSteps()[2].setGoalTemp(value);
		});

		sliderStep4Goal.valueProperty().addListener((observable, oldValue, newValue) -> {
			int value = newValue.intValue();
			labelStep4Goal.textProperty().setValue(String.valueOf(value));
			MashingProgram.getInstance().getMashSteps()[3].setGoalTemp(value);
		});

		sliderStep5Goal.valueProperty().addListener((observable, oldValue, newValue) -> {
			int value = newValue.intValue();
			labelStep5Goal.textProperty().setValue(String.valueOf(value));
			MashingProgram.getInstance().getMashSteps()[4].setGoalTemp(value);
		});

		// #### REACH-SLIDERS
		// ################################################################
		sliderStep1Reach.valueProperty().addListener((observable, oldValue, newValue) -> {
			int value = newValue.intValue();
			labelStep1Reach.textProperty().setValue(String.valueOf(value));
			MashingProgram.getInstance().getMashSteps()[0].setReachTemp(value);
		});

		sliderStep2Reach.valueProperty().addListener((observable, oldValue, newValue) -> {
			int value = newValue.intValue();
			labelStep2Reach.textProperty().setValue(String.valueOf(value));
			MashingProgram.getInstance().getMashSteps()[1].setReachTemp(value);
		});

		sliderStep3Reach.valueProperty().addListener((observable, oldValue, newValue) -> {
			int value = newValue.intValue();
			labelStep3Reach.textProperty().setValue(String.valueOf(value));
			MashingProgram.getInstance().getMashSteps()[2].setReachTemp(value);
		});

		sliderStep4Reach.valueProperty().addListener((observable, oldValue, newValue) -> {
			int value = newValue.intValue();
			labelStep4Reach.textProperty().setValue(String.valueOf(value));
			MashingProgram.getInstance().getMashSteps()[3].setReachTemp(value);
		});

		sliderStep5Reach.valueProperty().addListener((observable, oldValue, newValue) -> {
			int value = newValue.intValue();
			labelStep5Reach.textProperty().setValue(String.valueOf(value));
			MashingProgram.getInstance().getMashSteps()[4].setReachTemp(value);
		});

		// #### DURATION-SLIDERS
		// ##############################################################
		sliderStep1Duration.valueProperty().addListener((observable, oldValue, newValue) -> {
			int value = newValue.intValue();
			labelStep1Duration.textProperty().setValue(String.valueOf(value));
			MashingProgram.getInstance().getMashSteps()[0].setDuration(value);
		});

		sliderStep2Duration.valueProperty().addListener((observable, oldValue, newValue) -> {
			int value = newValue.intValue();
			labelStep2Duration.textProperty().setValue(String.valueOf(value));
			MashingProgram.getInstance().getMashSteps()[1].setDuration(value);
		});

		sliderStep3Duration.valueProperty().addListener((observable, oldValue, newValue) -> {
			int value = newValue.intValue();
			labelStep3Duration.textProperty().setValue(String.valueOf(value));
			MashingProgram.getInstance().getMashSteps()[2].setDuration(value);
		});

		sliderStep4Duration.valueProperty().addListener((observable, oldValue, newValue) -> {
			int value = newValue.intValue();
			labelStep4Duration.textProperty().setValue(String.valueOf(value));
			MashingProgram.getInstance().getMashSteps()[3].setDuration(value);
		});

		sliderStep5Duration.valueProperty().addListener((observable, oldValue, newValue) -> {
			int value = newValue.intValue();
			labelStep5Duration.textProperty().setValue(String.valueOf(value));
			MashingProgram.getInstance().getMashSteps()[4].setDuration(value);
		});
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	protected void showGraph() {
			
			XYChart.Series mashProgramSeries = generateSeries();

			final NumberAxis xAxis = new NumberAxis();
			final NumberAxis yAxis = new NumberAxis();
			final AreaChart<Number, Number> ac = new AreaChart<Number, Number>(xAxis, yAxis);
			ac.setTitle("Mashing Program Graph (in minutes and degrees C*)");

			ac.getData().addAll(mashProgramSeries);

			Main.root.setCenter(ac);

	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private XYChart.Series generateSeries(){
		XYChart.Series mashProgramSeries = new XYChart.Series();
		mashProgramSeries.setName("Mash Program Series");
		
		int minutes = 0;
		int goal = 0;
		for (int i = 0; i < 5; i++) {
			mashProgramSeries.getData().add(new XYChart.Data(minutes, goal));
			int diff = MashingProgram.getInstance().getMashSteps()[i].getGoalTemp() - goal;
			goal = MashingProgram.getInstance().getMashSteps()[i].getGoalTemp();
			minutes += diff / 5;
			mashProgramSeries.getData().add(new XYChart.Data(minutes, goal));
			minutes += MashingProgram.getInstance().getMashSteps()[i].getDuration();
		}
		mashProgramSeries.getData().add(new XYChart.Data(minutes, goal));
		
		return mashProgramSeries;
	}

}
