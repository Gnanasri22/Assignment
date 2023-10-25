package assignment;

import java.util.HashMap;
import java.util.Scanner;

public class romannumber {public static int romanToInt(String s) {
    HashMap<Character, Integer> romanValues = new HashMap<>();
    romanValues.put('I', 1);
    romanValues.put('V', 5);
    romanValues.put('X', 10);
    romanValues.put('L', 50);
    romanValues.put('C', 100);
    romanValues.put('D', 500);
    romanValues.put('M', 1000);

    int result = 0;

    for (int i = 0; i < s.length(); i++) {
        int currentValue = romanValues.get(s.charAt(i));

        if (i < s.length() - 1 && romanValues.get(s.charAt(i + 1)) > currentValue) {
            result -= currentValue;
        } else {
            result += currentValue;
        }
    }

    return result;
}

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a Roman numeral: ");
    String romanNumeral = scanner.nextLine();

    int result = romanToInt(romanNumeral.toUpperCase());
    System.out.println("The integer equivalent is: " + result);
}
}
