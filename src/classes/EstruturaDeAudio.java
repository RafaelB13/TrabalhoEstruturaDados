
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
        Artista redhot = new Artista("Red Hot", "Rock", album);
        
        //Segundo artista ********************************
        Musica n1 = new Musica("Starlight", "C:/Users/Muse");
        Musica n2 = new Musica("Supermassive Black Hole", "C:/Users/Muse");
        Pilha<Musica> songs3 = new Pilha<>(11);
        songs3.inserir(n1);
        songs3.inserir(n2);
        Album bhr = new Album(songs3, "Black Holes and Revelations");
        ListaDuplamente<Album> bh = new ListaDuplamente<>();
        bh.inserir(bhr);
        Artista muse = new Artista("Muse", "Rock", bh);
        
        
        //Terceiro artista *******************************
        Musica b1 = new Musica("Patience", "C:/Users/Guns");
        Musica b2 = new Musica("Paradise City", "C:/Users/Guns");
        Pilha<Musica> song4 = new Pilha<>(11);
        song4.inserir(b1);
        song4.inserir(b2);
        Album gr = new Album(song4, "appetite for destruction");
        ListaDuplamente<Album> gunR = new ListaDuplamente<>();
        gunR.inserir(gr);
        Artista guns = new Artista("Tribalhistas", "Rock", gunR);
        
        //Quarto Artista **********************************
        Musica c1 = new Musica("Teste1", "C/Users/Teste");
        Musica c2 = new Musica("Teste2", "C/Users/Teste");
        Pilha<Musica> songs5 = new Pilha<>(11);
        songs5.inserir(c1);
        songs5.inserir(c2);
        Album ts = new Album(songs5, "Teste Album");
        ListaDuplamente<Album> tst = new ListaDuplamente<>();
        tst.inserir(ts);
        Artista teste = new Artista("Disney", "Pop", tst);
        
        //Quinto Artista *******************************
        Musica d1 = new Musica("Musica1", "C/Users/Musica");
        Musica d2 = new Musica("Musica2", "C/Users/Musica");
        Pilha<Musica> songs6 = new Pilha<>(11);
        songs6.inserir(d1);
        songs6.inserir(d2);
        Album m = new Album(songs6, "Musicas Album");
        ListaDuplamente<Album> mm = new ListaDuplamente<>();
        mm.inserir(m);
        Artista mmm = new Artista("Spice girls", "Pop", mm);
        
        
        //Sexto Artista - The Veronicas OK ********************************
        Musica veronicas1 = new Musica("Untouched", "C/Users/TheVeronicas");
        Musica veronicas2 = new Musica("Hook Me Up", "C/Users/TheVeronicas");
        Musica veronicas3 = new Musica("This Is How It Feels", "C/Users/TheVeronicas");
        Musica veronicas4 = new Musica("Take Me on the Floor", "C/Users/TheVeronicas");
        Musica veronicas5 = new Musica("I Don't Wanna Wait", "C/Users/TheVeronicas");
        Musica veronicas6= new Musica("Popular", "C/Users/TheVeronicas");
        Musica veronicas7 = new Musica("Revenge Is Sweeter (Than You Ever Were)", "C/Users/TheVeronicas");
        Musica veronicas8= new Musica("Someone Wake Me Up", "C/Users/TheVeronicas");
        Musica veronicas9 = new Musica("All I Have", "C/Users/TheVeronicas");
        Musica veronicas10= new Musica("In Another Life", "C/Users/TheVeronicas");
        
        Pilha<Musica> songs7 = new Pilha<>(11);
        songs7.inserir(veronicas1);
        songs7.inserir(veronicas2);
        songs7.inserir(veronicas3);
        songs7.inserir(veronicas4);
        songs7.inserir(veronicas5);
        songs7.inserir(veronicas6);
        songs7.inserir(veronicas7);
        songs7.inserir(veronicas8);
        songs7.inserir(veronicas9);
        songs7.inserir(veronicas10);
        
        Album hookMeUp = new Album(songs7, "Hook Me Up");
        ListaDuplamente<Album> VeronicaLista = new ListaDuplamente<>();
        VeronicaLista.inserir(hookMeUp);
        Artista TheVeronicas = new Artista("The Veronicas", "Pop/Rock", VeronicaLista);
        
        //Sétimo Artista - Coldplay******************************
        Musica cold1 = new Musica("A Sky Full of Stars", "C/Users/Coldplay");
        Musica cold2 = new Musica("Charlie Brown", "C/Users/Coldplay");
        Musica cold3 = new Musica("Every Teardrop Is A Waterfall", "C/Users/Coldplay");
        Musica cold4 = new Musica("Fix You", "C/Users/Coldplay");
        Musica cold5 = new Musica("Hymn For The Weekend", "C/Users/Coldplay");
        Musica cold6 = new Musica("Magic", "C/Users/Coldplay");
        Musica cold7 = new Musica("Paradise", "C/Users/Coldplay");
        Musica cold8 = new Musica("Something Just Like This", "C/Users/Coldplay");
        Musica cold9 = new Musica("The Scientist", "C/Users/Coldplay");
        Musica cold10 = new Musica("Viva La Vida", "C/Users/Coldplay");
        
        Pilha<Musica> songs8 = new Pilha<>(11);
        songs8.inserir(cold1);
        songs8.inserir(cold2);
        songs8.inserir(cold3);
        songs8.inserir(cold4);
        songs8.inserir(cold5);
        songs8.inserir(cold6);
        songs8.inserir(cold7);
        songs8.inserir(cold8);
        songs8.inserir(cold9);
        songs8.inserir(cold10);
        
        Album greatestSongs = new Album(songs8, "Greatest Songs");
        ListaDuplamente<Album> ColdLista = new ListaDuplamente<>();
        ColdLista.inserir(greatestSongs);
        Artista Coldplay = new Artista("Coldplay", "Pop/Rock", ColdLista);
        
        
        //Oitavo Artista - Demi Lovato - OK
        Musica Demi1 = new Musica("Confident", "C/Users/DemiLovato");
        Musica Demi2 = new Musica("Cool for the Summer", "C/Users/DemiLovato");
        Musica Demi3 = new Musica("Old Ways", "C/Users/DemiLovato");
        Musica Demi4 = new Musica("For You", "C/Users/DemiLovato");
        Musica Demi5 = new Musica("Stone Cold", "C/Users/DemiLovato");
        Musica Demi6 = new Musica("Kingdom Come (feat. Iggy Azalea)", "C/Users/DemiLovato");
        Musica Demi7 = new Musica("Waitin for You (feat. Sirah)", "C/Users/DemiLovato");
        Musica Demi8 = new Musica("Lionheart", "C/Users/DemiLovato");
        Musica Demi9 = new Musica("Father", "C/Users/DemiLovato");
        Musica Demi10 = new Musica("Mr. Hughes", "C/Users/DemiLovato");
        
        Pilha<Musica> songs9 = new Pilha<>(11);
        songs9.inserir(Demi1);
        songs9.inserir(Demi2);
        songs9.inserir(Demi3);
        songs9.inserir(Demi4);
        songs9.inserir(Demi5);
        songs9.inserir(Demi6);
        songs9.inserir(Demi7);
        songs9.inserir(Demi8);
        songs9.inserir(Demi9);
        songs9.inserir(Demi10);
        
        Album confident = new Album(songs9, "Confident");
        ListaDuplamente<Album> DemiLista = new ListaDuplamente<>();
        DemiLista.inserir(confident);
        Artista DemiLovato = new Artista("Demi Lovato", "Pop", DemiLista);
        
        
        // Nono Artista - Adele OK
        Musica adele1 = new Musica("Chasing Pavements", "C/Users/Adele");
        Musica adele2 = new Musica("Don't You Remember", "C/Users/Adele");
        Musica adele3 = new Musica("I'll Be Waiting", "C/Users/Adele");
        Musica adele4 = new Musica("Lovesong", "C/Users/Adele");
        Musica adele5 = new Musica("One and Only", "C/Users/Adele");
        Musica adele6 = new Musica("Rolling in the Deep", "C/Users/Adele");
        Musica adele7 = new Musica("Rumour Has It", "C/Users/Adele");
        Musica adele8 = new Musica("Set Fire to the Rain", "C/Users/Adele");
        Musica adele9 = new Musica("Someone Like You", "C/Users/Adele");
        Musica adele10 = new Musica("Take It All", "C/Users/Adele");
        Musica adele11 = new Musica("Turning Tables", "C/Users/Adele");
        
        Pilha<Musica> songs10 = new Pilha<>(12);
        songs10.inserir(adele1);
        songs10.inserir(adele2);
        songs10.inserir(adele3);
        songs10.inserir(adele4);
        songs10.inserir(adele5);
        songs10.inserir(adele6);
        songs10.inserir(adele7);
        songs10.inserir(adele8);
        songs10.inserir(adele9);
        songs10.inserir(adele10);
        songs10.inserir(adele11);
        
        Album a21 = new Album(songs10, "21");
        ListaDuplamente<Album> AdeleLista = new ListaDuplamente<>();
        AdeleLista.inserir(a21);
        Artista Adele = new Artista("Adele", "Soul/Pop", AdeleLista);
        
        
        //Décimo artista  - inserindo artista Beatles com 5 albuns e 10 musicas em cada
        Musica Beatles1 = new Musica("Musica1", "C/Users/Beatles");
        Musica Beatles2 = new Musica("Musica1", "C/Users/Beatles");
        Musica Beatles3 = new Musica("Musica1", "C/Users/Beatles");
        Musica Beatles4 = new Musica("Musica1", "C/Users/Beatles");
        Musica Beatles5 = new Musica("Musica1", "C/Users/Beatles");
        Musica Beatles6 = new Musica("Musica1", "C/Users/Beatles");
        Musica Beatles7 = new Musica("Musica1", "C/Users/Beatles");
        Musica Beatles8 = new Musica("Musica1", "C/Users/Beatles");
        Musica Beatles9 = new Musica("Musica1", "C/Users/Beatles");
        Musica Beatles10 = new Musica("Musica1", "C/Users/Beatles");
        
        //5 pilhas para cada album
        Pilha<Musica> songs11 = new Pilha<>(11);
        Pilha<Musica> songs12 = new Pilha<>(11);
        Pilha<Musica> songs13 = new Pilha<>(11);
        Pilha<Musica> songs14 = new Pilha<>(11);
        Pilha<Musica> songs15 = new Pilha<>(11);
        
        songs11.inserir(Beatles1);
        songs11.inserir(Beatles2);
        songs11.inserir(Beatles3);
        songs11.inserir(Beatles4);
        songs11.inserir(Beatles5);
        songs11.inserir(Beatles6);
        songs11.inserir(Beatles7);
        songs11.inserir(Beatles8);
        songs11.inserir(Beatles9);
        songs11.inserir(Beatles10);
        //5 albuns.. cada um com sua pilha
        Album beat1 = new Album(songs11, "Album");
        Album beat2 = new Album(songs12, "Album");
        Album beat3 = new Album(songs13, "Album");
        Album beat4 = new Album(songs14, "Album");
        Album beat5 = new Album(songs15, "Album");
        ListaDuplamente<Album> bb = new ListaDuplamente<>();
        bb.inserir(beat1);
         bb.inserir(beat2);
          bb.inserir(beat3);
           bb.inserir(beat4);
            bb.inserir(beat5);
        Artista bbb = new Artista("Beatles", "Rock", bb);
        // deixei comentado para evitar o erro
//        arvore.inserirNo(redhot);
//         arvore.inserirNo(muse);
//          arvore.inserirNo(guns);
//           arvore.inserirNo(teste);
//            arvore.inserirNo(mmm);
//             arvore.inserirNo(fff);
//              arvore.inserirNo(ggg);
//               arvore.inserirNo(hhh);
//                arvore.inserirNo(aaa);
//                 arvore.inserirNo(bbb);
        
        //FIZ ALGUMAS ALTERAÇÕES NAS CLASSES ALBUM E ARTISTA E NO TOSTRING DE ALBUM PRA TESTE NA INTERFACE
        //EXECUTA O PROJETO TODO PRA VC DA UMA OLHADA COMO FICOU
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
        System.out.println("\n#################################\nraiz.esquerdo.esquerdo.esquerdo\n");
        System.out.println(arvore.raiz.esquerdo.esquerdo.esquerdo);
        System.out.println("\n#################################\nraiz.esquerdo.esquerdo.esquerdo.diretio\n");
        System.out.println(arvore.raiz.esquerdo.esquerdo.esquerdo.direito);
      


    }
    
}
