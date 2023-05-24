package JavaMission;

import java.util.Scanner;
import java.util.Stack;

public class _30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("계산 수식을 입력하세요: ");
        String input = scanner.nextLine();

        int result = calculateExpression(input);
        System.out.println("계산 결과: " + result);
    }

    private static int calculateExpression(String expression) {
        Stack<Integer> operandStack = new Stack<>();
        Stack<Character> operatorStack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            if (ch == ' ') {
                continue;
            } else if (Character.isDigit(ch)) {
                StringBuilder operand = new StringBuilder();
                while (i < expression.length() && Character.isDigit(expression.charAt(i))) {
                    operand.append(expression.charAt(i));
                    i++;
                }
                i--;
                operandStack.push(Integer.parseInt(operand.toString()));
            } else if (ch == '(') {
                operatorStack.push(ch);
            } else if (ch == ')') {
                while (!operatorStack.isEmpty() && operatorStack.peek() != '(') {
                    int operand2 = operandStack.pop();
                    int operand1 = operandStack.pop();
                    char operator = operatorStack.pop();
                    int result = performOperation(operator, operand1, operand2);
                    operandStack.push(result);
                }
                operatorStack.pop(); // Discard '('
            } else if (isOperator(ch)) {
                while (!operatorStack.isEmpty() && getPrecedence(ch) <= getPrecedence(operatorStack.peek())) {
                    int operand2 = operandStack.pop();
                    int operand1 = operandStack.pop();
                    char operator = operatorStack.pop();
                    int result = performOperation(operator, operand1, operand2);
                    operandStack.push(result);
                }
                operatorStack.push(ch);
            }
        }

        while (!operatorStack.isEmpty()) {
            int operand2 = operandStack.pop();
            int operand1 = operandStack.pop();
            char operator = operatorStack.pop();
            int result = performOperation(operator, operand1, operand2);
            operandStack.push(result);
        }

        return operandStack.pop();
    }

    private static boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/';
    }

    private static int performOperation(char operator, int operand1, int operand2) {
        switch (operator) {
            case '+':
                return operand1 + operand2;
            case '-':
                return operand1 - operand2;
            case '*':
                return operand1 * operand2;
            case '/':
                return operand1 / operand2;
            default:
                throw new IllegalArgumentException("Unsupported operator: " + operator);
        }
    }

    private static int getPrecedence(char operator) {
        switch (operator) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            default:
                return 0;
        }
    }
}