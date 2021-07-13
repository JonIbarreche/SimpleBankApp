package Aplicacion;

import java.util.Scanner;

public class AplicacionBancaria {
	public static void main(String[] args) {

		CuentaBanco cb = new CuentaBanco("Jon", "K291SF");
		cb.showMenu();

	}
}