public class BubbleSort {
    public static void bubbleSort(int [] numbers){

        int tmp;

        for (int i = 0; i < numbers.length; i++) {
            //    for(int j=1; j<A.length-i+1; j++) şeklinde de döngü yazılabilir
            for (int j = numbers.length - 1; j > i; j--){ //i'ye kadar olan kısmı sabitlendiği için tekrar geçişlerde kontrolü gerekmemektedir.
                if (numbers[j - 1] > numbers[j]) {
                    tmp = numbers[j - 1];
                    numbers[j - 1] = numbers[j];
                    numbers[j] = tmp;
                }
            }
        }
    }
}
