import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < 3; i++){
            list.add(sc.nextInt());
        }
        System.out.println(Collections.min(list));
        list.remove(Collections.min(list));
        System.out.println(Collections.min(list));
        System.out.println(Collections.max(list));
    }
}