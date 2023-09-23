package practicaCalificada01;

import java.util.Random;
import java.util.Scanner;

public class ejercicio01_main 
{
	public static void main(String[] args) 
	{
		Random valorRandom1 = new Random();
		Random valorRandom2 = new Random();
		
		Scanner entrada = new Scanner(System.in);
		
		int valor1;
		int valor2;
		
		int sumaRandom;
		int respuesta;
		
		valor1 = valorRandom1.nextInt(100);
		valor2 = valorRandom2.nextInt(100);
		
		sumaRandom = valor1+ valor2;
		
		System.out.println("Cual es la respuesta al siguiente problema?");
		System.out.println(valor1 + " + "  + valor2 + " = ?");
		
		try
		{
			respuesta = entrada.nextInt();
			
			if (respuesta == sumaRandom)
			{
				System.out.println("Correcto!");
			}
			
			else
			{
				System.out.println("Incorrecto!");
			}
		}
		
		catch(java.util.InputMismatchException ex)
		{
			System.out.println("El caracter ingresado es invalido.");
		}
		
		entrada.close();
	}
}
