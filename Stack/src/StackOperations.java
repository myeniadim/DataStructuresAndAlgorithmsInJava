public class StackOperations {
    public static boolean search(Stack stk, int val){
        boolean bool = false;
        Stack tempStack = new Stack(stk.countOfElements());
        while (!stk.isEmpty()){
            int item = stk.pop();
            tempStack.push(item);
            if (val == item) {
                bool = true;
            }
        }
        while (!tempStack.isEmpty()){
            stk.push(tempStack.pop());
        }
        return bool;
    }

    public static void removeElement(Stack stk, int val) {
        if (search(stk, val)) {
            Stack tempStack = new Stack(stk.countOfElements());
            while (!stk.isEmpty()) {
                tempStack.push(stk.pop());
            }
            while (!tempStack.isEmpty()){
                if (tempStack.peek() != val)
                    stk.push(tempStack.pop());
                else
                    tempStack.pop();
            }
        }
    }
    public static boolean isEqual(Stack s1, Stack s2){
        if(s1.countOfElements()!=s2.countOfElements())
            return false;
        Stack tempStack1=new Stack(s1.countOfElements());
        Stack tempStack2=new Stack(s1.countOfElements());
        boolean result=true;
        while(!s1.isEmpty()){
            int val1=s1.pop();
            int val2=s2.pop();
            tempStack1.push(val1);
            tempStack2.push(val2);
            if(val1!=val2) {
                result = false;
                break;
            }
        }
        while(!tempStack1.isEmpty()){
            s1.push(tempStack1.pop());
            s2.push(tempStack2.pop());
        }
        return result;
    }

}
