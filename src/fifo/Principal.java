package fifo;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner reader1= new Scanner(System.in);
		int opcion=0,avion=0, matricula, close=0;
		Cola fila=new Cola();
		do {
			try {
				
				System.out.println("1. Ingresar matr�cula del avi�n que va entrando al hangar (Max=10 aviones");
				System.out.println("2. Cuando va salir del hangar un avi�n");
				System.out.println("3. �Hay aviones en el hangar o esta vacio?");
				System.out.println("4. Avi�n pr�ximo o primero en despegar");
				System.out.println("5. N�mero de aviones en el hangar");
				System.out.println("6. Salir");
				opcion = reader1.nextInt();
				
				switch(opcion) {
				case 1:
					do {
					System.out.println("Ingresar matr�cula del avi�n (Max=10 aviones) ");
					matricula=reader1.nextInt();
					fila.insertar(matricula);
					
					if (fila.tama�oCola() <= 10) {
						
					}else {
						System.out.println("Ingrese 1 para salio o 0 para seguir ingresando");
						close=reader1.nextInt();
					}
					System.out.println("Ingrese 1 para salio o 0 para seguir ingresando");
					close=reader1.nextInt();
					}while(close != 1);
					break;
					
				case 2:
					if (!fila.estaVacia()) {
						System.out.println("El avi�n que va saliendo del hangar es: " + fila.quitar());
					}else {
						System.out.println("El hangar esta vac�o");
					}
					break;
					
				case 3:
					if(fila.estaVacia()) {
						System.out.println("El hangar esta vac�o");
					}else {
						System.out.println("El hangar tiene aviones");
					}
					
					break;
					
				case 4:
					if(!fila.estaVacia()) {
						System.out.println("El avi�n por salir es: " + fila.inicioCola());
					}else {
						System.out.println("El hangar esta vac�o");
					}
					
					break;
					
				case 5:
					if(!fila.estaVacia()) {
						System.out.println("El n�mero de los aviones que est�n dentro del hangar es:" + fila.tama�oCola());
					}else {
						System.out.println("El hangar esta vac�o");
					}
					break;
					
				case 6:
					System.out.println("Programa finalizado");
					break;
				default:
					System.out.println("Opci�n incorrecta");
					
				}
				
			}catch(NumberFormatException a) {
				System.out.println("opci�n no existente");
			}
		}while(opcion!=6);
	}
	

}
