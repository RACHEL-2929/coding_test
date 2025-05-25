import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        Map<String, Integer> book = new HashMap<>();


        String title = "";
        for(int i = 0; i< num; i++){
            title = br.readLine();
            if(book.containsKey(title)){
                Integer value = book.get(title);
                book.put(title,++value);
            }else{
                book.put(title,1);
            }
        }
        
        String best="";
        int max = 0;
        for(Map.Entry<String,Integer> entry: book.entrySet()){

            title = entry.getKey();
            int count = entry.getValue();

            if(count > max){
                best = title;
                max = count;
            }else if(count == max){
                if(title.compareTo(best) < 0){
                    best = title;
                }
            }
            
        }
        System.out.print(best);
    }
}