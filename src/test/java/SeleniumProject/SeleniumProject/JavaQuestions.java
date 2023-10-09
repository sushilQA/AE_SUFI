package SeleniumProject.SeleniumProject;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class JavaQuestions {

// get repeated words and there occurence from a string	

	static void repeatedWords(String string) {
		String[] words = string.split("\\W+");
		Map<String, Integer> wordCount = new HashMap<>();
		for (String word : words) {
			if (wordCount.containsKey(word)) {

				wordCount.put(word, wordCount.get(word) + 1);
			} else
				wordCount.put(word, 1);

		}
		for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
			System.out.println(entry.getKey() + "=" + entry.getValue());
		}
	}

// Remove Duplicates Words from a String

	static String removeDuplicateWords(String string) {
		String[] words = string.split("\\W+");
		Set<String> set = new LinkedHashSet<>(Arrays.asList(words));
		StringBuilder sb = new StringBuilder();
		for (String word : set) {
			sb.append(word).append(" ");
		}
		return sb.toString();
	}

	public static void main(String[] args) {

		System.out.println(removeDuplicateWords("This is a sample text with repeated words, is and sample."));
		repeatedWords("This is a sample text with repeated words, is and sample.");

	}
}
