package Aplicacion;

import java.util.Scanner;

public class AplicacionBancaria {
	public static void main(String[] args) {

		CuentaBanco cb = new CuentaBanco("Jon", "K291SF");
		cb.showMenu();

	}
}

class CuentaBanco {

	int balance;
	int anteriorTransaccion;
	String nombreCliente;
	String idCliente;

	CuentaBanco(String nombreC, String idC) {
		nombreCliente = nombreC;
		idCliente = idC;

	}

	void depositar(int cantidad) {

		if (cantidad != 0) {
			balance = balance + cantidad;
			anteriorTransaccion = cantidad;
		}
	}

	void retirar(int cantidad) {
		if (cantidad != 0) {
			balance = balance - cantidad;
			anteriorTransaccion = -cantidad;
		}
	}

	void getAnteriorTransaccion() {
		if (anteriorTransaccion > 0) {
			System.out.println("Depositado: " + anteriorTransaccion);
		} else if (anteriorTransaccion < 0) {
			System.out.println("Retirado: " + Math.abs(anteriorTransaccion));
		} else {
			System.out.println("No ha habido transaccion");
		}
	}

	void showMenu() {
		char opcion = '\0';
		Scanner scanner = new Scanner(System.in);

		System.out.println("--------------------------------------------");
		System.out.println("Bienvenido " + nombreCliente);
		System.out.println("Tu ID es: " + idCliente);
		System.out.println("--------------------------------------------");
		System.out.println("\n");

		System.out.println("A. Balance Actual");
		System.out.println("B. Depositar");
		System.out.println("C. Retirar");
		System.out.println("D. Anterior Transaccion");
		System.out.println("E. Salir");

		do {
			System.out.println("=====================");
			System.out.println("Elige una opcion");
			System.out.println("=====================");
			opcion = scanner.next().charAt(0);
			System.out.println("\n");

			switch (opcion) {
			case 'A' | 'a':
				System.out.println("-------------------------------");
				System.out.println("Balance Actual = " + balance);
				System.out.println("-------------------------------");
				System.out.println("\n");
				break;
			case 'B' | 'b':
				System.out.println("-------------------------------");
				System.out.println("Introduce la cantidad que quieres DEPOSITAR:");
				System.out.println("-------------------------------");
				int cantidad = scanner.nextInt();
				depositar(cantidad);
				System.out.println("\n");
				break;
			case 'C' | 'c':
				System.out.println("-------------------------------");
				System.out.println("Introduce la cantidad que quieres RETIRAR:");
				System.out.println("-------------------------------");
				int cantidad1 = scanner.nextInt();
				retirar(cantidad1);
				System.out.println("\n");
				break;
			case 'D' | 'd':
				System.out.println("-------------------------------");
				getAnteriorTransaccion();
				System.out.println("-------------------------------");
				System.out.println("\n");
				break;
			case 'E':
				System.out.println("##############################");
				System.out.println("\n");
				break;

			default:
				System.out.println("Opcion no valida! Introduce una opcion");
				break;
			}

		} while (opcion != 'E');

		System.out.println("--------------------------------------------");
		System.out.println("Gracias por usar JonCorp");
		System.out.println("--------------------------------------------");

	}

}