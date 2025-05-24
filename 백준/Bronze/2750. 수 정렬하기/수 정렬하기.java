import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int[] a = new int[num];
        
        for(int i = 0; i < num; i++){
            a[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(a);
        for(int i = 0; i < num; i++){
           System.out.println(a[i]);
        }
    }
}