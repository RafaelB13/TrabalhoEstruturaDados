package views;

import classes.Album;
import classes.Artista;
import classes.Arvore;
import classes.Musica;
import classes.Pilha;
import estruturas.ListaCircular.ListaCircular;
import estruturas.listaduplamente.ListaDuplamente;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Rafael Borges github.com/RafaelB13
 */
public class Tela1 extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("FXMLTelaPrincipal.fxml"));

        primaryStage.setScene(new Scene(root));
        primaryStage.show();

    }

    public static void main(String[] args) {

        Musica linkin1 = new Musica("Don't Stay", "src\\musicas\\LinkinParkMeteora\\1Dontstay.mp3");
        Musica linkin2 = new Musica("Breaking the Habit", "src\\musicas\\LinkinParkMeteora\\2Breakingthehabit.mp3");
        Musica linkin3 = new Musica("Figure.09", "src\\musicas\\LinkinParkMeteora\\3Figure09.mp3");
        Musica linkin4 = new Musica("Lying From You", "src\\musicas\\LinkinParkMeteora\\4Lyingfromyou.mp3");
        Musica linkin5 = new Musica("From the inside", "src\\musicas\\LinkinParkMeteora\\5Fromtheinside.mp3");
        Musica linkin6 = new Musica("Easier to run", "src\\musicas\\LinkinParkMeteora\\6Easiertorun.mp3");
        Musica linkin7 = new Musica("Faint", "src\\musicas\\LinkinParkMeteora\\7Faint.mp3");
        Musica linkin8 = new Musica("Numb", "src\\musicas\\LinkinParkMeteora\\8Numb.mp3");
        Musica linkin9 = new Musica("Hit the floor", "src\\musicas\\LinkinParkMeteora\\9Hitthefloor.mp3");
        Musica linkin10 = new Musica("Somewhere I Belong", "src\\musicas\\LinkinParkMeteora\\12 Somewhere i belong.mp3");

        Pilha songs1 = new Pilha<>(11);
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

        Musica hybrid1 = new Musica("One Step Closer", "src\\musicas\\LinkinParkMeteora\\5Fromtheinside.mp3");
        Musica hybrid2 = new Musica("Pappercut", "src\\musicas\\LinkinParkMeteora\\6Easiertorun.mp3");
        Musica hybrid3 = new Musica("Whit you", "src\\musicas\\LinkinParkMeteora\\9Hitthefloor.mp3");
        Musica hybrid4 = new Musica("A place for my head", "src\\musicas\\LinkinParkMeteora\\3Figure09.mp3");
        Musica hybrid5 = new Musica("In the end", "src\\musicas\\LinkinParkMeteora\\7Faint.mp3");

        Pilha songs2 = new Pilha<>(6);
        songs2.inserir(hybrid1);
        songs2.inserir(hybrid2);
        songs2.inserir(hybrid3);
        songs2.inserir(hybrid4);
        songs2.inserir(hybrid5);

        Album a1 = new Album(songs1, "A Meteora");
        Album a2 = new Album(songs2, "B Hybrid");
        ListaCircular<Album> lAlbum1 = new ListaCircular<>();
        lAlbum1.inserir(a1);
        lAlbum1.inserir(a2);

    
        Musica r1 = new Musica("Can't Stop", "C:/Users/Red Hot");
        Musica r2 = new Musica("By the Way", "C:/Users/Red Hot");
        Musica r3 = new Musica("Universally Speaking", "C:/Users/Red Hot");
        Pilha songsr = new Pilha<>(4);
        songsr.inserir(r1);
        songsr.inserir(r2);
        songsr.inserir(r3);
        Album alC = new Album(songs2, "Californication");
        Album alC2 = new Album(songs1, "Greatest Hits");
        ListaCircular<Album> lAlbum2 = new ListaCircular<>();
        lAlbum2.inserir(alC);
        lAlbum2.inserir(alC2);

        Musica d1 = new Musica("Musica Demi Lovato ", "C:/");
        Musica d2 = new Musica("Musica Demi Lovato ", "C:/");
        Pilha songs3 = new Pilha<>(3);
        songs3.inserir(d1);
        songs3.inserir(d2);
        Album a4 = new Album(songs3, "Album Demi");
        ListaCircular<Album> lAlbum3 = new ListaCircular<>();
        lAlbum3.inserir(a4);

        Musica c1 = new Musica("Teste1", "C/Users/Teste");
        Musica c2 = new Musica("Teste2", "C/Users/Teste");
        Pilha<Musica> songs5 = new Pilha<>(11);
        songs5.inserir(c1);
        songs5.inserir(c2);
        Album ts = new Album(songs5, "Teste Album");
        ListaCircular<Album> tst = new ListaCircular<>();
        tst.inserir(ts);
        
 
        Musica s1 = new Musica("Musica1", "C/Users/Musica");
        Musica s2 = new Musica("Musica2", "C/Users/Musica");
        Pilha<Musica> songs6 = new Pilha<>(11);
        songs6.inserir(d1);
        songs6.inserir(d2);
        Album m = new Album(songs6, "Musicas Album");
        ListaCircular<Album> mm = new ListaCircular<>();
        mm.inserir(m);

        Artista redhot = new Artista("G", "Rock", lAlbum2);
        Artista linkinPark = new Artista("Linkin Park", "Rock", lAlbum1);
        Artista demilovato = new Artista("D", "Pop", lAlbum3);
        Artista spicegirls = new Artista("S", "Pop", lAlbum1);
        Artista cisney = new Artista("C", "Pop", tst);

        Arvore arvore = Arvore.getInstancia();

        arvore.inserirNo(linkinPark);
        arvore.inserirNo(redhot);
        arvore.inserirNo(demilovato);
        arvore.inserirNo(spicegirls);
        arvore.inserirNo(cisney);
        
        

        launch(args);
    }

}
