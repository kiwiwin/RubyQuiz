package MakeChange154;

import java.util.*;

public class Change {

    private Vector<Integer> units;

    public Change(Vector<Integer> units) {
        this.units = units;
    }

    public Vector<Integer> makeChange(Integer money) {
        Vector<Integer> result = new Vector<Integer>();

        Integer remainMoney = money;

        for (Integer unit : units) {
            for (int num = 1; num <= remainMoney / unit; num++) {
                result.add(unit);
            }
            remainMoney -= remainMoney / unit * unit;
            if (remainMoney <= 0) break;
        }

        return result;
    }
}
