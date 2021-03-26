package hu.nive.ujratervezes.zarovizsga.countchars;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class DaVinciCode {

    public int encode(String input, char x) {
        validParam(x);
        Path file = Path.of(input);
        try (BufferedReader reader = Files.newBufferedReader(file)) {
            int countParam = 0;
            String line;
            while ((line = reader.readLine()) != null) {
                countParam += getCountParamInLine(x, line);
            }
            return countParam;
        } catch (
                IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }

    private int getCountParamInLine(char x, String line) {
        int countParam = 0;
        for (char c: line.toCharArray()){
            if (c == x) {
                countParam++;
            }
        }
        return countParam;
    }

    private void validParam(char x) {
        if (!(x == '0' || x == '1' || x =='x')) {
            throw new IllegalArgumentException("Wrong param: '" + x + "'");
        }
    }
}
