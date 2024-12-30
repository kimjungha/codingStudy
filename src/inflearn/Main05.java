package src.inflearn;

import java.util.Scanner;

/** 특정 문자 뒤집기 */
public class Main05 {
    public static void main(String[] args){
        Main05 T = new Main05();
        Scanner kb = new Scanner(System.in);
        T.solution(kb.next());
    }

    public String solution(String str){
        String answer = null;
        char[] s = str.toCharArray();
        int lt = 0;
        int rt = str.length()-1;
        while (lt<rt){
            //특수 문자 인지 확인 (알파벳이 아니면)
            if(!Character.isAlphabetic(s[lt])){lt++;}
            else if(!Character.isAlphabetic(s[rt])){rt--;}
            else{
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(s);
        return answer;
    }
}
