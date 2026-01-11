package src.inflearn.string;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Main T = new Main();

        String str = in.nextLine();
        System.out.println(T.solution(str));
    }

    // 팰린드롬 문자
    public String solution(String str) {
       String formatStr = str.toUpperCase().replaceAll("[^A-Z]","");
       String reversed = new StringBuilder(formatStr).reverse().toString();
       System.out.println("reversed = " + reversed);
       return formatStr.equals(reversed) ? "YES" : "NO";
    }
    
}
