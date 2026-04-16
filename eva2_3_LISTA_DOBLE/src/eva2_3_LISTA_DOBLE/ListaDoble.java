package eva2_3_LISTA_DOBLE;

public class ListaDoble {
	private Nodo inicio;//aqui iniciamos todo
	private Nodo fin;//aqui terminamos nuestra lista
	private int cont; //<-- longuitud 2
	
	public ListaDoble() {
		this.inicio = null;//Al crear la lista esta vacia
		this.fin = null;
		this.cont = 0; // <-- longuitud 2
	}
	public void imprimirLista() {
		Nodo temp = inicio;
		while(temp != null) {
			System.out.print("[" + temp.getValor() + "]");
			temp = temp.getSiguiente();
		}
		System.out.println("");
	}
	
	public int longitud() {
        return cont;
    }
	
	public void imprimirListaInv() {
		Nodo temp = fin;
		while(temp != null) {
			System.out.print("[" + temp.getValor() + "]");
			temp = temp.getPrevio();
		}
		System.out.println("");
	}

	public void vaciarLista() {
		inicio = null;
		fin = null;
		cont = 0;// <-- longitud 2
	}
	
	public boolean esVacia() {//isEmpty()
		if(inicio == null)
			return true;
		else
			return false;
	}
	
	public void agregar(int valor) {
		Nodo nuevo = new Nodo(valor);
		if(inicio == null) {
			inicio = nuevo;//agrego el nuevo nodo
			fin = nuevo;
		}else {
				fin.setSiguiente(nuevo);
				nuevo.setPrevio(fin);//conectamos el nuevo nodo al final de la lista
				fin = nuevo;
			}
		cont++;
	}
	
	//O(N)
			public void agregarEn(int posi, int valor) {

				int tama = longitud();
				if((posi < 0) && (posi >= tama)) {
					throw new RuntimeException("La posición no existe en le lista");
				}else {
					Nodo nuevo = new Nodo(valor);
					if(posi == 0){//inicio de la lista
						nuevo.setSiguiente(inicio);
						inicio = nuevo;
						
					}
					else{//CUALQUIER OTRA POSICIÓN
						//TENEMOS QUE MOVERNOS DE POCISIÓN
						int cont = 0;
						Nodo temp = inicio;
						while(cont < (posi - 1)) {//temp tiene que quedar 1 posición menos
							temp = temp.getSiguiente();
							cont++;
						}
						nuevo.setSiguiente(temp.getSiguiente());   //nuevo apunta al que era siguiente de temp
						nuevo.setPrevio(temp);                     //nuevo apunta hacia atrás a temp

						if (nuevo.getSiguiente() != null) {
						    nuevo.getSiguiente().setPrevio(nuevo); //el siguiente ahora apunta de vuelta a nuevo
						}
						temp.setSiguiente(nuevo);                  //temp apunta al nuevo (siempre al final)
						//Actualizar fin si nuevo quedó al final
						if (nuevo.getSiguiente() == null) {
						    fin = nuevo;
						}
					}
					cont++;
				
				}
			}
			public int encontrarEn(int posi) {
				int tama = longitud();
				if((posi < 0) && (posi >= tama)) {
					throw new RuntimeException("La posición no existe en le lista");
				}else {
					//CASOs
					if(posi == 0){//inicio de la lista
						return inicio.getValor();
					}else{//CUALQUIER OTRA POSICIÓN
						//TENEMOS QUE MOVERNOS DE POCISIÓN
						int cont = 0;
						Nodo temp = inicio;
						while(cont < posi) {
							temp = temp.getSiguiente();
							cont++;
						}
						return temp.getValor();
					}
				}
			}
			public void borrarEn(int posi) {
				//VALIDAR:
				//DE INICIO(0) HASTA FIN(N - 1) N ---> LONGITUD
				int tama = longitud();
				if((posi < 0) && (posi >= tama)) {
					throw new RuntimeException("La posición no existe en le lista");
				}else {
					//CASOs
					if(posi == 0){//inicio de la lista
						inicio = inicio.getSiguiente();
						if(inicio == null) {
							fin = inicio;
						}
					}else{//CUALQUIER OTRA POSICIÓN
						//TENEMOS QUE MOVERNOS DE POCISIÓN
						int cont = 0;
						Nodo temp = inicio;
						while(cont < (posi - 1)) {//temp tiene que quedar 1 posición menos
							temp = temp.getSiguiente();
							cont++;
						}
						//des-CONECTAR AL SIGUIENTE
						temp.setSiguiente(temp.getSiguiente().getSiguiente());
						if(temp.getSiguiente() != null) {
							temp.getSiguiente().setPrevio(temp);
						}else {
						    fin = temp;
						}
					}
					cont--;// <-- longitud 2
				}
			}
}
