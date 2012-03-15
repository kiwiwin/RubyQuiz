package LCDNumber14Test;

import LCDNumbers14.*;
import org.testng.annotations.*;

import java.io.*;

public class LCDTest {
    private final String fixtureDirectory = "./test/LCDNumber14Test/fixture/";

    @Test
    public void test_display_012345_size_2() throws IOException {
        LCD lcd_012345 = new LCD("012345");
        JUnitFile.assertFile("", fixtureDirectory, "LCD_012345_Size_2.txt", lcd_012345.display(2));
    }

    @Test
    public void test_display_6789_size_1() throws IOException {
        LCD lcd_6789 = new LCD("6789");
        JUnitFile.assertFile("", fixtureDirectory, "LCD_6789_Size_1.txt", lcd_6789.display(1));
    }
}
