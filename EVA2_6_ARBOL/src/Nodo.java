


public class Nodo{
	private int valor;
	private Nodo izquierda;
	private Nodo derecha;
	
	//constructor default
	public Nodo(){
		this.izquierda = null;//va a marcar el fin de la lista
		this.derecha = null;
	}
	
	//constructor acepte el valor
	public Nodo(int valor){
		this.valor = valor;
		this.izquierda = null;
		this.derecha = null;
	}
	
	//metodos guet y set
	public int getValor() {
		return valor;
	}
	public void setValor() {
		this.valor = valor;
	}
	public Nodo getIzquierda() {
		return izquierda;
	}
	public void setIzquierda(Nodo izquierda) {
		this.izquierda = izquierda;
	}
	public Nodo getDerecha() {
		return derecha;
	}
	public void setDerecha(Nodo derecha) {
		this.derecha = derecha;
	}
}
