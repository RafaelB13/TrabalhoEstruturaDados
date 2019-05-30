/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import classes.*;
import classes.Pilha;
import estruturas.listaduplamente.ListaDuplamente;
import estruturas.listaduplamente.NoL;
import jaco.mp3.player.MP3Player;
import java.io.File;

import java.net.URL;
import java.nio.file.Paths;
import java.util.Arrays;

import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author Rafael Borges
 * @author Jessica Correia
 */
public class FXMLSpotifyController implements Initializable {

    @FXML
    private Label teste, status, nomeArtista, labelArtistas, album1, album2, album3, album4,
            listaMusicas, listaMusicas2, listaMusicas3, listaMusicas4,
            //Musicas Linkin Park Meteora
            musica1, musica2, musica3, musica4, musica5, musica6, musica7, musica8, musica9, musica10,
            //Musicas Linkin Park Hybrid Theory
            musicaH1, musicaH2, musicaH3, musicaH4, musicaH5, musicasAlbum;

    @FXML
    private ImageView btnPause, btnStop, btnPlay, btnProximaMusica, btnMusicaAnterior;
    @FXML
    private TextField txtPesquisar;
    @FXML
    private Button btnPesquisar, btnA, btnB, btnC, btnD, btnE, btnF, btnG, btnH, btnI, btnJ,
            btnK, btnL, btnM, btnN, btnO, btnP, btnQ, btnR, btnS, btnT, btnU, btnV, btnW, btnX, btnY, btnZ;

    //Pilha<Musica> songs1, songs2, songs3, songs4, songs5, songs6, songs7, songs8, songs9, songs10;
    //Album a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13;
    //ListaDuplamente<Album> lAlbum1, lAlbum2, lAlbum3, lAlbum4, lAlbum5, lAlbum6, lAlbum7, lAlbum8, lAlbum9, lAlbum10;

    Arvore<Artista> arvore = Arvore.getInstancia();

    //Linkin Park Meteora
    //Musica linkin1, linkin2, linkin3, linkin4, linkin5, linkin6, linkin7, linkin8, linkin9, linkin10;
    //Musica hybrid1, hybrid2, hybrid3, hybrid4, hybrid5;
    //Red Hot Chili Peppers

    MP3Player player;
    String diretorio;
    String path;
    String path1;

    private void reproducao(String local) {

    }

    public MP3Player mP3Player() {
        MP3Player mP3Player = new MP3Player();
        return mP3Player;
    }

    @FXML
    private void buscaDeArtista(MouseEvent event) {
        //listaDeArtistas();
        
         Arvore arvore = Arvore.getInstancia();
         No<Artista> n = arvore.buscarNoByNome(txtPesquisar.getText());
         Artista a = n.obterValor();
         System.out.println( a.getCantor() );
         ListaDuplamente<Album> ab = a.getAlbuns();
         
         NoL no = ab.getNoAtual();
         nomeArtista.setText(a.getCantor());
         while(no!=null){
             System.out.println(no);
             
              Album m = (Album) no.obterValor();
              
              
              while( !m.songs.estaVazia()){
                 Musica mu = m.songs.remover();                  
                    
                    musicasAlbum.setText(mu.nome);
                    album1.setText(m.titulo);
                    System.out.println( mu.nome );   
                    player = mP3Player();
                    File f = new File(mu.local);
                 
                 player.addToPlayList(f);
                 
                  
              } 
             ab.nextNoAtual();
             no = ab.getNoAtual();
    
         }
         
         
         
         
         
        
        /*Artista redhot = new Artista("Red Hot Chilli Peppers", "Rock", lAlbum2);
        Artista linkinPark = new Artista("Linkin Park", "Rock", lAlbum1);
        Artista demilovato = new Artista("Demi Lovato", "Pop", lAlbum3);

        arvore.inserirNo(linkinPark);
        arvore.inserirNo(demilovato);
        arvore.inserirNo(redhot);

        if (txtPesquisar.getText().equals(linkinPark.getCantor()) || txtPesquisar.getText().equals("l")) {

            nomeArtista.setText(arvore.buscaNo(linkinPark).toString());
            album1.setText(a1.titulo);

            listadeMusicas(linkin1.getNome(), linkin2.getNome(), linkin3.getNome(),
                    linkin4.getNome(), linkin5.getNome(), linkin6.getNome(), linkin7.getNome(),
                    linkin8.getNome(), linkin9.getNome(), linkin10.getNome());

            listaMusicas.addEventHandler(MouseEvent.MOUSE_CLICKED, (e) -> play(event));

//            album2.setText(a1.titulo);
//            listadeMusicas2(hybrid1.getNome(), hybrid2.getNome(), hybrid3.nome, hybrid4.getNome(), hybrid5.getNome());
//            listaMusicas2.addEventHandler(MouseEvent.MOUSE_CLICKED, (e) -> play(event));
        } else if (txtPesquisar.getText().equals(redhot.getCantor()) || txtPesquisar.getText().equals("r")) {
            nomeArtista.setText(arvore.buscaNo(demilovato).toString());
            album1.setText(a2.titulo);
        } else if (txtPesquisar.getText().equals("")) {
            nomeArtista.setText("Não Encontrado");
            album1.setText("");
            album2.setText("");
            album3.setText("");
            album4.setText("");
            musica1.setText("");
            musica2.setText("");
            musica3.setText("");
            musica4.setText("");
            musica5.setText("");
            musica6.setText("");
            musica7.setText("");
            musica8.setText("");
            musica9.setText("");
            musica10.setText("");
        }*/

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
        player.pause();
    }

    //Botão Stop
    @FXML
    public void stop(MouseEvent event) {
        status.setText("Parado");
        player.stop();
    }

    //Botão Play
    @FXML
    public void play(MouseEvent event) {
        status.setText("Reproduzindo");
        player.play();
    }

    @FXML
    public void aleatorio(ActionEvent event) {
        player.setShuffle(true);
    }

    @FXML
    void proxima(MouseEvent event) {
        status.setText("Reproduzindo");
        player.skipForward();

    }

    @FXML
    void anterior(MouseEvent event) {
        status.setText("Reproduzindo");
        player.skipBackward();
    }
    //Fim dos Eventos da tela de reprodução

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        

    }

    public void listaDeArtistas() {

        /*LINKIN PARK
        linkin1 = new Musica("Don't Stay", "src\\musicas\\LinkinParkMeteora\\1Dontstay.mp3");
        linkin2 = new Musica("Breaking the Habit", "src\\musicas\\LinkinParkMeteora\\2Breakingthehabit.mp3");
        linkin3 = new Musica("Figure.09", "src\\musicas\\LinkinParkMeteora\\3Figure09.mp3");
        linkin4 = new Musica("Lying From You", "src\\musicas\\LinkinParkMeteora\\4Lyingfromyou.mp3");
        linkin5 = new Musica("From the inside", "src\\musicas\\LinkinParkMeteora\\5Fromtheinside.mp3");
        linkin6 = new Musica("Easier to run", "src\\musicas\\LinkinParkMeteora\\6Easiertorun.mp3");
        linkin7 = new Musica("Faint", "src\\musicas\\LinkinParkMeteora\\7Faint.mp3");
        linkin8 = new Musica("Numb", "src\\musicas\\LinkinParkMeteora\\8Numb.mp3");
        linkin9 = new Musica("Hit the floor", "src\\musicas\\LinkinParkMeteora\\9Hitthefloor.mp3");
        linkin10 = new Musica("Somewhere I Belong", "src\\musicas\\LinkinParkMeteora\\12 Somewhere i belong.mp3");
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

        hybrid1 = new Musica("One Step Closer", "src\\musicas\\LinkinParkMeteora\\5Fromtheinside.mp3");
        hybrid2 = new Musica("Pappercut", "src\\musicas\\LinkinParkMeteora\\6Easiertorun.mp3");
        hybrid3 = new Musica("Whit you", "src\\musicas\\LinkinParkMeteora\\9Hitthefloor.mp3");
        hybrid4 = new Musica("A place for my head", "src\\musicas\\LinkinParkMeteora\\3Figure09.mp3");
        hybrid5 = new Musica("In the end", "src\\musicas\\LinkinParkMeteora\\7Faint.mp3");
        songs2 = new Pilha<>(6);
        songs2.inserir(hybrid1);
        songs2.inserir(hybrid2);
        songs2.inserir(hybrid3);
        songs2.inserir(hybrid4);
        songs2.inserir(hybrid5);

        a1 = new Album(songs1, "Meteora");
        //a2 = new Album(songs2, "Hybrid Theory");

        reproducaoLinkinParkMeteora();
        //reproducaoLinkinParkHT();

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
        lAlbum3.inserir(a3); */

    }

    public void reproducaoLinkinParkHT() {
        try {
            //File mush0 = new File(songs2.getReferencia(0).toString());
            //File mush1 = new File(songs2.getReferencia(1).toString());
            //File mush2 = new File(songs2.getReferencia(2).toString());
            //File mush3 = new File(songs2.getReferencia(3).toString());
            //File mush4 = new File(songs2.getReferencia(4).toString());

            player = mP3Player();
           // player.addToPlayList(mush0);
           // player.addToPlayList(mush1);
            //player.addToPlayList(mush2);
           // player.addToPlayList(mush3);
           // player.addToPlayList(mush4);

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public void reproducaoLinkinParkMeteora() {
        //Reprodução Album Meteora
        try {

            //Referencia do local da musica dentro da Pilha
            /*File mus0 = new File(songs1.getReferencia(0).toString());
            File mus1 = new File(songs1.getReferencia(1).toString());
            File mus2 = new File(songs1.getReferencia(2).toString());
            File mus3 = new File(songs1.getReferencia(3).toString());
            File mus4 = new File(songs1.getReferencia(4).toString());
            File mus5 = new File(songs1.getReferencia(5).toString());
            File mus6 = new File(songs1.getReferencia(6).toString());
            File mus7 = new File(songs1.getReferencia(7).toString());
            File mus8 = new File(songs1.getReferencia(8).toString());
            File mus9 = new File(songs1.getReferencia(9).toString());*/

            player = mP3Player();

           /* player.addToPlayList(mus0);
            player.addToPlayList(mus1);
            player.addToPlayList(mus2);
            player.addToPlayList(mus3);
            player.addToPlayList(mus4);
            player.addToPlayList(mus5);
            player.addToPlayList(mus6);
            player.addToPlayList(mus7);
            player.addToPlayList(mus8);
            player.addToPlayList(mus9);
            path = Paths.get(".").normalize().toString(); */

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public void listadeMusicas(String m1, String m2, String m3, String m4,
            String m5, String m6, String m7, String m8, String m9, String m10) {
        listaDeArtistas();
        musica1.setText(m1);
        musica1.addEventHandler(MouseEvent.MOUSE_CLICKED, (e) -> player.play());
        musica2.setText(m2);
        musica3.setText(m3);
        musica4.setText(m4);
        musica5.setText(m5);
        musica6.setText(m6);
        musica7.setText(m7);
        musica8.setText(m8);
        musica9.setText(m9);
        musica9.addEventHandler(MouseEvent.MOUSE_CLICKED, (e)
                -> player.play());
        musica10.setText(m10);
    }

    public void listadeMusicas2(String m1, String m2, String m3, String m4, String m5) {
        listaDeArtistas();
        musicaH1.setText(m1);
        musicaH2.setText(m2);
        musicaH3.setText(m3);
        musicaH4.setText(m4);
        musicaH5.setText(m5);

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
