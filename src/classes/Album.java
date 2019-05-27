
package classes;

import estruturas.Fila;
import estruturas.Pilha;
import java.util.ArrayList;


public class Album implements Comparable<Album>{
    
    /**
     *
     */
    //Tipo pilha para armazenar as musicas
    public Pilha<Musica> songs;// corrigir o vetor para receber musicas 
    //o album recebe 10 musicas
    public String titulo;
    
    
    


    //Teste ####
    public Album(Pilha<Musica> songs, String titulo) {
        this.songs = songs;
        this.titulo = titulo;
    }

    public Album() {
    }

    public void incluirsong(Pilha<Musica> music){
        this.songs = music;

    }

    @Override
    public String toString() {
        return "\nÁlbum: "+titulo;//+"\nSongs: " + songs
    }

    @Override
    public int compareTo(Album t) {

        if(t.titulo.compareTo(this.titulo) != 0)
            return -1;
        else if(t.titulo.compareTo(this.titulo) == 0)
            return 0;
        else
            return 1;
    }
    
    
    
    
    
}
