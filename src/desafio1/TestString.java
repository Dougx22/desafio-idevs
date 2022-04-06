 package desafio1;

import java.util.*;

public class TestString{

public static void main(String[] args) {
	int result = 0;
	System.out.println("Bem vindo! (cada caractere tem um valor especifico) ");
	System.out.println("Insira sua palavra e descubra o total: ");
	
	try (Scanner scan = new Scanner(System.in)) {
		String input = scan.next();
		char[] arrayInput = input.toUpperCase().toCharArray(); 
			
		String [] wordString = toStringArray(arrayInput);
		System.out.printf("\n");	
	
	
	Map<String, Integer> map = new HashMap<>();
	map.put("A", 1);
	map.put("E", 1);
	map.put("I", 1);
	map.put("O", 1);
	map.put("U", 1);
	map.put("L", 1);
	map.put("N", 1);
	map.put("R", 1);
	map.put("S", 1);
	map.put("T", 1);
	map.put("A", 1);
	map.put("D", 2);
	map.put("G", 2);
	map.put("B", 3);
	map.put("C", 3);
	map.put("M", 3);
	map.put("P", 3);
	map.put("F", 4);
	map.put("H", 4);
	map.put("V", 4);
	map.put("W", 4);
	map.put("Y", 4);
	map.put("K", 5);
	map.put("J", 8);
	map.put("X", 8);
	map.put("Q", 10);
	map.put("Z", 10);
		
	
	for(int letter = 0; letter < wordString.length; letter++) {
		for( String key : map.keySet()) {
			int value = map.get(key);
			if(key.equals(wordString[letter])) {
				result += value;
			System.out.println(wordString[letter]+ " = " + value + " +");
			}
		}
	}
	System.out.printf("\n");
	System.out.printf("A palavra %s vale: %d pontos",input.toUpperCase(), result);
	
	scan.close();}
	}
		
		

public static String[] toStringArray(char[] charArray) {
	
	String[] stringArray = new String[charArray.length];
	for(int i = 0; i < charArray.length; i++) {
		stringArray[i] = new String("" + charArray[i]);
		}
	return stringArray;

}
}