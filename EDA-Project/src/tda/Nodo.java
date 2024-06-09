package tda;

public class Nodo<T> {
    // Atributos
    private T elemento;
    private Nodo sgteNodo;
    // Constructores
    public Nodo(){
        elemento = null;
        sgteNodo = null;
    }
    public Nodo(T pElemento, Nodo pSgteNodo){
        elemento = pElemento;
        sgteNodo = pSgteNodo;
    }
    // Getter and Setter
    public void setElemento(T pElemento){
        elemento = pElemento;
    }
    public T getElemento(){
        return elemento;
    }
    public void setSgteNodo(Nodo pSgteNodo){
        sgteNodo = pSgteNodo;
    }
    public Nodo getSgteNodo(){
        return sgteNodo;
    }
}
