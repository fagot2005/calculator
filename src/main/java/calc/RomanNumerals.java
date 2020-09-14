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

    public String intToRomanNumerals() {
        String resalt = "";
        int inputInt = Integer.valueOf(this.input);
        if (inputInt == 100) {
            resalt = "C";
        } else if (inputInt >= 90) {
            resalt = "XC" + parseRomanNumerals(inputInt - 90);
        } else if (inputInt >= 80) {
            resalt = "LXXX" + parseRomanNumerals(inputInt - 80);
        } else if (inputInt >= 70) {
            resalt = "LXX" + parseRomanNumerals(inputInt - 70);
        } else if (inputInt >= 60) {
            resalt = "LX" + parseRomanNumerals(inputInt - 60);
        } else if (inputInt >= 50) {
            resalt = "L" + parseRomanNumerals(inputInt - 50);
        } else if (inputInt >= 40) {
            resalt = "XL" + parseRomanNumerals(inputInt - 40);
        } else if (inputInt >= 30) {
            resalt = "XXX" + parseRomanNumerals(inputInt - 30);
        } else if (inputInt >= 20) {
            resalt = "XX" + parseRomanNumerals(inputInt - 20);
        } else if (inputInt >= 10) {
            resalt = "X" + parseRomanNumerals(inputInt - 10);
        } else if (inputInt >= 1) {
            resalt = parseRomanNumerals(inputInt);
        } else {
            throw new IllegalArgumentException("Результат " + inputInt + " не можут быть записан Римскими цифрами");
        }
        return resalt;
    }

    public String parseRomanNumerals(int input) {
        String resaltStr = "";
        for (Map.Entry<String, Integer> map : INT_MAPER.entrySet()
        ) {
            if (input == map.getValue()) {
                resaltStr = map.getKey();
                break;
            }
        }
        return resaltStr;
    }
}
