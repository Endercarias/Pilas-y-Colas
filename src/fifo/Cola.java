package fifo;

public class Cola {

	NodoCola inicio, fin;
	int tamaño;
	public Cola() {
		inicio=fin=null;
		tamaño=0;
	}
	public boolean estaVacia() {
		return inicio==null;
	}
	public void insertar (int ele) {
		NodoCola nuevo= new NodoCola(ele);
		if (estaVacia()) {
			inicio=nuevo;	
		}else {
			fin.siguiente=nuevo;
		}
		fin=nuevo;
		tamaño++;
		}
	public int quitar() {
		int aux=inicio.avion;
		inicio=inicio.siguiente;
		tamaño--;
		return aux;
	}
	public int inicioCola() {
		return inicio.avion;
	}
	public int tamañoCola() {
		return tamaño;
	}
	
}
