import java.util.*;

class Assignment_3_4 {

    static class Transaction {
        String id;
        double fee;
        String ts;

        Transaction(String id, double fee, String ts) {
            this.id = id;
            this.fee = fee;
            this.ts = ts;
        }
    }

    static void bubbleSort(List<Transaction> list) {
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (list.get(j).fee > list.get(j + 1).fee) {
                    Collections.swap(list, j, j + 1);
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    public static void main(String[] args) {
        List<Transaction> list = new ArrayList<>();
        list.add(new Transaction("id1", 10.5, "10:00"));
        list.add(new Transaction("id2", 25.0, "09:30"));
        list.add(new Transaction("id3", 5.0, "10:15"));

        bubbleSort(list);

        for (Transaction t : list)
            System.out.println(t.id + " : " + t.fee);
    }
}