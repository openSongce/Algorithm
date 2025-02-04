import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++){
            String temp = br.readLine();
            int sum = 0;
            int j = 0;
            String[] temp_split = temp.split("");
            while(j<temp_split.length && temp_split[j] !=null){
                int temp_sum = 1;
                
                if(temp_split[j].equals("O")){
                    while(j<temp_split.length && temp_split[j].equals("O")){
                        j++;
                        sum += temp_sum++;
                    }
                }
                else{
                    j++;
                }
            }
            System.out.println(sum);
                
        }
    }
}