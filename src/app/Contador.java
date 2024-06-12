package app;

import java.util.Scanner;

import exceptions.ParametrosInvalidosException;

public class Contador {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira dois números");
		
		int paramOne = sc.nextInt();
		int paramTwo = sc.nextInt();
		
		try {
			contar(paramOne,paramTwo);
		}catch(ParametrosInvalidosException e) {
			System.out.println(e.getMessage());
		}finally {
			sc.close();
		}

	}
	
	public static void contar(int num1, int num2) throws ParametrosInvalidosException{
		if(num1>num2) {
			throw new ParametrosInvalidosException("O segundo parametro deve ser maior que o primeiro");
		}
		int contagem = num2-num1;
		for(int i = 1;i<=contagem;i++) {
			System.out.println("Imprimindo o número "+i);
		}
	}
}
