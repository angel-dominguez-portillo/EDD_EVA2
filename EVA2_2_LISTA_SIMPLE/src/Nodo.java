
public class Nodo{
	private int valor;
	private Nodo siguiente;
	
	//constructor default
	public Nodo(){
		this.siguiente = null;//va a marcar el fin de la lista
	}
	
	//constructor acepte el valor
	public Nodo(int valor){
		this.valor = valor;
		this.siguiente = null;
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
	 
}
