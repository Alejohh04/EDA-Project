package tda;

public class Pila<T> {

    // Atributos

    private Nodo<T> cima;

    // Constructor para crear una pila
    public Pila() { // objeto pila totalmente vacia
        cima = null;
    }

    // Otro metodos
    // Verifica si una pila esta vacia

    public boolean estaVacia() {
        return cima == null;
    }

    // push() - Apilar: Añade un elemento en la cima de la pila

    public void apilar(T elemento) {
        Nodo<T> nuevoNodo = new Nodo(elemento, null);
        if (estaVacia()) {
            cima = nuevoNodo;
        } else { // la pila no esta vacia
            nuevoNodo.setSgteNodo(cima);
            cima = nuevoNodo;
        }
    }

    // pop() - desapilar: Sacar un elemento de la pila

    public T desapilar() {
        if (!estaVacia()) {
            // eliminar el nodo de la cima
            T elemento = cima.getElemento();
            cima = cima.getSgteNodo();
            return elemento;
        } else {
            throw new RuntimeException("ERROR: no es posible desapilar");
        }

    }

    public T cima() {
        if (!estaVacia()) {
            return cima.getElemento();
        } else {
            throw new RuntimeException("ERROR: no es posible devolver cima");
        }
    }

    public int longitud() {
        int i = 0;
        Nodo<T> aux = cima;
        while (aux != null) {
            aux = aux.getSgteNodo();
            i++;
        }
        return i;
    }
}
