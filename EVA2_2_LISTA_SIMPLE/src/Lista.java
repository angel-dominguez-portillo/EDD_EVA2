

public class Lista {
	private Nodo inicio;//aqui iniciamos todo
	private Nodo fin;//aqui terminamos nuestra lista
	private int cont2; //<-- longuitud 2
	
	public Lista() {
		this.inicio = null;//Al crear la lista esta vacia
		this.fin = null;
		this.cont2 = 0; // <-- longuitud 2
	}
	
	//agrregarmun nodo
	
	//O(N)EFICIENCIA POR MOVERNOSA NODO POR NODO
	//O(1)EFICIENCIA POR ESTAR EL FINAL DE LA LISTA
	public void agregar(int valor) {
		Nodo nuevo = new Nodo(valor);
		//vamos a incertar un NODO al final de la lista
		//pero
		//Hay que verificar que estado tiene la lista
		//Lista vacia
		
		if(inicio == null) {
			inicio = nuevo;//agrego el nuevo nodo
			fin = nuevo;
		}else {
			//esto es para mover a temp al ultimo NODO
			/*
			Nodo temp = inicio;
			while(temp.getSiguiente() != null) {
				temp = temp.getSiguiente();
			}
				temp.setSiguiente(nuevo);//conectamos el nuevo nodo al último de la lista
				*/
				fin.setSiguiente(nuevo);
				fin = nuevo;
			}
		cont2++;
	}
	//O(N)---------->Hacerlo qui imprima inverzo
	
		public void imprimirLista() {
			Nodo temp = inicio;
			while(temp != null) {
				System.out.print("[" + temp.getValor() + "]");
				temp = temp.getSiguiente();
			}
			System.out.println("");
	}
		public void imprimirListaInv2() {
			for(int i = longitud2() - 1; i >= 0; i--) {
				System.out.print("[" + encontrarEn(i) + "]");
			}
		}
		 
	//----------------inverso----------------
		public void imprimirListaInv1() {
			int cont = 0;
			int con = 0;
			Nodo temp = inicio;
			System.out.println("----------Impreso inverso-----------------");
			while(temp != null) {
				cont++;
				con++;
				temp = temp.getSiguiente();
			}
			while(con > 0) {		
				temp = inicio;
				cont = con;
				while(cont > 1) {
					temp = temp.getSiguiente();
					cont--;
				}
				System.out.print("[" + temp.getValor() + "]");
				con--;
			}
			System.out.println("");
		}
		//O(1)
		public void vaciarLista() {
			inicio = null;
			fin = null;
			cont2 = 0;// <-- longitud 2
		}
		//O(N)--- hacerlo O(1)
		public int longitud() {
			int cont = 0;
			Nodo temp = inicio;
			while(temp != null) {
				cont++;
				temp = temp.getSiguiente();
			}
			return cont;
	}
		//---------------O(1)
		public int longitud2() {
	        return cont2;
	    }
		//O(N)
		public void agregarEn(int posi, int valor) {
			//VALIDAR:
			//DE INICIO(0) HASTA FIN(N - 1) N ---> LONGITUD
			int tama = longitud();
			if((posi < 0) && (posi >= tama)) {
				throw new RuntimeException("La posición no existe en le lista");
			}else {
				Nodo nuevo = new Nodo();
				//CASOs
				if(posi == 0){//inicio de la lista
					nuevo.setSiguiente(inicio);
					inicio = nuevo;
				}else{//CUALQUIER OTRA POSICIÓN
					//TENEMOS QUE MOVERNOS DE POCISIÓN
					int cont = 0;
					Nodo temp = inicio;
					while(cont < (posi - 1)) {//temp tiene que quedar 1 posición menos
						temp = temp.getSiguiente();
						cont++;
					}
					//CONECTAR
					nuevo.setSiguiente(temp.getSiguiente());
					temp.setSiguiente(nuevo);
				}
				cont2++;// <-- longitud 2
			}
		}
		
		public boolean esVacia() {//isEmpty()
			if(inicio == null)
				return true;
			else
				return false;
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
					if(temp.getSiguiente() == null) {
						fin = inicio;
					}
				}
				cont2--;// <-- longitud 2
			}
		}
		
}
