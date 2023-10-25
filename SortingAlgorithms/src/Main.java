import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {14,2,53,23,12,0,42,1,23,42,124,97};
        System.out.println(Arrays.toString(numbers));
        BubbleSort.bubbleSort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}