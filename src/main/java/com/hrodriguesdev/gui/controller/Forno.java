package com.hrodriguesdev.gui.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Forno implements Initializable{
	private Stage stage;
	@FXML
	private Text forno;
	
	public Forno(Stage stage) {
		this.stage = stage;
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		forno.setText( stage.getTitle() );
	}
	
	

}
