import java.util.Arrays;

class Assignment_3_4 {

    static int linearFirst(String[] arr, String key) {
        int comparisons = 0;
        for (int i = 0; i < arr.length; i++) {
            comparisons++;
            if (arr[i].equals(key)) {
                System.out.println("Linear First Index: " + i);
                System.out.println("Comparisons: " + comparisons);
                return i;
            }
        }
        return -1;
    }

    static int linearLast(String[] arr, String key) {
        int comparisons = 0;
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            comparisons++;
            if (arr[i].equals(key)) {
                index = i;
            }
        }

        System.out.println("Linear Last Index: " + index);
        System.out.println("Comparisons: " + comparisons);
        return index;
    }

    static int binarySearch(String[] arr, String key) {
        int low = 0, high = arr.length - 1;
        int comparisons = 0;

        while (low <= high) {
            comparisons++;
            int mid = (low + high) / 2;

            int cmp = arr[mid].compareTo(key);

            if (cmp == 0) {
                System.out.println("Binary Found at index: " + mid);
                System.out.println("Comparisons: " + comparisons);
                return mid;
            } else if (cmp < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    static int countOccurrences(String[] arr, String key) {
        int count = 0;
        for (String s : arr) {
            if (s.equals(key)) count++;
        }
        return count;
    }

    public static void main(String[] args) {

        String[] logs = {"accB", "accA", "accB", "accC"};

        System.out.println("Original Logs:");
        System.out.println(Arrays.toString(logs));

        // Linear search
        linearFirst(logs, "accB");
        linearLast(logs, "accB");

        // Sort for binary search
        Arrays.sort(logs);

        System.out.println("\nSorted Logs:");
        System.out.println(Arrays.toString(logs));

        binarySearch(logs, "accB");

        int count = countOccurrences(logs, "accB");
        System.out.println("Total Occurrences: " + count);
    }
}
