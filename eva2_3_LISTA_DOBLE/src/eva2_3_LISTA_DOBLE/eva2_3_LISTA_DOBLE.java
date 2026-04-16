package eva2_3_LISTA_DOBLE;

public class eva2_3_LISTA_DOBLE {
	public static void main(String args[]){
		ListaDoble lista = new ListaDoble();
		lista.agregar(100);
		lista.agregar(200);
		lista.agregar(300);
		lista.agregar(400);
		lista.agregar(500);
		lista.imprimirListaInv();
		lista.imprimirLista();
		lista.agregarEn(2, 400);
		
		lista.imprimirLista();
		lista.imprimirListaInv();
		lista.borrarEn(2);
		lista.imprimirLista();
		lista.imprimirListaInv();
		System.out.println("Cantidad de nodos: " + lista.longitud());
	}

}
