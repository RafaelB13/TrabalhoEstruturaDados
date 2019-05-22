/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import classes.Album;
import classes.Artista;
import classes.Arvore;
import classes.Musica;
import estruturas.Pilha;
import estruturas.listaduplamente.ListaDuplamente;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
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
    private Label teste, status, artista1, labelArtistas;
    
    @FXML
    private ImageView btnPause, btnStop, btnPlay;
    
    @FXML
    private TextField pesquisar;
    
    Artista redhot;
    Album a1;

    

    
    /**
     * Eventos da tela Principal
     * @param event
     * @throws IOException 
     */
    @FXML
    private void clicando(MouseEvent event) throws IOException {
//        System.out.println("You clicked me!");
//        teste.setText("Hello World!");


//        Stage stage = null;
//        AnchorPane newScene = null;
//
//        //Selecionando o layout FXML tela de reprodução
//        if (event.getSource() == teste) {
//            stage = (Stage) teste.getScene().getWindow();
//            newScene = FXMLLoader.load(getClass().getResource("FXMLReproducao.fxml"));
//
//        }
//        //exibindo o layout selecionando
//        stage.setScene(new Scene(newScene));
//        stage.setTitle("Reproduçao");
//        stage.show();
    }
    //Fim dos eventos Tela principal
    
    @FXML
    private void artista(MouseEvent event){
        
        listaDeArtistas();
        
        String nome = pesquisar.getText().toString();
        
        if(nome.equals(redhot.getCantor())){
            artista1.setText(redhot.getCantor());
            
            
        }else
            artista1.setText("Não localizado"); 
    }
    
    @FXML
    private void exibirAlbum(MouseEvent event){
        listaDeArtistas();
        if(!artista1.getText().equals("") && artista1.getText().equals("Red Hot")){
            artista1.setText(redhot.albuns.toString());
        }
        
        
    }
    
    @FXML
    private void exibirArtista(MouseEvent event){
        listaDeArtistas();
        artista1.setText(redhot.getCantor().toString());
        
    }
    
    @FXML
    private void pesquisarArtista(KeyEvent event){
        
        
        
        if (pesquisar.getCharacters().equals("R")) {
            
        }
    }
    
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
    
    public void listaDeArtistas(){
        Musica m1 = new Musica("Can't Stop", "C:/Users/Red Hot");
        Musica m2 = new Musica("By the Way", "C:/Users/Red Hot");
        Musica m3 = new Musica("Universally Speaking", "C:/Users/Red Hot");
        Pilha<Musica> songs1 = new Pilha<Musica>(11);
        songs1.inserir(m1);
        songs1.inserir(m2);
        songs1.inserir(m3);        
        Pilha<Musica> songs2 = new Pilha<Musica>(11);
        songs2.inserir(m1);
        songs2.inserir(m2);
        songs2.inserir(m3);        
        a1 = new Album(songs1, "Greates Hits");
        Album a2 = new Album(songs2, "Californication");
        ListaDuplamente<Album> album = new ListaDuplamente<>();
        album.inserir(a1);
        album.inserir(a2);
        redhot = new Artista("Red Hot", "Rock", album);
        Arvore av = new Arvore();
        av.inserirNo(redhot);
    }
    
    /**
     * Metodo de inicialização
     * @param url
     * @param rb 
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {



    }

}
