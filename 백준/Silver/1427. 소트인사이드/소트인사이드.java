import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split("");
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i<arr.length; i++){
            list.add(Integer.parseInt(arr[i]));
        }
        Collections.sort(list,Collections.reverseOrder());
        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i));
        }
        
    }
}