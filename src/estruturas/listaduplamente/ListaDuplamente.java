package estruturas.listaduplamente;


public class ListaDuplamente<Album extends Comparable<Album>> {

    NoL primeiro;
    NoL no_atual = primeiro;

    public void inserir(Album valor) {
        NoL novo_no = new NoL(valor);
        NoL auxiliar = primeiro;

        if (this.primeiro == null) {
            this.primeiro = novo_no;
            no_atual = primeiro;

        } else {

            while ((auxiliar.obterProximo() != null)
                    && (auxiliar.obterValor().compareTo(novo_no.obterValor()) == -1)) {
                auxiliar = auxiliar.obterProximo();
            }

            if (auxiliar == this.primeiro) {

                if (this.primeiro.obterValor().compareTo(novo_no.obterValor()) == -1) {

                    this.primeiro.inserirProximo(novo_no);
                    novo_no.inserirAnterior(this.primeiro);

                } else {

                    novo_no.inserirProximo(this.primeiro);
                    this.primeiro.inserirAnterior(novo_no);
                    this.primeiro = novo_no;
                    no_atual = primeiro;
                }

            } else {

                if (auxiliar.obterProximo() == null) {
                    novo_no.inserirAnterior(auxiliar);
                    auxiliar.inserirProximo(novo_no);
                } else {
                    novo_no.inserirProximo(auxiliar);
                    novo_no.inserirAnterior(auxiliar.obterAnterior());
                    auxiliar.obterAnterior().inserirProximo(novo_no);
                    auxiliar.inserirAnterior(novo_no);
                }
            }

        }

    }
    
    public NoL getNoAtual(){
        return no_atual;
    }
    
    public void nextNoAtual(){
        if(no_atual!= null)
            no_atual = no_atual.obterProximo();
    }
    
    public NoL remover(Album valor) {//arrumada 

        NoL auxiliar = primeiro;

        NoL retorno = null;

        while ((auxiliar != null) && (auxiliar.obterValor().compareTo(valor) != 0)) {
            auxiliar = auxiliar.obterProximo();
        }

        if (auxiliar == this.primeiro) {

            retorno = this.primeiro;
            retorno.inserirProximo(null);
            this.primeiro = this.primeiro.obterProximo();
            this.primeiro.inserirAnterior(null);

        } else if (auxiliar != null) {
            auxiliar.obterAnterior().inserirProximo(auxiliar.obterProximo());
        }
        auxiliar.obterProximo().inserirAnterior(auxiliar.obterAnterior());
        auxiliar.inserirProximo(null);
        auxiliar.inserirAnterior(null);

        return retorno;

    }

    public NoL<Album> buscar(Album valor) {

        if (no_atual == null) {
            no_atual = primeiro;
        }

        while ((no_atual != null) && (no_atual.obterValor().compareTo(valor)) != 0) {
            if (no_atual.obterValor().compareTo(valor) == -1) {
                no_atual = no_atual.obterProximo();
            } else {
                no_atual = no_atual.obterAnterior();
            }

        }

        return no_atual;
    }

    public String buscarCount(Album valor) {

        int count = 0;

        if (no_atual == null) {
            no_atual = primeiro;
        }

        while ((no_atual != null) && (no_atual.obterValor().compareTo(valor)) != 0) {
            count++;
            if (no_atual.obterValor().compareTo(valor) == -1) {
                no_atual = no_atual.obterProximo();
            } else {
                no_atual = no_atual.obterAnterior();
            }
        }

        return "Achou " + no_atual.obterValor() + " com " + count + " passos";
    }

    public String toString() {
        String s = "";
        NoL auxiliar = primeiro;

        while (auxiliar != null) {

            s += auxiliar.obterValor().toString();

            auxiliar = auxiliar.obterProximo();
        }

        return s;
    }

}
