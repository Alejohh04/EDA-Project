package tda;

public class Cola<T> {

    // Atributos
    private Nodo<T> cabeza;
    private Nodo<T> ultimo;

    // Constructores
    public Cola() {
        cabeza = null;
        ultimo = null;
    }

    // Si la cola esta vacia
    public boolean esVacia() {
        if (cabeza == null) {
            return true;
        } else {
            return false;
        }
    }

    // encolar: agregar un nuevo elemento a al final de la cola
    public void encolar(T pElemento) {
        Nodo<T> nuevoNodo = new Nodo(pElemento, null);
        if (esVacia() == true) {
            cabeza = nuevoNodo;
            ultimo = nuevoNodo;
        } else { // la cola no esta vacia
            ultimo.setSgteNodo(nuevoNodo);
            ultimo = nuevoNodo;

        }
    }

    // desencolar: eliminar el elemento que esta al frente de la cola
    // nos devuelve el elemento eliminado
    public T desencolar() {
        if (esVacia() == false) {
            T x = cabeza.getElemento();
            Nodo<T> aux = cabeza;
            cabeza = aux.getSgteNodo();
            return x;
        } else {
            throw new RuntimeException("ERROR: no es posible desencolar");
        }
    }

    public T frente() {
        if (!esVacia()) {
            return cabeza.getElemento();
        } else {
            throw new RuntimeException("ERROR: no es posible devolver frente");
        }
    }

    public int longitud() {
        int i = 0;
        Nodo<T> aux = cabeza;
        while (aux != null) {
            aux = aux.getSgteNodo();
            i++;
        }
        return i;
    }
}
