package SeleniumProject.SeleniumProject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class StringArrayCollection {

	public static void findTheLargestNumberInAnArray() {

		int[] numbers = { 100, 20, 300, 40, 50 };
		int largest = numbers[0];

		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > largest) {
				largest = numbers[i];
			}
		}

		System.out.println("The largest number in the array is " + largest);

	}

	public static String reverse(String str) {
		StringBuilder sb = new StringBuilder();
		for (int i = str.length() - 1; i >= 0; i--) {
			sb.append(str.charAt(i));
		}
		return sb.toString();
	}

	public static void CountVowels() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String input = scanner.nextLine();
		scanner.close();

		int count = 0;
		String vowels = "aeiouAEIOU";

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (vowels.indexOf(ch) != -1) {
				count++;
			}
		}

		System.out.println("Number of vowels in the string: " + count);
	}

	public static String removeDuplicateWords(String str) {
		String[] words = str.split(" ");
		// Create and add String words in Set of String as a List
		Set<String> set = new LinkedHashSet<>(Arrays.asList(words));
		// Append element of Set in StringBuilder
		StringBuilder sb = new StringBuilder();
		for (String word : set) {
			sb.append(word).append(" ");
		}
		return sb.toString().trim();
	}

	public static String removeDuplicatesFromString(String string) {
		Set<Character> set = new LinkedHashSet<>();
		// Adding character one by one in Set
		for (int i = 0; i < string.length(); i++) {
			set.add(string.charAt(i));
		}
		// Appending element of set one by one in StringBuilder
		StringBuilder sb = new StringBuilder();
		for (Character ch : set) {
			sb.append(ch);
		}
		return sb.toString();
	}

	public static int[] removeDuplicates(int[] arr) {

		Set<Integer> set = new HashSet<>();
		// Adding array elements one by one in Set
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}
		int[] result = new int[set.size()];
		int index = 0;
		// Inserting element of set into Array of result
		for (Integer element : set) {
			result[index++] = element;
		}
		return result;
	}

	public static void findSecondLargestNumber() {

		int[] numbers = { 109, 20, 830, 40, 50 };

		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > largest) {
				secondLargest = largest;
				largest = numbers[i];
			} else if (numbers[i] > secondLargest && numbers[i] != largest) {
				secondLargest = numbers[i];
			}
		}

		System.out.println("The second largest number in the array is " + secondLargest);
	}

	public static boolean isPalindrome(String str) {
		int left = 0;
		int right = str.length() - 1;
		while (left < right) {
			if (str.charAt(left) != str.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}

	public static void findCommonElements(int[] array1, int[] array2) {
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				if (array1[i] == array2[j]) {
					System.out.print(array1[i] + " ");
					break;
				}
			}
		}
	}

	public static Boolean isPrime(int num) {
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void sortStrings(String[] array) {
		int n = array.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (array[i].compareToIgnoreCase(array[j]) > 0) {
					String temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
	}

	public static void printArray(String[] array) {
		for (String element : array) {
			System.out.print(element + " ");
		}
		System.out.println();
	}

	public static void mostFrequentWords() {
		String str = "This is a test string to test the most frequent words program. The program should print the top k most frequent words in the string.";
		String[] words = str.split("\\s");
		HashMap<String, Integer> hashMap = new HashMap<>();

		for (String word : words) {
			if (hashMap.containsKey(word)) {
				hashMap.put(word, hashMap.get(word) + 1);
			} else {
				hashMap.put(word, 1);
			}
		}

		List<Map.Entry<String, Integer>> list = new ArrayList<>(hashMap.entrySet());

		System.out.println("Top  most frequent words:");
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getValue() != 1) {
				System.out.println(list.get(i).getKey() + " - " + list.get(i).getValue() + " occurrences");

			}

		}
	}

	static char findfirstRepeatedCharacter(String string) {
		// Creates an empty hashset
		char ch[] = string.toCharArray();
		HashSet<Character> hashSet = new HashSet<>();
		// Traverse the input array from left to right
		for (int i = 0; i <= ch.length - 1; i++) {
			char c = ch[i];

			// If element is already in hash set, update x
			// and then break
			if (hashSet.contains(c))
				return c;

			else // Else add element to hash set
				hashSet.add(c);
		}

		return '0';

	}

	public static void print2largest(int arr[], int arr_size) {
		if (arr_size < 2) {
			System.out.println("Invalid Input");
			return;
		}

		Arrays.sort(arr);
		for (int i = arr_size - 2; i > 0; i--) {
			if (arr[i] != arr[arr_size - 1]) {
				System.out.println("The second highest = " + arr[i]);
				return;
			}

		}
		System.out.println("There is no 2nd highest");
	}

	public static void duplicateWords(String string) {

		String[] words = string.split("\\W");
		Map<String, Integer> word_map = new HashMap<>();
		for (String word : words) {
			if (word_map.get(word) != null) {
				word_map.put(word, word_map.get(word) + 1);
			} else {
				word_map.put(word, 1);
			}
		}
		Set<String> word_set = word_map.keySet();
		for (String word : word_set) {
			if (word_map.get(word) > 1)
				System.out.println(word);
		}
	}

	static String reverseEachWord(String string) {

		String[] words = string.split("\\s");
		StringBuilder reversed = new StringBuilder();

		for (int i = words.length - 1; i >= 0; i--) {
			reversed.append(words[i]).append(" ");
		}
		return reversed.toString().trim();
	}

	static String reverseEachWordSubstring(String string) {

		int i = string.length() - 1;
		String ans = "";
		while (i >= 0) {
			while (i >= 0 && string.charAt(i) == ' ')
				i--;
			int j = i;
			if (i < 0)
				break;
			while (i >= 0 && string.charAt(i) != ' ')
				i--;
			if (ans.isEmpty()) {
				ans = ans.concat(string.substring(i + 1, j + 1));
			} else {
				ans = ans.concat(" " + string.substring(i + 1, j + 1));
			}
		}
		return ans;
	}

	static String reverseWholeStringUsingChar(String string) {
		String revStr = "";
		char ch;
		System.out.print("Original word: " + string); // Example word

		for (int i = 0; i < string.length(); i++) {
			ch = string.charAt(i); // extracts each character
			revStr = ch + revStr; // adds each character in front of the existing string
		}
		return revStr;
	}

	static void reverseWholeStringUsingCharArray(String string) {
		System.out.println("String to be reversed : " + string);
		char[] array = string.toCharArray();
		System.out.println("String after reverse : ");
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.print(array[i]);
		}
	}

	static void reverseWholeStringUsingSwapping(String string) {
		System.out.println("String to be reversed : " + string);
		char[] array = string.toCharArray();
		int left, right = array.length - 1;
		for (left = 0; left < right; left++, right--) {
			char temp = array[left];
			array[left] = array[right];
			array[right] = temp;
		}
		for (char c : array)
			System.out.print(c);

	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter program number which you want to execute: ");
		int input = scanner.nextInt();
		switch (input) {
		case 1:
// Find the Largest Number in An Array
			findTheLargestNumberInAnArray();
			break;
// Write a Java program to reverse string without using the built-in reverse() function
		case 2:
			System.out.println(reverse("Sushil"));
			break;
		case 3:
// Write a Java program to count the number of vowels in a given string
			CountVowels();
			break;
		case 4:
//	Write a Java program to  remove duplicates from an array
			int[] arr = { 2, 4, 2, 6, 7, 4, 8, 7 };
			int[] uniqueArr = removeDuplicates(arr);
			System.out.println("Original array: " + Arrays.toString(arr));
			System.out.println("Array with duplicates removed: " + Arrays.toString(uniqueArr));
			break;
		case 5:
//  Write a Java program to  remove duplicates from a String
			String myString = "Hello World";
			String resultString = removeDuplicatesFromString(myString);
			System.out.println(resultString); // Output: Helo Wrd
			break;
		case 6:
//	Write a Java program to  remove duplicates words from a String
			String duplicateWords = "Hello World Hello World";
			String uniqueWords = removeDuplicateWords(duplicateWords);
			System.out.println(uniqueWords); // Output: Hello World
			break;
		case 7:
//	Write a Java program to find Second Largest Number from an array
			findSecondLargestNumber();
			break;
		case 8:
//	Write a Java program to check if a given string is a palindrome.
			String str = "racecar";
			if (isPalindrome(str)) {
				System.out.println(str + " is a palindrome");
			} else {
				System.out.println(str + " is not a palindrome");
			}
			break;
// Write a Java program to find the common elements between two arrays
		case 9:
			int[] array1 = { 1, 2, 3, 4, 5 };
			int[] array2 = { 4, 5, 6, 7, 8 };
			System.out.println("Common elements between array1 and array2 are: ");
			findCommonElements(array1, array2);
			break;
		case 10:
// Write a Java program to check if a given number is prime	

			/*
			 * System.out.println("Enter number which you want to check"); int num =
			 * scanner.nextInt();
			 */
			for (int num = 0; num < 100; num++) {
				if (isPrime(num)) {
					System.out.println(num + " is a prime number.");

				}
			}
			break;
// Write a Java program to sort an array of strings in alphabetical order
		case 11:
			String[] names = { "John", "Adam", "Mary", "Cathy", "David" };
			System.out.println("Before sorting: ");
			printArray(names);
			sortStrings(names);
			System.out.println("After sorting: ");
			printArray(names);
			break;

// How can you find the most frequent character in a String using the Collection classes in Java
		case 12:
			mostFrequentWords();
			break;
		case 13:
// find first Repeated Character 
// Input: str = “hello geeks” 
// Output: l l is the
// first element that repeats
			String string = "hello geeks";
			System.out.println(findfirstRepeatedCharacter(string));
			break;
		case 14:
// Input: arr[] = {12, 35, 1, 10, 34, 1} 
// Output: The second largest element is 34
			int array[] = { 1, 100, 1, 1, 5, 1 };
			int n = array.length;
			print2largest(array, n);
			break;
		case 15:
// Get duplicate words from a given string
// Hi, I am Hritik and I am a programmer
			duplicateWords("Hi, I am Hritik and I am a programmer");
			break;
		case 16:
//			Question1 : Reverse each Words in a string
//			input "      The Sky Is Blue      " 
//			output "Blue Is Sky The"
			reverseEachWord("The Sky Is Blue");
			break;
		case 17:
//			Question1 : Reverse each Words in a string
//			input "      The Sky Is Blue      " 
//			output "Blue Is Sky The"
			reverseEachWordSubstring("The Sky Is Blue");
			break;
		case 18:
//	 		Reverse Whole String Using Swapping
			reverseWholeStringUsingSwapping("lihsus");
			break;
		case 19:
//		 		Reverse Whole String Using Char Array
			reverseWholeStringUsingCharArray("lihsus");
			break;
		case 20:
//		 		Reverse Whole String Using Char			
			reverseWholeStringUsingChar("lihsus");
			break;

		default:
			System.out.println("Please mention correct program number!");
			scanner.close();
		}
	}

}
