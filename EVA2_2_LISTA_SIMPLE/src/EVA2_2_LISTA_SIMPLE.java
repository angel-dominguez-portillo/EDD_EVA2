
public class EVA2_2_LISTA_SIMPLE {
	public static void main(String args[]){
		long ini, fin, tiempo;
		Lista lista = new Lista();
		int[] arreglo = new int[1000000];
		
		
		ini = System.nanoTime();
		//operacioni
		for(int i = 0; i < arreglo.length; i++) {
			arreglo[i] = (int)(Math.random() * 1000);
		}
		fin = System.nanoTime();
		tiempo = fin - ini;//tiempo en nanosegundos (mil millonésimas de segundo)
		
		
		System.out.println("Arreglo = " + tiempo);
		
		for(int i = 0; i < 1000000; i++) {
			lista.agregar((int)(Math.random() * 1000));
		}
		fin = System.nanoTime();
		tiempo = fin - ini;//tiempo en nanosegundos (mil millonésimas de segundo)
		System.out.println("Lista = " + tiempo);
		System.out.println("longitud = " + lista.longitud());
		lista.vaciarLista();
		lista.imprimirLista();
		System.out.println("longitud = " + lista.longitud());
		
		
		lista.agregar(100);
		lista.agregar(200);
		lista.agregar(300);
		lista.agregar(400);
		lista.agregar(500);
		lista.imprimirLista();
		System.out.println("Cantidad de nodos: " + lista.longitud());
		System.out.println("");
		lista.agregarEn(2, -1);
		lista.imprimirLista();
		System.out.println("Cantidad de nodos: " + lista.longitud());
		
		System.out.println("");
		System.out.println("valor posicion 1 = " + lista.encontrarEn(0));
		System.out.println("valor posicion 2 = " + lista.encontrarEn(1));
		System.out.println("valor posicion 3 = " + lista.encontrarEn(2));
		System.out.println("valor posicion 4 = " + lista.encontrarEn(3));
		
		lista.borrarEn(2);
		System.out.println("");
		lista.imprimirLista();
		
		System.out.println("");
		lista.imprimirListaInv1();
		System.out.println("longitud por metodo O(1): " + lista.longitud2());
		lista.imprimirListaInv2();
	}

}
