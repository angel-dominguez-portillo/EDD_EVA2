
public class EVA2_8_TIPO_GENERICOS {
    public static void main(String args[]){
        int x = 100;
        Integer val = x;

        Prueba<Integer> prueba = new Prueba<>(val);
        System.out.println(prueba.getDato());
    }
}

class Prueba<T>{
    private T dato;
    public Prueba(T dato) {
        this.dato = dato;
    }
    public void setDato(T dato) {
        this.dato = dato;
    }
    public T getDato() {
        return dato;
    }
}