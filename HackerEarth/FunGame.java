package HackerEarth;
import java.io.*;
import java.util.*;


public class FunGame {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
         int n = Integer.parseInt(br.readLine().trim());
         String[] arr_arr = br.readLine().split(" ");
         int[] arr = new int[n];
         for(int i_arr=0; i_arr<arr_arr.length; i_arr++)
         {
         	arr[i_arr] = Integer.parseInt(arr_arr[i_arr]);
         }

         int[] out_ = funGame(arr);
         System.out.print(out_[0]);
         for(int i_out_=1; i_out_<out_.length; i_out_++)
         {
         	System.out.print(" " + out_[i_out_]);
         }

         wr.close();
         br.close();
    }
    static int[] funGame(int[] arr){
        Queue<Integer> q=new LinkedList<>();
     Stack<Integer> stk=new Stack<>();
     
     int []out=new int[arr.length];
     int k=0;
    for(int i=0;i<arr.length;i++){
        stk.push(arr[i]);
        q.add(arr[i]);
    }
     
    while((!q.isEmpty()) && (!stk.isEmpty())){
        if(q.peek()>stk.peek()){
            out[k]=1;
            k++;
            q.poll();

        }
        else if(q.peek()<stk.peek()){
            out[k]=2;
            k++;
            stk.pop();
        }
        else if(q.peek()==stk.peek()){
            out[k]=0;
            k++;
            stk.pop();q.poll();
        }
    }
    return out;
}
}