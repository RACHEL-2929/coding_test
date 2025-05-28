import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        Set<String> names = new HashSet<>();
        StringTokenizer st;

        for(int i = 0; i<num; i++){
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String EoL = st.nextToken();
            if(EoL.equals("enter")) names.add(name);
            else names.remove(name);
        }

        List<String> list = new ArrayList<>(names);
        Collections.sort(
            list,(a,b)-> {return b.compareTo(a);}
        );
        for(String n: list){
            System.out.println(n);
        }
        
        
    }
}