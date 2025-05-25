import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //  상근이가 가지고 있는 숫자 카드의 개수\
        int num = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());// 공백으로 나눠져 있다고 하면 
        Set<Integer> card = new HashSet<>();

        for(int i = 0; i < num; i++){
            card.add(Integer.parseInt(st.nextToken()));
        }

        // 구분
        int checkNum = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());

        Integer[] check = new Integer[checkNum];
        Integer[] answer = new Integer[checkNum];

        for(int i = 0; i< checkNum; i++){
            check[i] = Integer.parseInt(st.nextToken());
            if(card.contains(check[i])){
                answer[i] = 1;
            }else{
                answer[i] = 0;
            }
        }

        
        for(int i = 0; i < checkNum; i++){
            if(i != checkNum -1) System.out.print(answer[i]+" ");
            else System.out.print(answer[i]);
        }
        
    }
}