package LCDNumber14Test;

import LCDNumbers14.*;
import org.junit.*;

public class DigitTest {
    private final String fixtureDirectory = "./test/LCDNumber14Test/fixture/";

    @Test
    public void test_display_1_for_size_1() {
        JUnitFile.assertFile("", fixtureDirectory, "Digit_one_Size_1.txt", LCDFactory.createDigit("1").display(1));
    }

    @Test
    public void test_display_2_for_size_1() {
        JUnitFile.assertFile("", fixtureDirectory, "Digit_two_Size_1.txt", LCDFactory.createDigit("2").display(1));
    }

    @Test
    public void test_display_3_for_size_1() {
        JUnitFile.assertFile("", fixtureDirectory, "Digit_three_Size_1.txt", LCDFactory.createDigit("3").display(1));
    }

    @Test
    public void test_display_4_for_size_4() {
        JUnitFile.assertFile("", fixtureDirectory, "Digit_four_Size_1.txt", LCDFactory.createDigit("4").display(1));
    }

    @Test
    public void test_display_5_for_size_5() {
        JUnitFile.assertFile("", fixtureDirectory, "Digit_five_Size_1.txt", LCDFactory.createDigit("5").display(1));
    }

    @Test
    public void test_display_6_for_size_1() {
        JUnitFile.assertFile("", fixtureDirectory, "Digit_six_Size_1.txt", LCDFactory.createDigit("6").display(1));
    }

    @Test
    public void test_display_7_for_size_1() {
        JUnitFile.assertFile("", fixtureDirectory, "Digit_seven_Size_1.txt", LCDFactory.createDigit("7").display(1));
    }

    @Test
    public void test_display_8_for_size_1() {
        JUnitFile.assertFile("", fixtureDirectory, "Digit_eight_Size_1.txt", LCDFactory.createDigit("8").display(1));
    }

    @Test
    public void test_display_9_for_size_1() {
        JUnitFile.assertFile("", fixtureDirectory, "Digit_nine_Size_1.txt", LCDFactory.createDigit("9").display(1));
    }

    @Test
    public void test_display_0_for_size_0() {
        JUnitFile.assertFile("", fixtureDirectory, "Digit_zero_Size_1.txt", LCDFactory.createDigit("0").display(1));
    }

    @Test
    public void test_display_8_for_size_2() {
        JUnitFile.assertFile("", fixtureDirectory, "Digit_eight_Size_2.txt", LCDFactory.createDigit("8").display(2));
    }

    @Test
    public void test_display_4_for_size_3() {
        JUnitFile.assertFile("", fixtureDirectory, "Digit_four_Size_3.txt", LCDFactory.createDigit("4").display(3));
    }
}

