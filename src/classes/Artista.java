/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Je
 */
public class Artista {
    
    private String cantor;
    private String genero;
    //incluir lista de albuns

    public Artista(String cantor, String genero) {
        this.cantor = cantor;
        this.genero = genero;
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
    
}
