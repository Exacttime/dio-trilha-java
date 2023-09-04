package edu.dio.operators;

public class Operators {
	public static void main(String[] args) {
		// Operador de atribuição "=";
		String name = "Erick";
		int number = 20;
		// Operadores aritmeticos "+","-","*","/"...
		int sum = 5 + 5;
		int subtract = 5 - 5;
		int multiply = 5 * 5;
		int divide = 5 / 5;
		int module = 18 % 3;
		System.out.println(sum);
		System.out.println(subtract);
		System.out.println(multiply);
		System.out.println(divide);
		System.out.println(module);
		// Operadores Unarios "-" "+" "++" "--" "!"
		int positive = +5;
		int negative = -5;
		negative++; // Incrementa 1;
		negative--; // Decrementa 1;
		boolean iExist = true;
		if (!iExist)// Nega o valor de iExist o if passa a ser : Se iExist for falso ao inves de
					// true;
		{

		}
		////////
		int a = 5;
		int b = 6;
		String result;
		if (a == b) {
			result = "Verdadeiro";

			System.out.println(result);

		} else {
			result = "Falso";

			System.out.println(result);
		}
		// Outra maneira de fazer isso é:
		String result2 = a == b ? "Verdadeiro" : "Falso";
		System.out.println(result2);
		// Condicionais booleanas "&","||";
		if (iExist && a != 0) {
			System.out.println("Caso ambas condições forem verdadeiras eu executo");
		}
		if (iExist || a != 0) {
			System.out.println("Caso qualquer uma das 2 condições seja verdadeira eu executo");
		}
	}
}
