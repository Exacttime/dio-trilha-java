package edu.dio.variables;

public class Variable {
public static void main(String[] args) {
	//Tipos primitivos
	//String ( representação de textos);
	double minimumSalary = 2.500; //2,5 é o valor real dessa variavel, seria somente para exemplificar a double;
	double minimumSalaryFull = 2500; //Esse é o valor de 2500;
	////// Erros e convenções
	//int startWithZero = 0345932; // Int começando com 0 ou long, talvez seja necessario passar para string, pois o java não reconhece o 0;
	long finishWithL = 301221941l; // Long tem que terminar com L;
	float finishWithF = 3.14f; // float tem que terminar com F;
	short shortNumber = 1;
	int number = shortNumber;//isso pode, pois um tipo INT comporta um tipo SHORT;
	//short thisShort = number; // isso não pode, pois um SHORT não comporta um tipo INT;
	short thisShortConvert = (short) number; // Isso soluciona o problema mas não é ideal(isso se chama casting);
	////// Constantes
	int changeableInt = 5;
	changeableInt = 10;
	
	System.out.println(changeableInt);
	
	final int CONSTANT_VALUE = 5;
	
	//CONSTANT_VALUE = 10; //Não é possivel alterar valor de constante;
	System.out.println(CONSTANT_VALUE); 
}
}
