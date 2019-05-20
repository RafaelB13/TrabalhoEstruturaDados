package classes;




public class No<Artista extends Comparable<Artista>> {
	
	No esquerdo;
	No direito;
	Artista valor;
	No pai;
	
	public No(Artista valor) {
		this.valor = valor;
	}
	
	public No(Artista valor, No pai) {
		this.valor = valor;
		this.pai = pai;
	}
	
	
	public void inserirValor(Artista valor) {
		this.valor = valor;
	}
	
	public Artista obterValor() {
		return this.valor;
	}
	
	
	public void inserirEsquerdo(No esquerdo) {
		this.esquerdo = esquerdo;
		if(esquerdo != null)
		esquerdo.pai = this;
	}
	
	public void inserirDireito(No direito) {
		this.direito = direito;
		if(direito != null)
		direito.pai = this;
	}
	
	public No obterNoEsquerdo() {
		return this.esquerdo;
	}
	
	public No obterNoDireito() {
		return this.direito;
	}
	
	public String toString() {
		return this.valor.toString();
	}
	
	public void inseriPai(No pai) {
		this.pai = pai;
	}
	
	public No obterPai() {
		return this.pai;
	}

	
	
	
}
