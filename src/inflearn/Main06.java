package src.inflearn;

import java.util.Scanner;

/** 중복 문자 제거 */
public class Main06 {
    public static void main(String[] args){
        Main06 T = new Main06();
        Scanner kb = new Scanner(System.in);
        System.out.println(T.solution(kb.next()));

    }
    public String solution(String str){
        String answer = "";
        for (int i=0; i<str.length(); i++){
            // 특정문자가 시작되는 위치와 동일할때만 참
            if(str.indexOf(str.charAt(i)) ==i){
                answer+=str.charAt(i);
            }
        }
        return answer;
    }
}
