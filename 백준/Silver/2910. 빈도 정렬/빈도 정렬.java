import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {

    static class Num {
        int value;
        int count;
        int index;

        Num(int value, int count, int index) {
            this.value = value;
            this.count = count;
            this.index = index;
        }
    }

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        Map<Integer,Integer> freq  = new HashMap<>();
        Map<Integer,Integer> firstIndex   = new HashMap<>();
        int max = -1;
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<n; i++){
            int num = Integer.parseInt(st.nextToken());
            freq.put(num, freq.getOrDefault(num,0)+1);
            if(!firstIndex.containsKey(num)) firstIndex.put(num, i);
        }

        List<Num> list = new ArrayList<>();
        for(int key: freq.keySet()){
            list.add(new Num(key, freq.get(key), firstIndex.get(key)));
        }
        

        list.sort(
            (a,b)-> {
                if(a.count == b.count) return a.index - b.index;
                return b.count - a.count;
            }
        );

        for(Num n1: list){
            for(int i = 0; i< n1.count; i++)
            System.out.print(n1.value+" ");
        }
        
    }
}