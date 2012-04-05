package MakeChange154Test;

import MakeChange154.*;
import org.testng.annotations.*;

import java.util.*;

import static junit.framework.Assert.*;

public class ChangeTest {

    private Change change;

    @BeforeClass
    private void setup_change() {
        Vector<Integer> moneyUnits = new Vector<Integer>();
        moneyUnits.add(25);
        moneyUnits.add(10);
        moneyUnits.add(5);
        moneyUnits.add(1);

        change = new Change(moneyUnits);
    }

    @Test
    public void should_return_1_for_change_1() {
        Vector<Integer> expectedChanges = new Vector<Integer>();
        expectedChanges.add(1);

        assertVectorIntegerEquals(expectedChanges, change.makeChange(1));
    }

    @Test
    public void should_return_5_1_for_change_6() {
        Vector<Integer> expectedChanges = new Vector<Integer>();
        expectedChanges.add(5);
        expectedChanges.add(1);

        assertVectorIntegerEquals(expectedChanges, change.makeChange(6));
    }

    @Test
    public void should_return_25_10_10_1_1_1_1_for_change_49() {
        Vector<Integer> expectedChanges = new Vector<Integer>();
        expectedChanges.add(25);
        expectedChanges.add(10);
        expectedChanges.add(10);
        expectedChanges.add(1);
        expectedChanges.add(1);
        expectedChanges.add(1);
        expectedChanges.add(1);

        assertVectorIntegerEquals(expectedChanges, change.makeChange(49));
    }

    private void assertVectorIntegerEquals(Vector<Integer> expected, Vector<Integer> actual) {
        assertEquals("length not equal", expected.size(), actual.size());

        for (int i = 0; i < expected.size(); i++) {
            assertEquals(i + "th value not equal", expected.get(i), actual.get(i));
        }
    }
}
