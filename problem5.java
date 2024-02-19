public class problem5 {
    public static void main(String[] args) {
        long result;
        System.out.println("Powers of 2 from 2^2 to 2^20:");

        for (int i = 2; i <= 20; i++) {
                  result = (long) Math.pow(2, i);
            System.out.println("2^" + i + " = " + result);
        }
    }
}
