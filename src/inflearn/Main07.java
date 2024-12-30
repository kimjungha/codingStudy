package src.inflearn;

import java.util.Scanner;

/** 회문 문자열 : 앞으로 읽으나, 뒤로 읽으나 동일한 문자열 */
public class Main07 {
    public static void main(String[] args){
        Main07 T = new Main07();
        Scanner kb = new Scanner(System.in);
        System.out.println(T.solution2(kb.next()));
    }

    public String solution(String str){
        String answer = "YES";
        str = str.toUpperCase();
        int len = str.length();
        for(int i=0; i<len/2; i++) {
            if(str.charAt(i)!= str.charAt(len-1-i)){
                return "NO";
            }
        }
        return answer;
    }

    public String solution2(String str){
        String answer = "YES";
        String tmp = new StringBuilder(str).reverse().toString();
        //대소문자 상관없이 비교
        if(!str.equalsIgnoreCase(tmp)){
            return "NO";
        }
        return answer;
    }
}
