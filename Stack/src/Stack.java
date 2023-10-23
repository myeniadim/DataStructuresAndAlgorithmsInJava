public class Stack {
    private int top;
    private int[] values;

    public Stack(int size){
        this.top = -1;
        this.values = new int[size];
    }

    public int size(){
        return (this.values.length);
    }
    public boolean isEmpty(){
        return (this.top == -1);
    }
    public boolean isFull(){
        return (this.top==this.values.length-1);
    }
    public int countOfElements(){
        return (this.top+1);
    }
    public void push(int val){
        if (!isFull()){
            this.top++;
            this.values[top] = val;
        }
    }
    public int pop(){
        if (isEmpty()){
            return -1;
        }else {
            this.top--;
            return this.values[this.top+1];
        }
    }
    public int peek(){
        if (isEmpty()) {
            return -1;
        }else {
            return this.values[this.top];
        }
    }
    public void display(){
        if (!isEmpty()){
            for (int i = this.top; i > -1; i--){
                System.out.println(this.values[i]);
            }
        }else{
            System.out.println("The stack is empty");
        }
    }
}
