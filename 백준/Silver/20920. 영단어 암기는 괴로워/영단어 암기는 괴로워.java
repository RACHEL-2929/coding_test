import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {

    static class Voca {
        String word;
        int cnt;


        Voca(String word,int cnt) {
            this.word = word;
            this.cnt = cnt;
        }
    }

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Map<String, Integer> map = new HashMap<>();

        for(int i = 0; i<n; i++){
            String w = br.readLine();
            if(w.length() >= m) map.put(w, map.getOrDefault(w,0)+1);
        }

        List<Voca> list = new ArrayList<>();
        for(Map.Entry<String, Integer> entry: map.entrySet()){
            list.add(new Voca(entry.getKey(),entry.getValue()));
        }
        list.sort(
           (a,b) ->{
               if(a.cnt == b.cnt){
                   if(a.word.length() == b.word.length()) return a.word.compareTo(b.word);
                   return b.word.length()-a.word.length();
               }
                return b.cnt -a.cnt;
            }
        );

        StringBuilder sb = new StringBuilder();
        for(Voca v: list){
            sb.append(v.word).append("\n");
        }

        System.out.print(sb);
        
        
        
    }
}