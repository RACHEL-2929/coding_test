import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int plusM = sc.nextInt();

        int sum = m+plusM;
        if (sum >= 60) {
            if ((h + sum / 60) >= 24) {
                h = h + (sum / 60) - 24;
            } else {
                h += sum / 60;
            }
            m = sum % 60;
        } else {
            m += plusM;
        }
        System.out.println(h + " " + m);
    }
}