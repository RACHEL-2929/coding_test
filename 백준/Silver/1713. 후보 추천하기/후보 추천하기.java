import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {

   static class Student {
        int id, time, recommend;

        Student(int id, int time, int recommend) {
            this.id = id;
            this.time = time;
            this.recommend = recommend;
        }
    }

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt)
            .toArray();

        
        List<Student> frame = new ArrayList<>();

        int time = 0;
        for(int num:input){
            boolean exists = false;

            for(Student s: frame){
                if(s.id == num){
                    s.recommend++;
                    exists = true;
                    break;
                }
            }
            
            if(!exists){
                if(frame.size() == N){
                    Collections.sort(frame, (a,b) ->{
                        if(a.recommend == b.recommend) return a.time - b.time;
                        return a.recommend-b.recommend;
                    });
                    frame.remove(0);
                }
                frame.add(new Student(num,time,1));
                
            }
             time++;
        }

        frame.sort(Comparator.comparingInt(s->s.id));
        for(Student s: frame){
            System.out.print(s.id+" ");
        }
       
        
        
    }
}