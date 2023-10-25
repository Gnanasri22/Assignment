package assignment;

import java.util.Scanner;

public class pangram {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter a sentence:");
	        String input = scanner.nextLine();
	        boolean isPangram = checkIfPangram(input);
	        if (isPangram) {
	            System.out.println("The input is a pangram.");
	        } else {
	            System.out.println("The input is not a pangram.");
	        }
	    }

	    public static boolean checkIfPangram(String input) {
	        boolean[] alphabetCheck = new boolean[26];
	        int alphabetCount = 0;

	        for (int i = 0; i < input.length(); i++) {
	            char ch = input.charAt(i);
	            if (ch >= 'a' && ch <= 'z') {
	                int index = ch - 'a';
	                if (!alphabetCheck[index]) {
	                    alphabetCheck[index] = true;
	                    alphabetCount++;
	                }
	            } else if (ch >= 'A' && ch <= 'Z') {
	                int index = ch - 'A';
	                if (!alphabetCheck[index]) {
	                    alphabetCheck[index] = true;
	                    alphabetCount++;
	                }
	            }
	        }

	        return alphabetCount == 26;
	    }
	}