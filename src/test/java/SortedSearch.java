public class SortedSearch {
    public static int countNumbersNotEfficient(int[] sortedArray, int lessThan) {
        int counter = 0;
        for (int i : sortedArray) {
            if (i < lessThan) {
                counter++;
            } else {
                return counter; //if sorted array we don't have check anymore
            }
        }
        return counter;
    }

    public static int countNumbersMyTry(int[] sortedArray, int lessThan) {
        int left = 0;
        int right = sortedArray.length - 1;
        int m = 0;
        while (left <= right) {
            m = left + ((right - left) / 2);
            // 3 < 4, check for sub array from 4 ... [n-1]
            if (sortedArray[m] < lessThan) {
                left = m + 1;
            }
            if (sortedArray[m] > lessThan) {
                right = m - 1;
            }
            if (sortedArray[m] == lessThan)
                return m;
        }
        return m;
    }

    public static int countNumbers(int[] sortedArray, int lessThan) {
        int start = 0;
        int end = sortedArray.length - 1;
        int mid = 0;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (sortedArray[mid] < lessThan) {
                if (mid < sortedArray.length - 1 && sortedArray[mid + 1] < lessThan) {
                    start = mid + 1;
                    continue;
                } else {
                    return mid + 1;
                }
            }

            if (sortedArray[mid] >= lessThan) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return 0;
    }


    public static void main(String[] args) {
        System.out.println(SortedSearch.countNumbers(new int[]{1, 3, 5, 7}, 4));
    }
}