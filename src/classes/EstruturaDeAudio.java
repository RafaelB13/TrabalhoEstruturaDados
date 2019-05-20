
package classes;

import estruturas.listaduplamente.ListaDuplamente;
import estruturas.Fila;
import estruturas.Pilha;
import java.util.ArrayList;


public class EstruturaDeAudio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Testes
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
        
        Album a1 = new Album(songs1, "Greates Hits");
        Album a2 = new Album(songs2, "Californication");
        
        
        ListaDuplamente<Album> album = new ListaDuplamente<>();
        album.inserir(a1);
        album.inserir(a2);
        
        Artista redhot = new Artista("Red Hot Chilli Peppers", "Rock", album);
        
        
        System.out.println(redhot);
        
      
        
        
    }
    
}
