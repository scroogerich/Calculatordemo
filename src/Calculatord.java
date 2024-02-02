import java.util.Scanner;

public class Calculatord {
    public static void main(String[] args) {
        System.out.println("Введите математическое задание (например, 2 + 2):");

        Scanner input = new Scanner(System.in);
        String expression = input.nextLine();

        System.out.println(calc(expression));
    }

    public static String calc(String input) {
        String[] expression = input.split(" ");
        if (expression.length != 3) {
            throw new ArithmeticException("Строка не является математической операцией!");
        }

        int operandOne = Integer.parseInt(expression[0]);
        char operator = expression[1].charAt(0);
        int operandTwo = Integer.parseInt(expression[2]);

        int sum = 0;

        if ((operandOne > 0 && operandTwo > 0) && (operandOne < 11 && operandTwo < 11)) {
            switch (operator) {
                case '+':
                    sum = operandOne + operandTwo;
                    break;
                case '-':
                    sum = operandOne - operandTwo;
                    break;
                case '*':
                    sum = operandOne * operandTwo;
                    break;
                case '/':
                    sum = operandOne / operandTwo;
                    break;
                default:
                    throw new ArithmeticException("Используем только 1 из перечисленных операторов +, -, /, *");
            }
        } else {
            throw new ArithmeticException("По условию используем операнды от 1 до 10 включительно!");
        }
        return String.valueOf(sum);
    }
}

