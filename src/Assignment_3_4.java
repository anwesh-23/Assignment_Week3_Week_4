import java.util.*;

class Assignment_3_4 {

    static class Asset {
        String name;
        double rate;

        Asset(String n, double r) {
            name = n;
            rate = r;
        }
    }

    static void quickSort(List<Asset> list, int low, int high) {
        if (low < high) {
            int pi = partition(list, low, high);
            quickSort(list, low, pi - 1);
            quickSort(list, pi + 1, high);
        }
    }

    static int partition(List<Asset> list, int low, int high) {
        double pivot = list.get(high).rate;
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (list.get(j).rate > pivot) {
                i++;
                Collections.swap(list, i, j);
            }
        }
        Collections.swap(list, i + 1, high);
        return i + 1;
    }

    public static void main(String[] args) {
        List<Asset> list = new ArrayList<>();
        list.add(new Asset("AAPL", 12));
        list.add(new Asset("TSLA", 8));
        list.add(new Asset("GOOG", 15));

        quickSort(list, 0, list.size() - 1);

        for (Asset a : list)
            System.out.println(a.name + " " + a.rate);
    }
}