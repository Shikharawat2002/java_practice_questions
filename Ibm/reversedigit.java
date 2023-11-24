public class reversedigit {
    public static int reverse(int number) {
        int newNumber = 0;
        while (number > 0) {
            int reminder = number % 10;
            newNumber = newNumber * 10 + reminder;
            number = number / 10;
        }
        return newNumber;
    }

    public static void main(String[] args) {
        int number = 12345678;
        System.out.println(reverse(number));
    }
}
