import org.jetbrains.annotations.NotNull;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class WordManipulation {

    public static String reverseWords(String in) {
        ArrayList<String> words = separateWords(in);
        for(int i = 0; i < words.size()/2; ++i) {
            String tmp = words.get(i);
            words.set(i, words.get(words.size() - 1 - i));
            words.set(words.size() - 1 - i, tmp);
        }
        StringBuilder sb = new StringBuilder();
        String sep = "";
        for(String word : words) {
            sb.append(sep);
            sep = " ";
            sb.append(word);
        }

        return sb.toString();
    }

    public static ArrayList<String> separateWords(String in) {
        return separateWords(in, ' ');
    }

    public static ArrayList<String> separateWords(@NotNull String in, @NotNull char separator) {
        char[] chars = in.toCharArray();
        ArrayList<String> words = new ArrayList<String>();
        ArrayList<Character> currentWord = new ArrayList<Character>();
        for(char c : chars) {
            if(c == separator) {
                if (!currentWord.isEmpty()) {
                    words.add(charListToString(currentWord));
                    currentWord.clear();
                }
            } else {
                currentWord.add(c);
            }
        }
        if (!currentWord.isEmpty()) words.add(charListToString(currentWord));
        currentWord.clear();
        return(words);
    }

    private static String charListToString(ArrayList<Character> in) {
        StringBuilder sb = new StringBuilder();
        for(char c : in) sb.append(c);
        return(sb.toString());
    }
}
