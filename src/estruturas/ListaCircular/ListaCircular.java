package estruturas.ListaCircular;

import classes.Album;

public class ListaCircular<T extends Comparable<T>> {

    public NoC<T> primeiro;
    public NoC<T> noAtual;
    public int qtdNo = 0;
    public int indiceNoAtual = 0;

    public ListaCircular() {
        this.primeiro = null;
    }

    public void inserir(T valor) {
        qtdNo++;
        NoC novo_no = new NoC((Album) valor);

        if (this.primeiro == null) {
            this.primeiro = novo_no;
            noAtual = this.primeiro;
            this.primeiro.inserirProximo(novo_no);
            this.primeiro.inserirAnterior(novo_no);
        } else {
            NoC temp = this.primeiro;
            //apenas 1 n�
            if (temp.obterProximo() == temp) {
                temp.inserirProximo(novo_no);
                temp.inserirAnterior(novo_no);
                novo_no.inserirAnterior(temp);
                novo_no.inserirProximo(temp);

                //o n� inserido � menor que o primeiro n�
            } else if (novo_no.obterValor().compareTo(this.primeiro.obterValor()) == -1) {

                novo_no.inserirProximo(this.primeiro);
                novo_no.inserirAnterior(this.primeiro.obterAnterior());
                this.primeiro.obterAnterior().inserirProximo(novo_no);
                this.primeiro.inserirAnterior(novo_no);

                this.primeiro = novo_no;
                noAtual = this.primeiro.obterAnterior();

            } else {

                //enquanto o novo n� for maior que o temp (at� encontrar algu�m maior
                //que ele
                while ((novo_no.obterValor().compareTo(temp.obterValor()) == 1)) {
                    temp = temp.obterProximo();

                    //fechou um ciclo
                    if (temp == this.primeiro) {
                        break;
                    }
                }

                novo_no.inserirProximo(temp);
                temp.obterAnterior().inserirProximo(novo_no);
                novo_no.inserirAnterior(temp.obterAnterior());
                temp.inserirAnterior(novo_no);

            }
        }
    }

    public NoC getNoAtual() {
        return noAtual;
    }
    
    public void nextNoAtual(){
        if(noAtual!= null)
            noAtual = noAtual.obterProximo();
    }

    public void remover(T valor) {

        NoC n = buscarOtim(valor);

        if (n != null) {
            qtdNo--;
            if (n == this.primeiro) {

                this.primeiro.obterAnterior().inserirProximo(this.primeiro.obterProximo());
                this.primeiro.obterProximo().inserirAnterior(this.primeiro.obterAnterior());
                this.primeiro = this.primeiro.obterProximo();

            } else {

                n.obterAnterior().inserirProximo(n.obterProximo());
                n.obterProximo().inserirAnterior(n.obterAnterior());

            }

        }

    }

    public NoC<T> buscar(Comparable valor) {
        NoC temp = this.primeiro;

        while (valor.compareTo(temp.obterValor()) == 1) {
            temp = temp.obterProximo();

            //fechou um ciclo ou passou do valor
            if ((temp == this.primeiro) || (valor.compareTo(temp.obterValor()) == -1)) {
                return null;
            }
        }

        return temp;

    }

    public NoC<T> buscarOtim(Comparable valor) {

        boolean prior = true;
        boolean next = true;

        //valor buscado � menor que o currenteNode?
        if (valor.compareTo(noAtual.obterValor()) == -1) {

            //estou em 90% do final da lista
            if (indiceNoAtual < qtdNo * 0.9) {
                prior = false;
            }

        } else if (valor.compareTo(noAtual.obterValor()) == 1) {

            //estou em 10% do final da lista
            if (indiceNoAtual < qtdNo * 0.1) {
                next = false;
            }

        } else {
            return noAtual;
        }

        NoC stop = noAtual;

        if ((prior) || (!next)) {
            this.obterNoAnterior();
        } else if ((next) || (!prior)) {
            this.obterNoProximo();
        }

        while (valor.compareTo(noAtual.obterValor()) != 0) {
            if ((prior) || (!next)) {
                this.obterNoAnterior();
            } else if ((next) || (!prior)) {
                this.obterNoProximo();
            }

            //fechou um ciclo
            if (noAtual == stop) {
                return null;
            }
        }

        return noAtual;

    }

    public NoC<T> obterNoProximo() {
        indiceNoAtual++;
        noAtual = noAtual.obterProximo();
        return noAtual;
    }

    public NoC<T> obterNoAnterior() {
        indiceNoAtual--;
        noAtual = noAtual.obterAnterior();
        return noAtual;
    }

    public void resetCurrentNode() {
        this.noAtual = this.primeiro.obterAnterior();
    }

    public String toString() {
        String s = "";
        resetCurrentNode();
        NoC stop = noAtual;

        do {
            obterNoProximo();
            s += noAtual.obterValor().toString() + " - ";
        } while (noAtual != stop);

        return s;
    }

}
