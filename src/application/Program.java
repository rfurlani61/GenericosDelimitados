package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Entre com o nome do produto: ");
		String nome = sc.next();
		System.out.print("Preco");
		Double preco = sc.nextDouble();
	}

}
