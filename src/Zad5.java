import com.sun.jdi.Value;

import java.security.Key;
import java.util.*;
import java.util.stream.Stream;

public class Zad5 {

    public Map<Character, Integer> getMap(String word) {
        Map<Character, Integer> letterMap = new HashMap<>();

        for (var l : word.toCharArray()) {
            if (letterMap.containsKey(l)) {
                int howManyLettersInWord = letterMap.get(l);
                letterMap.put(l,++howManyLettersInWord);
            } else {
                letterMap.put(l,1);
            }
        }

        return letterMap;
    }

    public void theLongestWord(String allSentece) {
        String[] words = allSentece.toLowerCase().split(" ");
        String longestWordSequence = "";
        int maxNumbersOfLetter = 0;
        Map<Character, Integer> mapOfLetters;

        for (var word : words) {
            mapOfLetters = getMap(word);
            for (var valueOfLetters : mapOfLetters.values()) {
                if (maxNumbersOfLetter < valueOfLetters) {
                    maxNumbersOfLetter = valueOfLetters;
                    longestWordSequence = word;
                }
            }
        }

        System.out.println("Słowo: " + longestWordSequence + " Ilosc powtorzen litery: " + maxNumbersOfLetter);
    }

    void main(String[] args) {
        theLongestWord("Today, is the greatest day ever!");
    }

}
