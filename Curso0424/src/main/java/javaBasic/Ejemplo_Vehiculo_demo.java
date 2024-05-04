package javaBasic;

public class Ejemplo_Vehiculo_demo {

	public static void main(String[] args) {
		Ejemplo_vehiculo minivan = new Ejemplo_vehiculo();
		
		int rango;
		
		//Asignar valores a las variables de minivan
		minivan.pasajeros = 9;
		minivan.capacidad = 15;
		minivan.kmh = 20;
		
		//Calcular el rango asumiendo un tanque lleno
		rango = minivan.capacidad * minivan.kmh;
		
		System.out.println("La minivan puede llevar " + minivan.pasajeros + " pasajeros con un rango de " + rango + " kilometros");
		
		Ejemplo_vehiculo carro = new Ejemplo_vehiculo();
		carro.pasajeros = 4;
		System.out.println("Número en pasajeros en carro es: " + carro.pasajeros);
		

	}

}
