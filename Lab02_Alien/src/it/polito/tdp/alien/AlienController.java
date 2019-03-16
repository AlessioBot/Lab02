package it.polito.tdp.alien;

/**
 * Sample Skeleton for 'Alien.fxml' Controller Class
 */



import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AlienController {
	
	AlienDictionary dictionary;
	
    @FXML
    private ResourceBundle resources;
    @FXML
    private URL location;
    @FXML
    private TextField txtWord;
    @FXML
    private TextArea txtResult;
    @FXML
    private Button btnTranslate;
    @FXML
    private Button btnReset;
        
    
    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
    	assert txtWord != null : "fx:id=\"txtWord\" was not injected: check your FXML file 'Alien.fxml'.";
    	assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Alien.fxml'.";
    	assert btnTranslate != null : "fx:id=\"bntTranslate\" was not injected: check your FXML file 'Alien.fxml'.";
    	assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Alien.fxml'.";
    	
    }
  
    
    @FXML
    void doTranslate(ActionEvent event) {
    	String word = txtWord.getText().trim().toLowerCase();
    	if(word.contains(" ")==true) {
    		String alienWord = word.split(" ")[0];
    		String translation = word.split(" ")[1];
    		if( alienWord.matches("[a-zA-Z]*") && translation.matches("[a-zA-Z]*")) {
    			dictionary.addWord(alienWord, translation);
    			txtResult.appendText("Aggiunta parola "+alienWord+" al dizionario.\n");
    			txtWord.clear();
    		}
    	}
    	else {
    		if(word.matches("[a-zA-Z]*")) {
    			if(dictionary.translateWord(word)==null) {
    				txtResult.appendText("Parola inesistente\n");
        			txtWord.clear();
    			}
    			txtResult.appendText(dictionary.translateWord(word));
    			txtWord.clear();
    		}
    	}
    	    	
    }
    
    
    @FXML
    void doReset(ActionEvent event) {

    }
    
}
