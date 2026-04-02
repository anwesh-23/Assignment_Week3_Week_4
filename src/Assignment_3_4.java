class Assignment_3_4 {

    static class Client {
        String name;
        int risk;

        Client(String n, int r) {
            name = n;
            risk = r;
        }
    }

    static void bubbleSort(Client[] arr) {
        for (int i = 0; i < arr.length - 1; i++)
            for (int j = 0; j < arr.length - i - 1; j++)
                if (arr[j].risk > arr[j + 1].risk) {
                    Client temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }

    public static void main(String[] args) {
        Client[] arr = {
                new Client("A", 20),
                new Client("B", 50),
                new Client("C", 80)
        };

        bubbleSort(arr);

        for (Client c : arr)
            System.out.println(c.name + " " + c.risk);
    }
}