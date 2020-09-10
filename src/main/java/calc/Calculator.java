package calc;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) throws IllegalAccessException {
        System.out.println("Введите пример в следующем формате: 3 + 2 или III + II, и нажмите ENTER");
        double resalt = 0;
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        scanner.close();
        if (input.length !=3) {
            throw new IllegalArgumentException("Введено не корректное число параметров");
        }
        if (input[0].matches("[-+]?\\d+") && input[2].matches("[-+]?\\d+")) {
            double first = Double.parseDouble(input[0]);
            double three = Double.parseDouble(input[2]);
            if (first < 1 || first > 10 || three < 1 || three > 10) {
                throw new IllegalArgumentException("Необходимо ввести число в диапазоне от 1 до 10");
            } else {
                resalt = new CalculatorLogic(first, input[1], three).calculate();
            }
        } else {
            double first = new RomanNumerals(input[0]).maping();
            double three = new RomanNumerals(input[2]).maping();
            if (first == -1 || three == -1) {
                throw new IllegalArgumentException("Введено римское число не соотвествующее шаблону: I, II, III, IV, V, VI, VII, VIII, IX, X");
            } else {
                resalt = new CalculatorLogic(first, input[1], three).calculate();
            }
        }
        System.out.println(resalt);
    }
}
