/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 *
 * @author Petri Rämö
 * Opiskelijanro:0438578
 * 20.11.2016
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Button saveButton;
    @FXML
    private TextField textField;
    @FXML
    private Button loadButton;
    @FXML
    private TextField nameField;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleSaveAction(ActionEvent event) throws FileNotFoundException {
        PrintWriter out = new PrintWriter(nameField.getText());
        out.write(textField.getText());
        out.close();
        textField.clear();
    }
    

    @FXML
    private void handleLoadAction(ActionEvent event) throws FileNotFoundException, IOException {
        textField.clear();
        BufferedReader in = new BufferedReader(new FileReader(nameField.getText()));
        String s;
        while ((s = in.readLine()) != null) {
            textField.setText(s);
        }
        in.close();
    }
    
}
