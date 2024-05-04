package javaBasic;

public class Ejemplo_SobrecargaMetodos {

	public static void main(String[] args) {
		int resultado = suma(30, 45);
		System.out.println(resultado);

		int resultado2 = suma(20, 50, 40);
		System.out.println(resultado2);

	}

	public static int suma(int a, int b) {
		int c = a + b;
		return c;
	}

	public static int suma(int a, int b, int c) {
		int d = a + b + c;
		return d;
	}

}
