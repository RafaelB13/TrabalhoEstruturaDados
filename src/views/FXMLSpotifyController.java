/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Rafael Borges
 * @author Jessica Correia
 */
public class FXMLSpotifyController implements Initializable {

    /**
     * Initializes the controller class.
     * Atributos (OBS é necessário inicialiar com @FXML antes)
     */
    @FXML
    private Label teste, status;
    
    @FXML
    private ImageView btnPause, btnStop, btnPlay;

    

    
    /**
     * Eventos da tela Principal
     * @param event
     * @throws IOException 
     */
    @FXML
    private void clicando(MouseEvent event) throws IOException {
//        System.out.println("You clicked me!");
//        teste.setText("Hello World!");


        Stage stage = null;
        AnchorPane newScene = null;

        //Selecionando o layout FXML tela de reprodução
        if (event.getSource() == teste) {
            stage = (Stage) teste.getScene().getWindow();
            newScene = FXMLLoader.load(getClass().getResource("FXMLReproducao.fxml"));

        }
        //exibindo o layout selecionando
        stage.setScene(new Scene(newScene));
        stage.setTitle("Reproduçao");
        stage.show();
    }
    //Fim dos eventos Tela principal
    
    
    
    /**
     * Eventos de Click dos botões da tela de reprodução
     * @param event 
     */
    //Botão de pouse
    @FXML    
    public void pause(MouseEvent event) {
        status.setText("Pausado");
    }

    //Botão Stop
    @FXML
    public void stop(MouseEvent event) {
        status.setText("Parado");
    }

    //Botão Play
    @FXML
    public void play(MouseEvent event) {
        status.setText("Reproduzindo");
    }
    //Fim dos Eventos da tela de reprodução
    
    
    
    /**
     * Metodo de inicialização
     * @param url
     * @param rb 
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {



    }

}
