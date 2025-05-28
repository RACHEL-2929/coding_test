import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {

    public static class Dest{
        int x;
        int y;

        Dest(int x, int y){
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString(){
            return x+ " "+ y;
        }
    }

    
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        StringTokenizer st;

        List<Dest> d = new ArrayList<>();
        for(int i = 0; i< num; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            d.add(new Dest(x,y));
            
        }

        Collections.sort(
            d,(a,b) -> {
                if(a.x==b.x) return a.y - b.y;
                return a.x-b.x;
            }
        );

        for(Dest dest: d){
            System.out.println(dest);
        }
        
    }
}