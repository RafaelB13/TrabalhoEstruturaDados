package estruturas.ListaCircular;

import classes.Album;


public class NoC <T extends Comparable<T>>{

	NoC<T> prior;
	NoC<T> next;
	public Album data;	
	
	public NoC(Album data) {
		this.data = data;
	}
	public NoC(Album data, NoC prior, NoC next) {
		this.data = data;
		this.prior = prior;
		this.next = next;
	}
	
	public NoC<T> obterAnterior() {
		return prior;
	}
	public void inserirAnterior(NoC prior) {
		this.prior = prior;
	}
	public NoC<T> obterProximo() {
		return next;
	}
	public void inserirProximo(NoC next) {
		this.next = next;
	}
	public Album obterValor() {
		return data;
	}
	public void inseriValor(Album data) {
		this.data = data;
	}
	public String toString() {
		return this.data.toString();
	}
}

