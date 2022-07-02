package com.hrodriguesdev.gui.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.hrodriguesdev.gui.view.NewView;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.stage.Stage;

public class Main implements Initializable{
	private Object applications;
	private Stage stageFornoUm;
	private Stage stageFornoDois;
	
	public Main(Object applications) {
		this.applications = applications;
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {		
	}
	
	/**
	* Quando o botao é precionado
	* abre a view relacionada ao forno
	*/
	@FXML
	private void fornoUm(ActionEvent event) {
	
	/**
	* se a view já estiver aberta,
	* ela não abre outra
	*/
		if(stageFornoUm == null || !stageFornoUm.isShowing()) {
			try {
				Stage stage = new Stage();
				stage.setTitle("Forno 01");
				stageFornoUm = NewView.newViewOpen("fornoView", stage, new Forno(stage), applications, false);
		
			} catch (IOException e) {
				e.printStackTrace();
			
			}
		}
	}
	
	@FXML
	private void fornoDois(ActionEvent event) {
		if(stageFornoDois == null || !stageFornoDois.isShowing()) {
			try {
				Stage stage = new Stage();
				stage.setTitle("Forno 02");
				stageFornoUm = NewView.newViewOpen("fornoView", stage, new Forno(stage), applications, false);
		
			} catch (IOException e) {
				e.printStackTrace();
			
			}
		}
	}
}
