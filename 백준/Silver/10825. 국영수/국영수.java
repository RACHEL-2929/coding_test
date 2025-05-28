import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {

    static class Student {
        String name;
        int ko;
        int en;
        int math;

        Student(String name,int ko,int en,int math) {
            this.name = name;
            this.ko = ko;
            this.en = en;
            this. math = math;
        }
    }

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());

        List<Student> list = new ArrayList<>();
        for(int i = 0; i<num; i++){
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int ko = Integer.parseInt(st.nextToken());
            int en = Integer.parseInt(st.nextToken());
            int math = Integer.parseInt(st.nextToken());
            list.add(new Student(name, ko, en, math));
        }

        list.sort(
            (a,b)->{
                if(a.ko==b.ko) {
                    if(a.en == b.en){
                        if(a.math == b.math) return a.name.compareTo(b.name);
                        return b.math - a.math;
                    }
                    return a.en - b.en;
                }
                return b.ko- a.ko;
            }
        );

        for(Student s: list){
            System.out.println(s.name);
        }
        
    }
}