package q3;

import java.util.Scanner;

public class LetterCounter {
	static Scanner scanner = new Scanner(System.in);
	/*public static void main(String[] args){
		//CountLetters();
		int[] result = CountLetters();
		for(int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}*/
	
	int vowelCounter, consonantCounter, spaces;
	
	public int[] CountLetters() { 
		vowelCounter = 0;
		consonantCounter = 0;
		spaces = 0;
		
		String sentence = scanner.nextLine();
		if(sentence == null) {
			throw new IllegalArgumentException("You should type something");
		}
		//sentence = sentence.toLowerCase();
		
		for(int i = 0; i < sentence.length(); i++) {
			char letter = sentence.charAt(i);
			 
			if(letter == ' ') {
				spaces++;
				continue;
			}
			
			if((letter >= 'a' && letter <= 'z') || (letter >= 'A' && letter <= 'Z')){ 
	                letter = Character.toLowerCase(letter);; 
	                
	                if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'){ 
	                    vowelCounter++; 
	                }
	                else {
	                    consonantCounter++;
	                }
	                
	        } 
		}
		
		int[] vowelsAndConsonants = {vowelCounter, consonantCounter};
		
		System.out.println("No of vowels: " + vowelCounter);
		System.out.println("No of consonants: " + consonantCounter);
		//System.out.println("No of spaces: " + spaces);
			
		return vowelsAndConsonants;
	}
	
	
	}


