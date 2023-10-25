import java.util.Stack;

public class PostfixToInfix {

    // Function to check if a character is an operand
    private static boolean isOperand(char c) {
        return Character.isLetterOrDigit(c);
    }


    // Function to convert postfix expression to infix expression
    public static String postfixToInfix(String postfixExpression) {
        Stack<String> operandStack = new Stack<>();

        for (int i = 0; i < postfixExpression.length(); i++) {
            char currentChar = postfixExpression.charAt(i);

            if (isOperand(currentChar)) {
                operandStack.push(String.valueOf(currentChar));
            } else {
                String operand2 = operandStack.pop();
                String operand1 = operandStack.pop();
                String combinedExpression = "(" + operand1 + currentChar + operand2 + ")";
                operandStack.push(combinedExpression);
            }
        }

        return operandStack.pop();
    }
}
