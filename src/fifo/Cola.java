package fifo;

public class Cola {

	NodoCola inicio, fin;
	int tama�o;
	public Cola() {
		inicio=fin=null;
		tama�o=0;
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
		tama�o++;
		}
	public int quitar() {
		int aux=inicio.avion;
		inicio=inicio.siguiente;
		tama�o--;
		return aux;
	}
	public int inicioCola() {
		return inicio.avion;
	}
	public int tama�oCola() {
		return tama�o;
	}
	
}
