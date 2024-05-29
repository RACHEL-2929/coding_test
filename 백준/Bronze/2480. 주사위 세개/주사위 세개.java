import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int max = 0;
        if (n1 != n2 && n2 != n3 && n1 != n3) {// 다 다른 경우
            if (n1 > n2) {
                if (n1 < n3) max = n3;
                else max = n1;
            } else {//n2>n1
                if (n2 < n3) max = n3;
                else max = n2;
            }
            System.out.println(max * 100);
        } else {//같은개 2개이상 인 것들
            if (n1 == n2 && n2 == n3) {
                System.out.println(10000 + n1 * 1000);
            } else {
                if (n1 == n2 || n1 == n3) System.out.println(1000 + n1 * 100);
                else System.out.println(1000 + n2 * 100);
            }
        }


    }
}