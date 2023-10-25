public class BinarySearch {

    public static boolean binarySearch(int[] numbers, int val, int initialIndex, int finalIndex){
        if (finalIndex >= initialIndex){
            int midIndex = (initialIndex + finalIndex)/2;
            int midValue = numbers[midIndex];
            if (midValue == val)
                return true;
            if (midValue < val)
                return binarySearch(numbers, val, midIndex+1, finalIndex);

            return binarySearch(numbers,val,initialIndex,midIndex-1);
        }
        return false;
    }

}
