public class EVA2_5_HEAP {
    public static void main(String args[]) {
 
        Pila pila = new Pila();
 
        pila.push(100);
        pila.push(200);
        pila.push(300);
        pila.push(400);
        pila.push(500);
 
        System.out.println("");
        pila.imprimirListaInv();                              
        System.out.println("[" + pila.peek() + "]");         
        pila.imprimirLista();                                
 
        System.out.println("");
        System.out.println("adios al :" + pila.pop());   
        pila.imprimirLista();
        pila.imprimirListaInv();
        System.out.println("Cantidad de nodos: " + pila.longitud());
 
        System.out.println("adios al :" + pila.pop());   
        pila.imprimirLista();
        pila.imprimirListaInv();
        System.out.println("Cantidad de nodos: " + pila.longitud());
 
        pila.push(900);                                    
    }
}