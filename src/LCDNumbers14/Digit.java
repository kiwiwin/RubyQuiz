package LCDNumbers14;

public class Digit {
    private final boolean[] bars;

    Digit(boolean[] bars) {
        this.bars = bars;
    }

    public final String display(int size) {
        String result = "";
        result += " " + displayHorizontalBar(size, bars[0]) + " \n";
        for (int line = 0; line < size; line++)
            result += displayVerticalBar(bars[1]) + displayHorizontalBar(size, false) + displayVerticalBar(bars[2]) + "\n";
        result += " " + displayHorizontalBar(size, bars[3]) + " \n";
        for (int line = 0; line < size; line++)
            result += displayVerticalBar(bars[4]) + displayHorizontalBar(size, false) + displayVerticalBar(bars[5]) + "\n";
        result += " " + displayHorizontalBar(size, bars[6]) + " \n";
        return result;
    }

    private String displayVerticalBar(boolean occupied) {
        final String verticalBar = "|";
        return occupied ? verticalBar : " ";
    }

    private String displayHorizontalBar(int size, boolean occupied) {
        final String horizontalBar = "-";
        String result = "";
        for (int i = 0; i < size; i++)
            result += occupied ? horizontalBar : " ";
        return result;
    }
}
