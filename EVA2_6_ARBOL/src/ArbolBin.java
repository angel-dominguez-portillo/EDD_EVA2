

public class ArbolBin{
	private Nodo raiz;
	public ArbolBin() {
		raiz = null;
	}
	public void agregar(int valor) {
		//VARIFICAMOS SI HAY NODOS EN EL ARBOL.
		//SI EL ARBOL ESTA VACÍO: FACIL
		if(raiz == null) {//la raiz es el nuevo nono8
			raiz = new Nodo(valor);
		}else {
			agregarRecu(raiz, valor);
		}
	}
	//O(log2N)// --> SOLO SI EL ARBOL ES BALANCEADO:
	private void agregarRecu(Nodo actual, int valor) {
		if(valor < actual.getValor()) {
			if (valor < actual.getValor()){//LADO IZQUIERDO
	            if(actual.getIzquierda()== null){//ESPACIO DISPONIBLE
	            	
	            //INSERTAMOS
	            Nodo nuevo = new Nodo(valor);
	            actual.setIzquierda(nuevo);//agregamos el nuevo nodo 
	            }else{//ESPACIO OCUPADO
	                //MOVERNOS
	                agregarRecu(actual.getIzquierda(),valor);
	                }
	            }if (valor > actual.getValor()){//LADO DERECHO
	                if(actual.getDerecha()== null){//ESPACIO DISPONIBLE
	                    //INSERTAMOS
	                Nodo nuevo = new Nodo(valor);
	                actual.setDerecha(nuevo);//agregamos el nuevo nodo 
	                }else{//ESPACIO OCUPADO
	                    //MOVERNOS
	                    agregarRecu(actual.getDerecha(),valor);
	                }
	            }
			}
		}   
	    public void imprimirPreOrder(){
	        imprimirPreOrderRec(raiz);//INICIÁMOS EN EL ROOT
	    }
	    //O(N) ---> IMPRIMIR(VISITAR) TODOS LOS NODOS DEL ARBOL
	    public void imprimirPreOrderRec(Nodo actual){
	        if(actual != null){
	        System.out.print("[" + actual.getValor() + "]"); //VISITAR EL NODO
	        //RECORRER EL LADO IZQUIERDO
	        imprimirPreOrderRec(actual.getIzquierda());
	        //RECORRER EL LADO DERECHO
	        imprimirPreOrderRec(actual.getDerecha());
	        }
	    }
	        public void imprimirPosOrder(){
	        imprimirPosOrderRec(raiz);
	    }
	        public void imprimirPosOrderRec(Nodo actual){
	        if(actual != null){

	        imprimirPreOrderRec(actual.getIzquierda());
	        
	        imprimirPreOrderRec(actual.getDerecha());
	        
	        System.out.print("[" + actual.getValor() + "]");
	        }
	    }
	        
	    public void imprimirInOrder(){
	        imprimirInOrderRec(raiz);
	    }
	    public void imprimirInOrderRec(Nodo actual){
	    	if(actual != null){
	        	imprimirPreOrderRec(actual.getIzquierda());
	        	System.out.print("[" + actual.getValor() + "]");
	        	imprimirPreOrderRec(actual.getDerecha());
	        }
	    }
	    
	}