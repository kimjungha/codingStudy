package src.inflearn;

import java.util.Scanner;

// 2강 대소문자 변환
public class Main02 {
    public String solution(String str){
        StringBuilder answer = new StringBuilder();

        // str 문자 배열 생성
        for(char x:str.toCharArray()){
            if(Character.isLowerCase(x)){
                answer.append(Character.toUpperCase(x));
            }else{
                answer.append(Character.toLowerCase(x));
            }
        }
        return answer.toString();
    }
    public static void main(String[] args){
        Main02 T = new Main02();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
