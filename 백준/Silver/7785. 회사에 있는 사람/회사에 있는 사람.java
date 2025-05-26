import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {

    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        int num = Integer.parseInt(br.readLine());

        StringTokenizer st;
        Set<String> set = new HashSet<>();
        String name = "";
        String present="";
        for(int i = 0; i< num; i++){
            st = new StringTokenizer(br.readLine());
            name = st.nextToken();
            present = st.nextToken();

            if(present.equals("enter")) set.add(name);
            else set.remove(name);
        }

        set.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }

}