package THEQUIZ20Test;

import THEQUIZ20.*;
import org.testng.annotations.*;

import java.util.*;

import static junit.framework.Assert.*;

public class NumberToWordTest {

    private NumberToWord numberToWord;

    @BeforeClass
    protected void setUp() throws Exception {
        WordDictionary dictionary = new WordDictionary();
        dictionary.addWord("USE");  //873
        dictionary.addWord("RUBY"); //7829
        dictionary.addWord("XXX"); //999
        dictionary.addWord("YYY"); //999

        numberToWord = new NumberToWord(dictionary);
    }

    @Test
    public void test_should_return_USE_for_873() {
        Vector<String> words = numberToWord.getMatchedWords("873");
        assertEquals(1, words.size());
        assertTrue(words.contains("USE"));
    }

    @Test
    public void test_should_return_RUBY_for_7829() {
        Vector<String> words = numberToWord.getMatchedWords("7829");
        assertEquals(1, words.size());
        assertTrue(words.contains("RUBY"));
    }

    @Test
    public void test_should_return_two_words_for_999() {
        Vector<String> words = numberToWord.getMatchedWords("999");
        assertEquals(2, words.size());
        assertTrue(words.contains("XXX"));
        assertTrue(words.contains("YYY"));
    }

    @Test
    public void test_should_return_USE_RUBY_for_873_7829() {
        Vector<String> words = numberToWord.getMatchedWords("873.7829");
        assertEquals(1, words.size());
        assertTrue(words.contains("USE-RUBY"));
    }

    @Test
    public void test_get_matched_words_for_999_873_999() {
        Vector<String> words = numberToWord.getMatchedWords("999873999");
        assertEquals(4, words.size());
        assertTrue(words.contains("XXX-USE-XXX"));
        assertTrue(words.contains("XXX-USE-YYY"));
        assertTrue(words.contains("YYY-USE-XXX"));
        assertTrue(words.contains("YYY-USE-YYY"));
    }

    @Test
    public void test_ignore_whitespace() {
        Vector<String> words = numberToWord.getMatchedWords("8 73");
        assertEquals(1, words.size());
        assertTrue(words.contains("USE"));
    }

    @Test
    public void test_ignore_punctuation() {
        Vector<String> words = numberToWord.getMatchedWords("8!73");
        assertEquals(1, words.size());
        assertTrue(words.contains("USE"));
    }

    @Test
    public void test_ignore_single_digit() {
        Vector<String> words = numberToWord.getMatchedWords("87387829");
        assertEquals(1, words.size());
        assertTrue(words.contains("USE-8-RUBY"));
    }

    @Test
    public void test_cannot_ignore_more_than_one_digit() {
        Vector<String> words = numberToWord.getMatchedWords("88873");
        assertEquals(0, words.size());
    }
}
