package desafio2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class TestPrime {
	
	private static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		 int number = inputNumber();
	int sum = 0; int prime = 0;
	Map<Integer, Integer> map = new HashMap<>();
	for(int numbers = 2; numbers <= number; numbers++) {
		if(ehPrime(numbers)) {
			sum += numbers;
			map.put(sum, numbers);
			if(sum <= number && ehPrime(sum)) {
				prime = sum;
				 
			}
		}
	}
	for( int key : map.keySet()) {
		int value = map.get(key);
		while(key <= prime ) {
			System.out.println((value + " + "));
			
			break;
		}
		
}
	System.out.println("\n");
	System.out.println("Total: " + prime);

	
}			
	

	public static int inputNumber() {
		int input = 0;
		do {
		System.out.println("Qual é o maior número primo abaixo de N que é obtido através da soma consecutiva de números primos?");
		System.out.println("Insira um número: ");
		input = Integer.parseInt(scan.nextLine());
		}while(!validNumber(input));
		return input;
	}
	

	public static boolean validNumber(int input) {
		System.out.println("\n");
		if(input < 0) {
			System.out.println("#######  Apenas números positivos  #######");
			System.out.println("\n");
			return false;
		}
		return true;
	}
	
	public static boolean ehPrime(int numbers) {
		  for (int index = 2; index < numbers; index++) {
	            if (numbers % index == 0)
	                return false;   
	        }
	        return true;
		}
	}

		
			
	
		

	


