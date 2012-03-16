package THEQUIZ20;

import java.util.*;

public class NumberToWord {

    private final WordDictionary dictionary;

    public NumberToWord(WordDictionary dictionary) {
        this.dictionary = dictionary;
    }

    public Vector<String> getMatchedWords(String rawNumber) {
        String number = rawNumber.replaceAll("[\\pP' ']", "");
        Vector<String> result = new Vector<String>();
        for (int endIndex = 1; endIndex <= number.length(); endIndex++) {
            result.addAll(notIgnoreDigit(number, endIndex));
            result.addAll(ignoreSingleDigit(number, endIndex - 1));
        }

        return removeDuplicateWord(result);
    }

    private Vector<String> removeDuplicateWord(Vector<String> duplicateWords) {
        Vector<String> result = new Vector<String>();
        HashSet<String> wordsSet = new HashSet<String>();
        for (String word : duplicateWords) {
            wordsSet.add(word);
        }
        for (String word : wordsSet) {
            result.add(word);
        }

        return result;
    }

    private Vector<String> ignoreSingleDigit(String number, int ignoreIndex) {
        Vector<String> prefixWords = getExactlyMatchedWord(number.substring(0, ignoreIndex));
        if (ignoreIndex == 0) prefixWords.add(getIgnoreDigit(number, ignoreIndex));
        else {
            Vector<String> ignoreWord = new Vector<String>();
            ignoreWord.add(getIgnoreDigit(number, ignoreIndex));
            prefixWords = mergeWords(prefixWords, "-", ignoreWord);
        }

        Vector<String> allSuffixWords = getMatchedWords(number.substring(ignoreIndex + 1));
        Vector<String> suffixWords = getWordsNotStartWithDigit(allSuffixWords);

        return mergeWords(prefixWords, "-", suffixWords);
    }

    private String getIgnoreDigit(String number, int ignoreIndex) {
        return number.substring(ignoreIndex, ignoreIndex + 1);
    }

    private Vector<String> getWordsNotStartWithDigit(Vector<String> words) {
        Vector<String> result = new Vector<String>();
        for (String word : words) {
            if (notStartWithDigit(word)) result.add(word);
        }

        return result;
    }

    private boolean notStartWithDigit(String suf) {
        return !suf.substring(0, 1).matches("\\d");
    }

    private Vector<String> notIgnoreDigit(String number, int splitIndex) {
        Vector<String> result = new Vector<String>();

        Vector<String> prefixWords = getExactlyMatchedWord(number.substring(0, splitIndex));
        if (prefixWords.isEmpty()) return result;

        Vector<String> suffixWords = getMatchedWords(number.substring(splitIndex));

        if (suffixWords.size() > 0) {
            result = mergeWords(prefixWords, "-", suffixWords);
        } else {
            result = prefixWords;
        }

        return result;
    }

    private Vector<String> getWordsInDictionary(Vector<String> temp) {
        Vector<String> result = new Vector<String>();
        for (String word : temp) {
            if (dictionary.hasWord(word))
                result.add(word);
        }
        return result;
    }

    private Vector<String> getExactlyMatchedWord(String number) {
        Vector<String> result = new Vector<String>();
        for (int i = 0; i < number.length(); i++) {
            Vector<String> letters = new Vector<String>();
            Collections.addAll(letters, NumberToLetter.getLetters(getIgnoreDigit(number, i)));

            if (result.isEmpty()) {
                result.addAll(letters);
            } else {
                result = mergeWords(result, "", letters);
            }
        }
        return getWordsInDictionary(result);
    }

    private Vector<String> mergeWords(Vector<String> prefixWords, String connector, Vector<String> suffixWords) {
        Vector<String> result = new Vector<String>();
        for (String prefix : prefixWords) {
            for (String suffix : suffixWords) {
                result.add(prefix + connector + suffix);
            }
        }
        return result;
    }
}
