package THEQUIZ20;

public class NumberToLetter {
    private static final String[][] number2Letters = new String[10][];

    static {
        number2Letters[2] = new String[]{"A", "B", "C"};
        number2Letters[3] = new String[]{"D", "E", "F"};
        number2Letters[4] = new String[]{"G", "H", "I"};
        number2Letters[5] = new String[]{"J", "K", "L"};
        number2Letters[6] = new String[]{"M", "N", "O"};
        number2Letters[7] = new String[]{"P", "Q", "R", "S"};
        number2Letters[8] = new String[]{"T", "U", "V"};
        number2Letters[9] = new String[]{"W", "X", "Y", "Z"};
    }

    public static String[] getLetters(String numberString) {
        int number = Integer.parseInt(numberString);
        return number2Letters[number];
    }
}
