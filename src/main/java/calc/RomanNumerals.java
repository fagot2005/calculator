package calc;

import java.util.HashMap;
import java.util.Map;

public class RomanNumerals {

    public String input;

    public RomanNumerals(String input) {
        this.input = input;
    }

    private final static Map<String, Integer> INT_MAPER = new HashMap<>() {
        {
            put("I", 1);
            put("II", 2);
            put("III", 3);
            put("IV", 4);
            put("V", 5);
            put("VI", 6);
            put("VII", 7);
            put("VIII", 8);
            put("IX", 9);
            put("X", 10);
        }
    };

    public double maping(){
        double resalt = -1;
        if (INT_MAPER.containsKey(this.input)) {
            for (Map.Entry<String, Integer> maper : INT_MAPER.entrySet()
            ) {
                if (this.input.equals(maper.getKey())) {
                    resalt = maper.getValue();
                    break;
                }
            }
        }
        return resalt;
    }
}
