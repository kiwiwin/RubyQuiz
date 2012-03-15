package LCDNumbers14;

public class LCDFactory {
    private static final Digit digits[] = new Digit[10];

    static {
        digits[0] = new Digit(new boolean[]{true, true, true, false, true, true, true});
        digits[1] = new Digit(new boolean[]{false, false, true, false, false, true, false});
        digits[2] = new Digit(new boolean[]{true, false, true, true, true, false, true});
        digits[3] = new Digit(new boolean[]{true, false, true, true, false, true, true});
        digits[4] = new Digit(new boolean[]{false, true, true, true, false, true, false});
        digits[5] = new Digit(new boolean[]{true, true, false, true, false, true, true});
        digits[6] = new Digit(new boolean[]{true, true, false, true, true, true, true});
        digits[7] = new Digit(new boolean[]{true, false, true, false, false, true, false});
        digits[8] = new Digit(new boolean[]{true, true, true, true, true, true, true});
        digits[9] = new Digit(new boolean[]{true, true, true, true, false, true, true});
    }

    public static Digit createDigit(String digitNumberString) {
        int digitNumber = Integer.parseInt(digitNumberString);
        return digits[digitNumber];
    }

}