public class Main {
    public static void main(String[] args) {
        int[] numbers = {2,5,8,12,23,84,96};
        int[] nonNumbers = {31,125,42,56,423,142,535};
        for (int i = 0; i<numbers.length;i++){
            System.out.println("Linear Search (" + numbers[i]+") : "+ LinearSearch.linearSearch(numbers, numbers[i]));
            System.out.println("Binary Search (" + numbers[i]+") : "+ BinarySearch.binarySearch(numbers, numbers[i],0,numbers.length-1));
            System.out.println("Linear Search (" + nonNumbers[i]+") : "+ LinearSearch.linearSearch(numbers, nonNumbers[i]));
            System.out.println("Binary Search (" + nonNumbers[i]+") : "+ BinarySearch.binarySearch(numbers, nonNumbers[i],0,numbers.length-1));
        }
    }
}