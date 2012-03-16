package THEQUIZ20Test;

import THEQUIZ20.*;
import org.testng.annotations.*;

import static junit.framework.Assert.assertEquals;

public class NumberToLetterTest {
    @Test
    public void test_should_return_A_B_C_for_2() {
        String[] expect = new String[]{"A", "B", "C"};
        String[] letters = NumberToLetter.getLetters("2");
        assertStringArray(expect, letters);
    }

    @Test
    public void test_should_return_D_E_F_for_3() {
        String[] expect = new String[]{"D", "E", "F"};
        String[] letters = NumberToLetter.getLetters("3");
        assertStringArray(expect, letters);
    }

    @Test
    public void test_should_return_G_H_I_for_4() {
        String[] expect = new String[]{"G", "H", "I"};
        String[] letters = NumberToLetter.getLetters("4");
        assertStringArray(expect, letters);
    }

    @Test
    public void test_should_return_J_K_L_for_5() {
        String[] expect = new String[]{"J", "K", "L"};
        String[] letters = NumberToLetter.getLetters("5");
        assertStringArray(expect, letters);
    }

    @Test
    public void test_should_return_M_N_O_for_6() {
        String[] expect = new String[]{"M", "N", "O"};
        String[] letters = NumberToLetter.getLetters("6");
        assertStringArray(expect, letters);
    }

    @Test
    public void test_should_return_P_Q_R_S_for_7() {
        String[] expect = new String[]{"P", "Q", "R", "S"};
        String[] letters = NumberToLetter.getLetters("7");
        assertStringArray(expect, letters);
    }

    @Test
    public void test_should_return_T_U_V_for_8() {
        String[] expect = new String[]{"T", "U", "V"};
        String[] letters = NumberToLetter.getLetters("8");
        assertStringArray(expect, letters);
    }

    @Test
    public void test_should_return_W_X_Y_Z_for_9() {
        String[] expect = new String[]{"W", "X", "Y", "Z"};
        String[] letters = NumberToLetter.getLetters("9");
        assertStringArray(expect, letters);
    }

    private void assertStringArray(String[] expect, String[] letters) {
        assertEquals("expect array length:" + expect.length + ", actual array length:" + letters.length, letters.length, expect.length);
        for (int i = 0; i < expect.length; i++)
            assertEquals("expect " + (i + 1) + "-th element: " + expect[i] + ", actual " + (i + 1) + "-th element: " + letters[i], expect[i], letters[i]);
    }
}
