/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import classes.*;
import com.sun.javafx.beans.event.AbstractNotifyListener;
import com.sun.javafx.binding.BindingHelperObserver;
import estruturas.Pilha;
import estruturas.listaduplamente.ListaDuplamente;

import java.io.IOException;
import java.net.URL;

import static java.util.Collections.list;

import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import estruturas.listaduplamente.NoL;
import javafx.application.Application;
import javafx.beans.Observable;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author Rafael Borges
 * @author Jessica Correia
 */
public class FXMLSpotifyController implements Initializable {

    @FXML
    private Label teste, status, nomeArtista, labelArtistas, album1, album2, album3, album4,
            listaMusicas, listaMusicas2, listaMusicas3, listaMusicas4;
    @FXML
    private ImageView btnPause, btnStop, btnPlay;
    @FXML
    private TextField txtPesquisar;
    @FXML
    private Button btnPesquisar, btnA, btnB, btnC, btnD, btnE, btnF, btnG, btnH, btnI, btnJ,
            btnK, btnL, btnM, btnN, btnO, btnP, btnQ, btnR, btnS, btnT, btnU, btnV, btnW, btnX, btnY, btnZ;

    Pilha<Musica> songs1, songs2, songs3, songs4, songs5, songs6, songs7, songs8, songs9, songs10;
    Album a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13;
    ListaDuplamente<Album> lAlbum1, lAlbum2, lAlbum3, lAlbum4, lAlbum5, lAlbum6, lAlbum7, lAlbum8, lAlbum9, lAlbum10;

    Arvore arvore = Arvore.getInstancia();

    @FXML
    private void buscaDeArtista(MouseEvent event) {
        listaDeArtistas();

        Artista redhot = new Artista("Red Hot Chilli Peppers", "Rock", lAlbum2);
        Artista linkinPark = new Artista("Linkin Park", "Rock", lAlbum1);
        Artista demilovato = new Artista("Demi Lovato", "Pop", lAlbum3);

        arvore.inserirNo(linkinPark); 
        arvore.inserirNo(demilovato);
        arvore.inserirNo(redhot);

        if (txtPesquisar.getText().equals(linkinPark.getCantor()) || txtPesquisar.getText().equals("l")) {

            nomeArtista.setText(arvore.buscaNo(linkinPark).toString());
            album1.setText(a1.titulo);
            listadeMusicas(songs1);
            
        }else if(txtPesquisar.getText().equals(redhot.getCantor()) || txtPesquisar.getText().equals("r")){
            nomeArtista.setText(arvore.buscaNo(demilovato).toString());
            album1.setText(a2.titulo);
            listadeMusicas(songs2);
        }else if(txtPesquisar.getText().equals("") ){
            nomeArtista.setText("Não Encontrado");
            album1.setText("");
            album2.setText("");
            album3.setText("");
            album4.setText("");
            listaMusicas.setText("");
        }    

    }

    @FXML
    private void exibirArtista(MouseEvent event) {

    }

    @FXML
    private void exibirAlbuns(MouseEvent event) {

    }

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

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    public void listaDeArtistas() {
        Musica linkin1 = new Musica("Breaking the Habit", "C/Users/LinkinPark/Meteora");
        Musica linkin2 = new Musica("Don't Stay", "C/Users/LinkinPark/Meteora");
        Musica linkin3 = new Musica("Faint", "C/Users/LinkinPark/Meteora");
        Musica linkin4 = new Musica("Figure.09", "C/Users/LinkinPark/Meteora");
        Musica linkin5 = new Musica("Foreword", "C/Users/LinkinPark/Meteora");
        Musica linkin6 = new Musica("Hit the Floor", "C/Users/LinkinPark/Meteora");
        Musica linkin7 = new Musica("Lying from You", "C/Users/LinkinPark/Meteora");
        Musica linkin8 = new Musica("Nobody's Listening", "C/Users/LinkinPark/Meteora");
        Musica linkin9 = new Musica("Numb", "C/Users/LinkinPark/Meteora");
        Musica linkin10 = new Musica("Somewhere I Belong", "C/Users/LinkinPark/Meteora");
        songs1 = new Pilha<>(11);
        songs1.inserir(linkin1);
        songs1.inserir(linkin2);
        songs1.inserir(linkin3);
        songs1.inserir(linkin4);
        songs1.inserir(linkin5);
        songs1.inserir(linkin6);
        songs1.inserir(linkin7);
        songs1.inserir(linkin8);
        songs1.inserir(linkin9);
        songs1.inserir(linkin10);
        a1 = new Album(songs2, "Meteora");
        lAlbum1 = new ListaDuplamente<>();
        lAlbum1.inserir(a1);

//        Primeiro Artista ******************************
        Musica r1 = new Musica("Can't Stop", "C:/Users/Red Hot");
        Musica r2 = new Musica("By the Way", "C:/Users/Red Hot");
        Musica r3 = new Musica("Universally Speaking", "C:/Users/Red Hot");
        songs2 = new Pilha<>(4);
        songs2.inserir(r1);
        songs2.inserir(r2);
        songs2.inserir(r3);
        a2 = new Album(songs2, "Californication");
        lAlbum2 = new ListaDuplamente<>();
        lAlbum2.inserir(a2);
        
        
        Musica d1 = new Musica("Musica Demi Lovato ", "C:/");
        Musica d2 = new Musica("Musica Demi Lovato ", "C:/");
        songs3 = new Pilha<>(3);
        songs3.inserir(d1);
        songs3.inserir(d2);
        a3 = new Album(songs3, "Album Demi");
        lAlbum3 = new ListaDuplamente<>();
        lAlbum3.inserir(a3);
    


    }

    public void listadeMusicas(Pilha<Musica> p) {
        listaMusicas.setText(p.toString());
    }

    public void listadeMusicas2(Pilha<Musica> p) {
        listaMusicas2.setText(p.toString());
    }

//
//
//    //Quarto Artista **********************************
//    Musica c1 = new Musica("Teste1", "C/Users/Teste");
//    Musica c2 = new Musica("Teste2", "C/Users/Teste");
//    Pilha<Musica> songs5 = new Pilha<>(11);
//        songs5.inserir(c1);
//        songs5.inserir(c2);
//    Album ts = new Album(songs5, "Teste Album");
//    ListaDuplamente<Album> tst = new ListaDuplamente<>();
//        tst.inserir(ts);
//    Artista teste = new Artista("Disney", "Pop", tst);
//
//    //Quinto Artista *******************************
//    Musica d1 = new Musica("Musica1", "C/Users/Musica");
//    Musica d2 = new Musica("Musica2", "C/Users/Musica");
//    Pilha<Musica> songs6 = new Pilha<>(11);
//        songs6.inserir(d1);
//        songs6.inserir(d2);
//    Album m = new Album(songs6, "Musicas Album");
//    ListaDuplamente<Album> mm = new ListaDuplamente<>();
//        mm.inserir(m);
//    Artista mmm = new Artista("Spice girls", "Pop", mm);
//
//    //Sexto Artista ********************************
//    Musica f1 = new Musica("Musica1", "C/Users");
//    Musica f2 = new Musica("Musica1", "C/Users");
//    Pilha<Musica> songs7 = new Pilha<>(11);
//        songs7.inserir(f1);
//        songs7.inserir(f2);
//    Album f = new Album(songs7, "Album");
//    ListaDuplamente<Album> ff = new ListaDuplamente<>();
//        ff.inserir(f);
//    Artista fff = new Artista("U2", "Rock", ff);
//
//    //Sétimo Artista ******************************
//    Musica g1 = new Musica("Musica1", "C/Users");
//    Musica g2 = new Musica("Musica1", "C/Users");
//    Pilha<Musica> songs8 = new Pilha<>(11);
//        songs8.inserir(g1);
//        songs8.inserir(g2);
//    Album g = new Album(songs8, "Album");
//    ListaDuplamente<Album> gg = new ListaDuplamente<>();
//        gg.inserir(g);
//    Artista ggg = new Artista("Veronicas", "Rock", gg);
//
//    //Oitavo Artista ****************************
//    Musica h1 = new Musica("Musica1", "C/Users");
//    Musica h2 = new Musica("Musica1", "C/Users");
//    Pilha<Musica> songs9 = new Pilha<>(11);
//        songs8.inserir(h1);
//        songs8.inserir(h2);
//    Album h = new Album(songs8, "Album");
//    ListaDuplamente<Album> hh = new ListaDuplamente<>();
//        hh.inserir(h);
//    Artista hhh = new Artista("O", "Rock", hh);
//
//    // Nono Artista
//    Musica avril1 = new Musica("Musica1", "C/Users");
//    Musica avril2 = new Musica("Musica1", "C/Users");
//    Pilha<Musica> songs10 = new Pilha<>(11);
//        songs10.inserir(avril1);
//        songs10.inserir(avril2);
//    Album candy = new Album(songs10, "Album");
//    ListaDuplamente<Album> aa = new ListaDuplamente<>();
//        aa.inserir(candy);
//    Artista aaa = new Artista("Avril", "Rock", aa);
//
//    //Décimo buscaDeArtista  - inserindo buscaDeArtista Beatles com 5 albuns e 10 musicas em cada
//    Musica Beatles1 = new Musica("Musica1", "C/Users/Beatles");
//    Musica Beatles2 = new Musica("Musica1", "C/Users/Beatles");
//    Musica Beatles3 = new Musica("Musica1", "C/Users/Beatles");
//    Musica Beatles4 = new Musica("Musica1", "C/Users/Beatles");
//    Musica Beatles5 = new Musica("Musica1", "C/Users/Beatles");
//    Musica Beatles6 = new Musica("Musica1", "C/Users/Beatles");
//    Musica Beatles7 = new Musica("Musica1", "C/Users/Beatles");
//    Musica Beatles8 = new Musica("Musica1", "C/Users/Beatles");
//    Musica Beatles9 = new Musica("Musica1", "C/Users/Beatles");
//    Musica Beatles10 = new Musica("Musica1", "C/Users/Beatles");
//
//    //5 pilhas para cada album
//    Pilha<Musica> songs11 = new Pilha<>(11);
//    Pilha<Musica> songs12 = new Pilha<>(11);
//    Pilha<Musica> songs13 = new Pilha<>(11);
//    Pilha<Musica> songs14 = new Pilha<>(11);
//    Pilha<Musica> songs15 = new Pilha<>(11);
//
//        songs11.inserir(Beatles1);
//        songs11.inserir(Beatles2);
//        songs11.inserir(Beatles3);
//        songs11.inserir(Beatles4);
//        songs11.inserir(Beatles5);
//        songs11.inserir(Beatles6);
//        songs11.inserir(Beatles7);
//        songs11.inserir(Beatles8);
//        songs11.inserir(Beatles9);
//        songs11.inserir(Beatles10);
//    //5 albuns.. cada um com sua pilha
//    Album beat1 = new Album(songs11, "Album");
//    Album beat2 = new Album(songs12, "Album");
//    Album beat3 = new Album(songs13, "Album");
//    Album beat4 = new Album(songs14, "Album");
//    Album beat5 = new Album(songs15, "Album");
//    ListaDuplamente<Album> bb = new ListaDuplamente<>();
//        bb.inserir(beat1);
//        bb.inserir(beat2);
//        bb.inserir(beat3);
//        bb.inserir(beat4);
//        bb.inserir(beat5);
//    Artista bbb = new Artista("Beatles", "Rock", aa);
//
//
//
//        arvore.inserirNo(muse);
//        arvore.inserirNo(guns);
//        arvore.inserirNo(teste);
//        arvore.inserirNo(mmm);
//        arvore.inserirNo(fff);
//        arvore.inserirNo(ggg);
//        arvore.inserirNo(hhh);
//        arvore.inserirNo(aaa);
//        arvore.inserirNo(bbb);
}
