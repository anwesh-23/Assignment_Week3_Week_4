class Assignment_3_4 {

    static int linearSearch(String[] arr, String key) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i].equals(key))
                return i;
        return -1;
    }

    public static void main(String[] args) {
        String[] arr = {"accA", "accB", "accB", "accC"};
        System.out.println(linearSearch(arr, "accB"));
    }
}