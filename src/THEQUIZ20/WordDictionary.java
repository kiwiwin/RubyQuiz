package THEQUIZ20;

import java.util.*;

public class WordDictionary {
    private final Set<String> words = new HashSet<String>();

    public void addWord(String word) {
        String newWord = removeWhitespaceAndPunctuation(word);
        this.words.add(newWord.toUpperCase());
    }

    private String removeWhitespaceAndPunctuation(String word) {
        return word.replaceAll("[\\pP' ']", "");
    }

    public boolean hasWord(String word) {
        String newWord = removeWhitespaceAndPunctuation(word);
        return words.contains(newWord.toUpperCase());
    }
}
