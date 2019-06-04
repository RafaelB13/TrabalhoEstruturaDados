package classes;

import classes.Artista;

public class Arvore<T extends Comparable<T>> {

    No raiz;

    private static Arvore arvore;

    public static Arvore getInstancia() {
        if (arvore == null) {
            arvore = new Arvore<Artista>();
        }

        return arvore;
    }

    private Arvore() {
        this.raiz = null;
    }

    public No inserirNo(Artista valor) {
        No n = new No(valor);
        return inserirNo(n, null);

    }

    public No inserirNo(No novo, No pai) {

        if (pai == null) {
            pai = raiz;
        }

        if (raiz == null) {
            raiz = novo;
        } else {
            //menor
            if (novo.obterValor().compareTo(pai.obterValor()) == -1) {

                if (pai.obterNoEsquerdo() == null) {
                    pai.inserirEsquerdo(novo);
                } else {
                    inserirNo(novo, pai.obterNoEsquerdo());
                }

            } else {

                if (pai.obterNoDireito() == null) {
                    pai.inserirDireito(novo);
                } else {
                    inserirNo(novo, pai.obterNoDireito());
                }
            }
        }

        return novo;

    }

    public No removerNo(Artista valor) {
        return removerNo(valor, null);
    }

    public No removerNo(Artista valor, No currentno) {

        No noret = null;

        if (currentno == null) {
            currentno = raiz;
        }

        //igual
        if (currentno.obterValor().compareTo(valor) == 0) {
            //System.out.println(currentno.obterValor() + "� igual");
            //� um n� folha?
            if ((currentno.obterNoDireito() == null) && (currentno.obterNoEsquerdo() == null)) {

                if (currentno == this.raiz) {
                    this.raiz = null;
                } else if (currentno == currentno.pai.obterNoDireito()) {
                    currentno.pai.inserirDireito(null);
                } else {
                    currentno.pai.inserirEsquerdo(null);
                }

                //tem apena sum filho � direita?
            } else if (currentno.obterNoDireito() == null) {

                if (currentno == this.raiz) {
                    this.raiz = this.raiz.obterNoEsquerdo();
                } else if (currentno == currentno.pai.obterNoDireito()) {
                    currentno.pai.inserirDireito(currentno.obterNoEsquerdo());
                } else {
                    currentno.pai.inserirEsquerdo(currentno.obterNoEsquerdo());
                }

                //tem apena sum filho � esquerda?
            } else if (currentno.obterNoEsquerdo() == null) {

                if (currentno == this.raiz) {
                    this.raiz = this.raiz.obterNoDireito();
                } else if (currentno == currentno.pai.obterNoDireito()) {
                    currentno.pai.inserirDireito(currentno.obterNoDireito());
                } else {
                    currentno.pai.inserirEsquerdo(currentno.obterNoDireito());
                }

                //tem dois filhos
            } else {

                No sucessor = this.getSucessor(currentno, true);
                System.out.println("O sucessor �:" + sucessor + "\n");

                if (sucessor != currentno.obterNoDireito()) {

                    sucessor.pai.inserirEsquerdo(sucessor.obterNoDireito());
                    sucessor.inserirDireito(currentno.obterNoDireito());
                }

                //� a raiz
                if (currentno == this.raiz) {
                    raiz = sucessor;
                } //� o filho a esquerda
                else if (currentno == currentno.pai.obterNoDireito()) {
                    currentno.pai.inserirDireito(sucessor);
                } else {
                    currentno.pai.inserirEsquerdo(sucessor);
                }

                sucessor.inserirEsquerdo(currentno.obterNoEsquerdo());

            }

        } else if (currentno.obterValor().compareTo(valor) == -1) {
            //System.out.println(currentno.obterValor() + "� menor que "+valor);
            removerNo(valor, currentno.obterNoDireito());
        } else {
            //System.out.println(currentno.obterValor() + "� mairo que "+valor);
            removerNo(valor, currentno.obterNoEsquerdo());

        }

        return null;
    }

    public No buscaNo(T valor) {
        //No no = new No((Comparable) raiz);
        return buscarNo(valor, this.raiz);
    }

    public No buscarNoByNome(String dado) {
        return buscarNoByNome(dado, this.raiz);
    }

    public No buscarNo(T dado, No no) {

        if (no == null) {
            return null;
        } else if (no.obterValor().compareTo(dado) == 0) {
            return no;
        } else if (no.obterValor().compareTo(dado) == 1) {
            return buscarNo(dado, no.obterNoDireito());
        } else {
            // vai para a esquerda
            return buscarNo(dado, no.obterNoEsquerdo());
        }
    }

    public No buscarNoByNome(String dado, No<Artista> no) {

        if (no == null) {
            return null;
        } else if (no.obterValor().getCantor().compareTo(dado) == 0) {
            return no;
        } else if (no.obterValor().getCantor().compareTo(dado) == 1) {
            return buscarNoByNome(dado, no.obterNoDireito());
        } else {
            // vai para a esquerda
            return buscarNoByNome(dado, no.obterNoEsquerdo());
        }
    }

    public No getSucessor(No atual, Boolean primeiraVez) {

        No sucessor = null;

        if (primeiraVez) {
            sucessor = atual.obterNoDireito();
        } else {
            sucessor = atual;
        }

        if (sucessor.obterNoEsquerdo() != null) {
            return getSucessor(sucessor.obterNoEsquerdo(), false);
        }

        return sucessor;
    }

     
}
