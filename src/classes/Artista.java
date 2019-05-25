/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import estruturas.listaduplamente.ListaDuplamente;
import java.util.ArrayList;

/**
 *
 * @author Je
 */
public class Artista implements Comparable<Artista>{
    
    private String cantor;
    private String genero;
    public ListaDuplamente<Album> albuns;
    //incluir lista de albuns
    
    

    public Artista(String cantor, String genero, ListaDuplamente<Album> albuns) {
        this.cantor = cantor;
        this.genero = genero;
        this.albuns = albuns;
    }

    public Artista() {
    }

    public String getCantor() {
        return cantor;
    }

    public String getGenero() {
        return genero;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Artista: " + cantor + ", Genero: " + genero;//+ "\n" + albuns
    }

    public ListaDuplamente<Album> getAlbuns() {
        return albuns;
    }

    public void setAlbuns(ListaDuplamente<Album> albuns) {
        this.albuns = albuns;
    }
    
    

    @Override
    public int compareTo(Artista t) {
        /*if(t.cantor.compareTo(this.cantor) > 0)
            return -1;
        else if(t.cantor.compareTo(this.cantor) == 0)
            return 0;
        else
            return 1;*/
        
        
        return this.cantor.compareTo(t.cantor);
    }
    
    
    
    
}
