
package classes;

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
        
        
        
        
        Pilha<Musica> song = new Pilha<Musica>(11);
        song.inserir(m1);
        song.inserir(m2);
        song.inserir(m3);
        song.inserir(m1);
        song.inserir(m2);
        song.inserir(m3);
        
        Album a1 = new Album(song, "Greates Hits");
        
        ArrayList<Album> album = new ArrayList<>();
        album.add(a1);
        
        Artista redhot = new Artista("Red Hot", "Rock", album);
        
        Arvore r = new Arvore();
        r.inserirNo(10);
        r.inserirNo(15);
        r.inserirNo(3);
        
        System.out.println("    "+r.raiz);
        System.out.println(r.raiz.esquerdo +"       "+r.raiz.direito);
        
        
    }
    
}
