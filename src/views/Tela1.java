package views;

import classes.Album;
import classes.Artista;
import classes.Arvore;
import classes.Musica;
import classes.Pilha;
import estruturas.listaduplamente.ListaDuplamente;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Rafael Borges
 * github.com/RafaelB13
 */
public class Tela1 extends Application{

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

        Album a1 = new Album(songs1, "Meteora");
        Album a2 = new Album(songs2, "Hybrid Theory");
         ListaDuplamente lAlbum1 = new ListaDuplamente<>();
        lAlbum1.inserir(a1);
        lAlbum1.inserir(a2);

        //reproducaoLinkinParkMeteora();
        //reproducaoLinkinParkHT();

//        Primeiro Artista ******************************
        Musica r1 = new Musica("Can't Stop", "C:/Users/Red Hot");
        Musica r2 = new Musica("By the Way", "C:/Users/Red Hot");
        Musica r3 = new Musica("Universally Speaking", "C:/Users/Red Hot");
        songs2 = new Pilha<>(4);
        songs2.inserir(r1);
        songs2.inserir(r2);
        songs2.inserir(r3);
        Album a3 = new Album(songs2, "Californication");
        ListaDuplamente lAlbum2 = new ListaDuplamente<>();
        lAlbum2.inserir(a3);

        Musica d1 = new Musica("Musica Demi Lovato ", "C:/");
        Musica d2 = new Musica("Musica Demi Lovato ", "C:/");
        Pilha songs3 = new Pilha<>(3);
        songs3.inserir(d1);
        songs3.inserir(d2);
        Album a4 = new Album(songs3, "Album Demi");
        ListaDuplamente lAlbum3 = new ListaDuplamente<>();
        lAlbum3.inserir(a4);
          
        Artista redhot = new Artista("Red Hot Chilli Peppers", "Rock", lAlbum2);
        Artista linkinPark = new Artista("Linkin Park", "Rock", lAlbum1);
        Artista demilovato = new Artista("Demi Lovato", "Pop", lAlbum3);
        
        Arvore arvore = Arvore.getInstancia();
        
        arvore.inserirNo(linkinPark);
        arvore.inserirNo(demilovato);
        arvore.inserirNo(redhot);
       
        
        
        launch(args);
    }

}
