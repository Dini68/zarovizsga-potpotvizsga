package hu.nive.ujratervezes.zarovizsga.uniquefinder;

import java.util.ArrayList;
import java.util.List;

public class UniqueFinder {
    public List<Character> uniqueChars(String inputString) {
        if (inputString == null) {
            throw new IllegalArgumentException("wrong param: " + null);
        }
        List<Character> result = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (char c: inputString.toCharArray()) {
            if (!sb.toString().contains(Character.toString(c))) {
                sb.append(c);
                result.add(c);
            }
        }
        return result;
    }
}
