package eva2_3_LISTA_DOBLE;


public class Nodo{
	private int valor;
	private Nodo siguiente;
	private Nodo previo;
	
	//constructor default
	public Nodo(){
		this.siguiente = null;//va a marcar el fin de la lista
		this.previo = null;
	}
	
	//constructor acepte el valor
	public Nodo(int valor){
		this.valor = valor;
		this.siguiente = null;
		this.previo = null;
	}
	
	//metodos guet y set
	public int getValor() {
		return valor;
	}
	public void setValor() {
		this.valor = valor;
	}
	public Nodo getSiguiente() {
		return siguiente;
	}
	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}
	public Nodo getPrevio() {
		return previo;
	}
	public void setPrevio(Nodo previo) {
		this.previo = previo;
	}
}
