/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.ArrayList;

/**
 *
 * @author Je
 */
public class Artista {
    
    private String cantor;
    private String genero;
    private ArrayList<Album> albuns;
    //incluir lista de albuns

    public Artista(String cantor, String genero, ArrayList<Album> albuns) {
        this.cantor = cantor;
        this.genero = genero;
        this.albuns = albuns;
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
        return "Artista: " + cantor + ", Genero: " + genero + "\n" + albuns;
    }
    
    
    
    
}
