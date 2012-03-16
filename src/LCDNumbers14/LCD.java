package LCDNumbers14;

import java.io.*;

public class LCD {
    private final String number;

    public LCD(String number) {
        this.number = number;
    }

    public String display(int size) throws IOException {
        if (number.length() <= 0) return null;
        String result = LCDFactory.createDigit(number.substring(0, 1)).display(size);
        for (int i = 1; i < number.length(); i++) {
            String temp = LCDFactory.createDigit(number.substring(i, i + 1)).display(size);
            result = mergeDigitDisplay(result, temp);
        }
        return result;
    }

    private String mergeDigitDisplay(String augend, String addend) throws IOException {
        String result = "";
        BufferedReader augendReader = new BufferedReader(new StringReader(augend));
        BufferedReader addendReader = new BufferedReader(new StringReader(addend));
        String augendLine;
        String addendLine;

        while ((augendLine = augendReader.readLine()) != null && (addendLine = addendReader.readLine()) != null) {
            result += augendLine + " " + addendLine + "\n";
        }

        return result;
    }
}
