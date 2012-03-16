package THEQUIZ20Test;

import THEQUIZ20.*;
import org.testng.annotations.*;

import java.io.*;

import static org.testng.Assert.*;

public class WordDictionaryTest {

    private WordDictionary dictionary;

    @BeforeClass
    protected void setUp() throws Exception {
        dictionary = new WordDictionary();

        BufferedReader reader = new BufferedReader(new FileReader("./test/THEQUIZ20Test/fixture/Dictionary_For_DictionaryTest.txt"));
        String word;
        while ((word = reader.readLine()) != null) {
            dictionary.addWord(word);
        }
    }

    @Test
    public void test_has_word_A() {
        assertTrue(dictionary.hasWord("A"));
    }

    @Test
    public void test_not_case_sensitive() {
        assertTrue(dictionary.hasWord("a"));
    }

    @Test
    public void test_not_has_word_NotInclude() {
        assertFalse(dictionary.hasWord("NotInclude"));
    }

    @Test
    public void test_ignore_whitespace_in_file() {
        assertTrue(dictionary.hasWord("IgnoreWhitespace"));
    }

    @Test
    public void test_ignore_punctuation_in_file() {
        assertTrue(dictionary.hasWord("IgnorePunctuation"));
    }

    @Test
    public void test_ignore_whitespace_in_has_word_input() {
        assertTrue(dictionary.hasWord("Ignore Whitespace"));
    }

    @Test
    public void test_ignore_punctuation_in_has_word_input() {
        assertTrue(dictionary.hasWord("Ignore,Punctuation"));
    }
}
