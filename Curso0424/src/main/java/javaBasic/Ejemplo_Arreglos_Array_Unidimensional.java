package javaBasic;

public class Ejemplo_Arreglos_Array_Unidimensional {

	public static void main(String[] args) {
		// ejemplo int intArray[];
		
		//Declarar un array de strings 
		String[] arr;
		
		//Asignar memoria para 5 espacios
		arr = new String[5];
		
		arr[0] = "Elemento Cero";
		arr[1] = "Elemento Uno";
		arr[2] = "Elemento Dos";
		arr[3] = "Elemento Tres";
		arr[4] = "Elemento Cuatro";
		
		System.out.println(arr[0]);
		
		//Acceder a todos los elementos de un array
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Elemento en el indice " + i + ": " + arr[i]);
		}

	}

}
