public class Main {
    public static void main(String[] args) {
        Stack newStack = new Stack(6);
        newStack.push(10);
        newStack.push(21);
        newStack.push(31);
        System.out.println(StackOperations.search(newStack, 21));
        StackOperations.removeElement(newStack,10);
        newStack.display();
        String paranthesis = "([{]})";
        System.out.println(Parenthesis.areParenthesisBalance(paranthesis));

        String infixExpression = "A+B*C-(D/E^F)";
        String postfixExpression = InfixToPostfix.infixToPostfix(infixExpression);
        System.out.println("Infix Expression: " + infixExpression);
        System.out.println("Postfix Expression: " + postfixExpression);

        String postfixExpression2 = "ABC*+DE/F^G^*+";
        String infixExpression2 = PostfixToInfix.postfixToInfix(postfixExpression);
        System.out.println("Postfix Expression: " + postfixExpression);
        System.out.println("Infix Expression: " + infixExpression);
    }
}