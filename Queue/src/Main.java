public class Main {
    public static void main(String[] args) {
        Queue myQ=new Queue(5);
        myQ.enQueue(5);
        myQ.enQueue(7);
        myQ.enQueue(17);
        myQ.enQueue(72);
        myQ.deQueue();
        myQ.display();
        CircularQueue<Integer> cq = new CircularQueue<Integer>(Integer.class, 5);
        try {
            cq.enQueue(12);
            cq.enQueue(12);
            cq.enQueue(12);
            cq.enQueue(12);
            cq.enQueue(12);
            cq.deQueue();
        }catch (Exception e){
            e.getMessage();
        }
        cq.display();
    }
}