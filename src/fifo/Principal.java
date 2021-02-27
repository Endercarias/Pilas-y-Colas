package fifo;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner reader1= new Scanner(System.in);
		int opcion=0,avion=0, matricula, close=0;
		Cola fila=new Cola();
		do {
			try {
				
				System.out.println("1. Ingresar matrícula del avión que va entrando al hangar (Max=10 aviones");
				System.out.println("2. Cuando va salir del hangar un avión");
				System.out.println("3. ¿Hay aviones en el hangar o esta vacio?");
				System.out.println("4. Avión próximo o primero en despegar");
				System.out.println("5. Número de aviones en el hangar");
				System.out.println("6. Salir");
				opcion = reader1.nextInt();
				
				switch(opcion) {
				case 1:
					do {
					System.out.println("Ingresar matrícula del avión (Max=10 aviones) ");
					matricula=reader1.nextInt();
					fila.insertar(matricula);
					
					if (fila.tamañoCola() <= 10) {
						
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
						System.out.println("El avión que va saliendo del hangar es: " + fila.quitar());
					}else {
						System.out.println("El hangar esta vacío");
					}
					break;
					
				case 3:
					if(fila.estaVacia()) {
						System.out.println("El hangar esta vacío");
					}else {
						System.out.println("El hangar tiene aviones");
					}
					
					break;
					
				case 4:
					if(!fila.estaVacia()) {
						System.out.println("El avión por salir es: " + fila.inicioCola());
					}else {
						System.out.println("El hangar esta vacío");
					}
					
					break;
					
				case 5:
					if(!fila.estaVacia()) {
						System.out.println("El número de los aviones que están dentro del hangar es:" + fila.tamañoCola());
					}else {
						System.out.println("El hangar esta vacío");
					}
					break;
					
				case 6:
					System.out.println("Programa finalizado");
					break;
				default:
					System.out.println("Opción incorrecta");
					
				}
				
			}catch(NumberFormatException a) {
				System.out.println("opción no existente");
			}
		}while(opcion!=6);
	}
	

}
