package Ejercicios;

import java.util.Scanner;

public class prueba1 {

	public static void main(String[] args) {
		
		//Podría ser mas eficiente pidiendo los números antes de entrar en el switch. Pero haciendolo dentro del switch,
		//puedo sacar mensaje personalizado para el usuario, dependiendo de que opción haya escogido.
		
		//Resumen, se podría optimizar bastante. prueba
		
		System.out.println("Bienvenido a la Calkkuladora.");
		
		boolean salida = true;
		String numero1 = "";
		String numero2 = "";
		boolean isNumeric1 = false;
		boolean isNumeric2 = false;
		
		try (Scanner entradaEscaner = new Scanner (System.in)) {
			while(salida) {
				
				System.out.println("\n--------------------------------------\nElige que operacion quieres realizar: \n"
						+ " 1 - Sumar \n" 
						+ " 2 - Restar \n"
						+ " 3 - Multiplicar \n"
						+ " 4 - Dividir \n"
						+ " 0 - Salir");

				String opcion = "";
				
				opcion = entradaEscaner.nextLine();
				
				switch (opcion) {
				
				case "1":
					
					System.out.println("Introduce el primer numero a sumar");
					numero1 = entradaEscaner.nextLine();
					System.out.println("Introduce el segundo numero a sumar");
					numero2 = entradaEscaner.nextLine();
					
					isNumeric1 =  numero1.matches("[+-]?\\d*(\\.\\d+)?");
				    isNumeric2 =  numero2.matches("[+-]?\\d*(\\.\\d+)?");
					if(isNumeric1 && isNumeric2) {
						Integer numeroInt1 = Integer.parseInt(numero1);
						Integer numeroInt2 = Integer.parseInt(numero2);
						Integer resultado = numeroInt1 + numeroInt2;
						System.out.println("El resultado de la suma es: " + resultado + "\n");
					} else {
						System.out.println("No has introducido valores numéricos, por favor, vuelve a intentarlo");
					}
					
					break;
					
				case "2":
					System.out.println("Introduce el primer numero a restar");
					numero1 = entradaEscaner.nextLine();
					System.out.println("Introduce el segundo numero a restar");
					numero2 = entradaEscaner.nextLine();
					
					isNumeric1 =  numero1.matches("[+-]?\\d*(\\.\\d+)?");
				    isNumeric2 =  numero2.matches("[+-]?\\d*(\\.\\d+)?");
					if(isNumeric1 && isNumeric2) {
						Integer numeroInt1 = Integer.parseInt(numero1);
						Integer numeroInt2 = Integer.parseInt(numero2);
						Integer resultado = numeroInt1 - numeroInt2;
						System.out.println("El resultado de la resta es: " + resultado + "\n");
					} else {
						System.out.println("No has introducido valores numéricos, por favor, vuelve a intentarlo");
					}
					
					break;
					
				case "3":
					System.out.println("Introduce el primer numero a multiplicar");
					numero1 = entradaEscaner.nextLine();
					System.out.println("Introduce el segundo numero a multiplicar");
					numero2 = entradaEscaner.nextLine();
					
					isNumeric1 =  numero1.matches("[+-]?\\d*(\\.\\d+)?");
				    isNumeric2 =  numero2.matches("[+-]?\\d*(\\.\\d+)?");
					if(isNumeric1 && isNumeric2) {
						Integer numeroInt1 = Integer.parseInt(numero1);
						Integer numeroInt2 = Integer.parseInt(numero2);
						Integer resultado = numeroInt1 * numeroInt2;
						System.out.println("El resultado de la multiplicación es: " + resultado + "\n");
					} else {
						System.out.println("No has introducido valores numéricos, por favor, vuelve a intentarlo");
					}
					break;
					
				case "4":
					System.out.println("Introduce el dividendo");
					numero1 = entradaEscaner.nextLine();
					System.out.println("Introduce el divisor");
					numero2 = entradaEscaner.nextLine();
					
					isNumeric1 =  numero1.matches("[+-]?\\d*(\\.\\d+)?");
				    isNumeric2 =  numero2.matches("[+-]?\\d*(\\.\\d+)?");
					if(isNumeric1 && isNumeric2) {
						Integer numeroInt1 = Integer.parseInt(numero1);
						Integer numeroInt2 = Integer.parseInt(numero2);
						if(numeroInt1 == 0 || numeroInt2 == 0) {
							System.out.println("No se puede dividir por 0");
						} else {
							Integer resultado = numeroInt1 / numeroInt2;
							System.out.println("El resultado de la división es: " + resultado + "\n");
						}	
					} else {
						System.out.println("No has introducido valores numéricos, por favor, vuelve a intentarlo");
					}

					break;
					
				case "0":
					salida = false;
					System.out.println("Gracias por ver mi Calkkuladora, un saludo :)");
					break;

				default:
					System.out.println("Has elegido una opcion incorrecta, por favor, vuelve a intentarlo.");
					break;
				}
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
	}

}
