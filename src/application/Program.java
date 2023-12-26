package application;

import java.util.Scanner;

import services.PrintService;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		PrintService<String> ps = new PrintService<>(); // Sinal de menor e sinal de maior indica que é do tipo generics
		
		System.out.println("How many values?");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			String value = sc.next();
			ps.addValue(value);
		}
		
		ps.print();
		String x = ps.first(); // não pode converter object para int se não por casting
		System.out.println("First: " + x);
		
		sc.close();
	}

}
