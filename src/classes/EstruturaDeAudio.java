
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
        
        Arvore<Artista> arvore = new Arvore<>();
        
        //Primeiro Artista ******************************
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
        Artista redhot = new Artista("R", "Rock", album);
        
        //Segundo artista ********************************
        Musica n1 = new Musica("Starlight", "C:/Users/Muse");
        Musica n2 = new Musica("Supermassive Black Hole", "C:/Users/Muse");
        Pilha<Musica> songs3 = new Pilha<>(11);
        songs3.inserir(n1);
        songs3.inserir(n2);
        Album bhr = new Album(songs3, "Black Holes and Revelations");
        ListaDuplamente<Album> bh = new ListaDuplamente<>();
        bh.inserir(bhr);
        Artista muse = new Artista("M", "Rock", bh);
        
        
        //Terceiro artista *******************************
        Musica b1 = new Musica("Patience", "C:/Users/Guns");
        Musica b2 = new Musica("Paradise City", "C:/Users/Guns");
        Pilha<Musica> song4 = new Pilha<>(11);
        song4.inserir(b1);
        song4.inserir(b2);
        Album gr = new Album(song4, "appetite for destruction");
        ListaDuplamente<Album> gunR = new ListaDuplamente<>();
        gunR.inserir(gr);
        Artista guns = new Artista("T", "Rock", gunR);
        
        //Quarto Artista **********************************
        Musica c1 = new Musica("Teste1", "C/Users/Teste");
        Musica c2 = new Musica("Teste2", "C/Users/Teste");
        Pilha<Musica> songs5 = new Pilha<>(11);
        songs5.inserir(c1);
        songs5.inserir(c2);
        Album ts = new Album(songs5, "Teste Album");
        ListaDuplamente<Album> tst = new ListaDuplamente<>();
        tst.inserir(ts);
        Artista teste = new Artista("D", "Pop", tst);
        
        //Quinto Artista *******************************
        Musica d1 = new Musica("Musica1", "C/Users/Musica");
        Musica d2 = new Musica("Musica2", "C/Users/Musica");
        Pilha<Musica> songs6 = new Pilha<>(11);
        songs6.inserir(d1);
        songs6.inserir(d2);
        Album m = new Album(songs6, "Musicas Album");
        ListaDuplamente<Album> mm = new ListaDuplamente<>();
        mm.inserir(m);
        Artista mmm = new Artista("S", "Pop", mm);
        
        //Sexto Artista ********************************
        Musica f1 = new Musica("Musica1", "C/Users");
        Musica f2 = new Musica("Musica1", "C/Users");
        Pilha<Musica> songs7 = new Pilha<>(11);
        songs7.inserir(f1);
        songs7.inserir(f2);
        Album f = new Album(songs7, "Album");
        ListaDuplamente<Album> ff = new ListaDuplamente<>();
        ff.inserir(f);
        Artista fff = new Artista("U", "Rock", ff);
        
        //Sétimo Artista ******************************
        Musica g1 = new Musica("Musica1", "C/Users");
        Musica g2 = new Musica("Musica1", "C/Users");
        Pilha<Musica> songs8 = new Pilha<>(11);
        songs8.inserir(g1);
        songs8.inserir(g2);
        Album g = new Album(songs8, "Album");
        ListaDuplamente<Album> gg = new ListaDuplamente<>();
        gg.inserir(g);
        Artista ggg = new Artista("V", "Rock", gg);
        
        //Oitavo Artista ****************************
        Musica h1 = new Musica("Musica1", "C/Users");
        Musica h2 = new Musica("Musica1", "C/Users");
        Pilha<Musica> songs9 = new Pilha<>(11);
        songs8.inserir(h1);
        songs8.inserir(h2);
        Album h = new Album(songs8, "Album");
        ListaDuplamente<Album> hh = new ListaDuplamente<>();
        hh.inserir(h);
        Artista hhh = new Artista("O", "Rock", hh);
        
        arvore.inserirNo(redhot);
        arvore.inserirNo(muse);
        arvore.inserirNo(guns);
        arvore.inserirNo(teste);
        arvore.inserirNo(mmm);
        arvore.inserirNo(fff);
        arvore.inserirNo(ggg);
        arvore.inserirNo(hhh);
        
        /** Desenho da árvore
         *         R
         *   M         T
         * D   O     S   U 
         *                 V
         */
        
        
        
        System.out.println("\n#################################\nraiz\n");
        System.out.println(arvore.raiz);        
        System.out.println("\n#################################\nraiz.direito\n");
        System.out.println(arvore.raiz.direito);
        System.out.println("\n#################################\nraiz.direito.direito\n");
        System.out.println(arvore.raiz.direito.direito);
        System.out.println("\n#################################\nraiz.direito.esquerdo\n");
        System.out.println(arvore.raiz.direito.esquerdo);
        System.out.println("\n#################################\nraiz.direito.direito.direito\n");
        System.out.println(arvore.raiz.direito.direito.direito);
        System.out.println("\n#################################\nraiz.esquerdo\n");
        System.out.println(arvore.raiz.esquerdo);
        System.out.println("\n#################################\nraiz.esquerdo.direito\n");
        System.out.println(arvore.raiz.esquerdo.direito);
        System.out.println("\n#################################\nraiz.esquerdo.esquerdo\n");
        System.out.println(arvore.raiz.esquerdo.esquerdo);
        
      
        
        
    }
    
}
