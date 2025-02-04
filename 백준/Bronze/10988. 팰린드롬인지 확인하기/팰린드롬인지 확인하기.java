import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String temp = br.readLine();
            String[] temp_split = temp.split("");
            for(int i = 0; i < temp.length()/2; i++){
                if(temp_split[i].equals(temp_split[temp.length()-i-1])){
                    continue;
                }
                else{
                    System.out.print("0");
                    return;
                }
            }
            System.out.print("1");
        
        
                
    }
}