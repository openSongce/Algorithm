import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String temp = br.readLine();
        int test_num = Integer.parseInt(temp);
        Set<String> s = new HashSet<>();
        for(int i = 0; i < test_num; i++){
            s.add(br.readLine());
        }

        String[] ans = s.toArray(new String[0]);
        Arrays.sort(ans, (a, b) -> {
            int alen = a.length(), blen = b.length();
            if (alen < blen) {
                return -1;
            }
            else if (blen < alen){
                return 1;
            }
            else {
                return a.compareTo(b);
            }
        });
        for(String tmp : ans){
            System.out.println(tmp);
        }
    }
}