public class Java100_while {
    public static void main(String [] args) {
        int num = 1;

        while (num <= 30) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
            num++;
        }
    }
}