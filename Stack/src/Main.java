public class Main {
    public static void main(String[] args) {
        Stack newStack = new Stack(6);
        newStack.push(10);
        newStack.push(21);
        newStack.push(31);
        System.out.println(StackOperations.search(newStack, 21));
        StackOperations.removeElement(newStack,10);
        newStack.display();
        String paranthesis = "[()[{}]()]";
        System.out.println(Parenthesis.areParenthesisBalance(paranthesis));
    }
}