import java.util.*;
import java.lang.*;
import java.io.*;


// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = br.readLine().split(" ");
        int test_num = Integer.parseInt(temp[0]);
        int str_num = Integer.parseInt(temp[1]);
        String temp_str;
        for(int i = 0; i < test_num; i++){
            temp_str = br.readLine();
            StringBuffer sb = new StringBuffer(temp_str);
            temp_str = sb.reverse().toString();
            System.out.println(temp_str);
        }
    }
}