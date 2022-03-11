package perimetroDoRetangulo;

import java.util.Locale;
import java.util.Scanner;

import entities.CalculoPerimetro;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		CalculoPerimetro calculo = new CalculoPerimetro();
		System.out.println("Enter rectangle width and height: ");
		System.out.println("Rectangle height: ");
		calculo.height = leia.nextDouble();
		System.out.println("Rectangle width: ");
		calculo.width = leia.nextDouble();
		System.out.printf("Area: %.2f\n", calculo.totalArea());
		System.out.printf("Perimeter: %.2f\n", calculo.totalPerimetro());
		System.out.printf("Diagonal: %.2f\n", calculo.totalDiagonal());
	}

}
