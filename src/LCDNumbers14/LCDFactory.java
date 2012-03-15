package LCDNumbers14;

public class LCDFactory {
    public static Digit createDigit(String digitNumber) {
        if (digitNumber.equals("1"))
            return createOne();
        if (digitNumber.equals("2"))
            return createTwo();
        if (digitNumber.equals("3"))
            return createThree();
        if (digitNumber.equals("4"))
            return createFour();
        if (digitNumber.equals("5"))
            return createFive();
        if (digitNumber.equals("6"))
            return createSix();
        if (digitNumber.equals("7"))
            return createSeven();
        if (digitNumber.equals("8"))
            return createEight();
        if (digitNumber.equals("9"))
            return createNine();
        if (digitNumber.equals("0"))
            return createZero();
        return null;
    }

    public static Digit createOne() {
        Digit one = new Digit();
        one.bars[0] = false;
        one.bars[1] = false;
        one.bars[3] = false;
        one.bars[4] = false;
        one.bars[6] = false;
        return one;
    }

    public static Digit createTwo() {
        Digit two = new Digit();
        two.bars[1] = false;
        two.bars[5] = false;
        return two;
    }

    public static Digit createThree() {
        Digit three = new Digit();
        three.bars[1] = false;
        three.bars[4] = false;
        return three;
    }

    public static Digit createFour() {
        Digit four = new Digit();
        four.bars[0] = false;
        four.bars[4] = false;
        four.bars[6] = false;
        return four;
    }

    public static Digit createFive() {
        Digit five = new Digit();
        five.bars[2] = false;
        five.bars[4] = false;
        return five;
    }

    public static Digit createSix() {
        Digit six = new Digit();
        six.bars[2] = false;
        return six;
    }

    public static Digit createSeven() {
        Digit seven = new Digit();
        seven.bars[1] = false;
        seven.bars[3] = false;
        seven.bars[4] = false;
        seven.bars[6] = false;
        return seven;
    }

    public static Digit createEight() {
        return new Digit();
    }

    public static Digit createNine() {
        Digit nine = new Digit();
        nine.bars[4] = false;
        return nine;
    }

    public static Digit createZero() {
        Digit zero = new Digit();
        zero.bars[3] = false;
        return zero;
    }
}