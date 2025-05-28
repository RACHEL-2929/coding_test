import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {

    public static class Member{
        int age;
        String name;
        int order;

        Member(int age, String name, int order){
            this.age = age;
            this.name = name;
            this.order = order;
        }

        @Override
        public String toString(){
            return age + " " + name;
        }
    }
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        StringTokenizer st;
        List<Member> members = new ArrayList<>();
    
        for(int i = 0; i< num; i++){
            st = new StringTokenizer(br.readLine());

            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            members.add(new Member(age, name, i));
            
        }

        Collections.sort(
            members, (a, b) ->{
                if(a.age == b.age) return a.order - b.order;
                return a.age - b.age;
            }
        );

        for(Member m: members){
            System.out.println(m);
        }
        
    }
}