import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long total = sc.nextLong();
        int cnt = sc.nextInt();
        int sum = 0;



        for (int i = 0; i < cnt; i++) {
            int pd_price = sc.nextInt();
            int pd_cnt = sc.nextInt();
            sum += pd_cnt*pd_price;
        }
        if(sum == total) System.out.println("Yes");
        else System.out.println("No");
    }
}