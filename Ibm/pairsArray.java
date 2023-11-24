public class pairsArray {
    public static void getPair(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + current + "," + arr[j] + ")");
                count = count + 1;
            }
            System.out.println(" ");
        }
        System.out.println("total pairs:"+ count);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 5, 6, 2 };
        getPair(arr);
    }
}
