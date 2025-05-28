import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        Set<String> set = new HashSet<>();
        
        
        for(int i = 0; i<num; i++){
            set.add(br.readLine());
        }

        List<String> list = new ArrayList<>(set);
        Collections.sort(
            list, (a,b) -> {
                if(a.length() == b.length()) return a.compareTo(b);
                return a.length() - b.length();
            }
        );
        
        for(String word: list){
            System.out.println(word);
        }
    }
}