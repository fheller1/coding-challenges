import org.junit.jupiter.api.DisplayName;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class WordManipulationTest {

    @org.junit.jupiter.api.Test
    @DisplayName("Word reversal test")
    void reverseWordsTest() {
        assertEquals("World Hello", WordManipulation.reverseWords("Hello World"), "\"Hello World\" test failed");
        assertEquals("", WordManipulation.reverseWords(""), "Empty String test failed");
        assertEquals("", WordManipulation.reverseWords("       "), "Whitespace String test failed");
        assertEquals("abc", WordManipulation.reverseWords(" abc   "), "One word test failed");
        assertEquals("Amet sit Ipsum,Dolor Lorem", WordManipulation.reverseWords(" Lorem     Ipsum,Dolor    sit Amet"), "Many words test failed");
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Word separation test")
    void separateWords() {
        ArrayList<String> ex = new ArrayList<String>();
        ex.add("Hello"); ex.add("World");
        assertEquals(ex, WordManipulation.separateWords("Hello World"), "\"Hello World\" test failed");
        ArrayList<String> ex2 = new ArrayList<String>();
        ex2.add("Hell"); ex2.add(" W"); ex2.add("rld");
        assertEquals(ex2, WordManipulation.separateWords("Hello World", 'o'), "o as whitespace test failed");
    }
}