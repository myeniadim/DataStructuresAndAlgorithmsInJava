import java.util.Stack;

//create a Stack
//use loop to iterate one by one character in the expression.
//if character is not a symbol ignore it.
//if character is symbol i.e. opening symbol i.e. either ( or { or [ , push it into Stack.
//if character is closing symbol i.e. either ) or } ] , pop it from stack and match correspondingly. if matched then return true else false.

public class Parenthesis {

    public static boolean areParenthesisBalance(String exp) {
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < exp.length(); i++) {
            char x = exp.charAt(i);

            if (x == '(' || x == '[' || x == '{') {

                stack.push(x);
                continue;
            }

            if (stack.isEmpty())
                return false;
            char check;
            switch (x) {
                case ')':
                    check = stack.pop();
                    if (check == '{' || check == '[')
                        return false;
                    break;

                case '}':
                    check = stack.pop();
                    if (check == '(' || check == '[')
                        return false;
                    break;

                case ']':
                    check = stack.pop();
                    if (check == '(' || check == '{')
                        return false;
                    break;
            }
        }

        return (stack.isEmpty());
        }
    }

