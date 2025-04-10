//1. Write code to determine if the string is a palindrome.

public class PalindromeChecker {

    public static void main(String[] args) {
        String str = "madam"; // Example string
        if (isPalindrome(str)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        // Compare characters from both ends of the string
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Not a palindrome if characters don't match
            }
            left++;
            right--;
        }
        return true; // It is a palindrome if all characters match
    }
}
                       
	
// 2.You need to find and print all the unique characters in a given string.

import java.util.HashMap;

public class UniqueCharacters
 {
    public static void main(String[] args)
    {
        String str = "java"; // Example input string
        printUniqueCharacters(str);
    }

    // Method to print unique characters in the string
    public static void printUniqueCharacters(String str)
       {
        // HashMap to store the frequency of each character
        HashMap<Character, Integer> frequencyMap = new HashMap<>();

        // Traverse through the string and calculate the frequency of each character
         {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }

        // Print unique characters (those with a frequency of 1)
        System.out.println("Unique characters in the string:");
        for (char ch : frequencyMap.keySet()) 
            {
            if (frequencyMap.get(ch) == 1) 
            {
                System.out.print(ch + " ");  
            }
        }
    }
}



