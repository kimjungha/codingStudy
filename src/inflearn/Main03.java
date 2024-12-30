package src.inflearn;

import java.util.Scanner;

//3강 문장 속 단어
public class Main03 {

    public static void main(String[] args){
        Main03 T = new Main03();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(T.solution(str));
    }

    public String solution(String str) {
        String answer = "";
        int m = Integer.MIN_VALUE;
        String[] strArr = str.split(" ");
        for(String x : strArr){
            int length = x.length();
            if(length>m){
                 m=length;
                 answer =x;
            }
        }
        return answer;
    }
}
