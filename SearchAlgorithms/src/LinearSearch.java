public class LinearSearch {
    public static boolean linearSearch(int[] numbers, int val){
        for (int i = 0;i<numbers.length;i++){
            if (numbers[i] == val)
                return true;
        }
        return false;
    }
}
