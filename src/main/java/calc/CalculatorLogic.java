package calc;

public class CalculatorLogic {
    private double first;
    private String second;
    private double three;

    public CalculatorLogic(double first, String second, double three) {
        this.first = first;
        this.second = second;
        this.three = three;
    }

    public double calculate() throws IllegalAccessException {
        double resalt = 0;
        switch (this.second) {
            case "+":
                resalt = this.first + this.three;
                break;
            case "-":
                resalt = this.first - this.three;
                break;
            case "*":
                resalt = this.first * this.three;
                break;
            case "/":
                resalt = this.first / this.three;
                break;
            default:
                throw  new IllegalAccessException("Операция указана не корректно, возможные варианты: +, -, *, /");
        }
        return resalt;
    }
}
