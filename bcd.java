package VerificasulBCD;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class bcd extends Application{

	TextField tnum= new TextField();
	Label lris= new Label();
	Label lnum= new Label("Inserire n°");
	Label lbcd= new Label("N° in BCD");
	Button bconverti= new Button("Converti");
	
	public void start(Stage finestra){

		GridPane griglia= new GridPane();
		
		griglia.add(lnum, 0, 0);
		griglia.add(tnum, 0, 1);
		griglia.add(bconverti, 0, 2);
		griglia.add(lbcd, 0, 3);
		griglia.add(lris, 0, 4);
		griglia.setHgap(10);
		griglia.setVgap(10);
		griglia.setAlignment(Pos.CENTER);
		
		Scene scena = new Scene(griglia, 350, 350);
	
		finestra.setScene(scena);
		finestra.setTitle("BCD");
		finestra.show();
		
		bconverti.setOnAction(e -> converti());
		
	}
	private void converti(){
		

	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
