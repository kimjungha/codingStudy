package src.inflearn;

import java.util.Scanner;

// 1강 문자 찾기
public class Main01 {

    /** String 받는 str request 안에서, t 글자 몇개 있는지 수량 반환 (대소문자 구별 없음) */
    public int solution(String str,char t){
        int answer =0;
        str = str.toUpperCase(); //대문자화
        t=Character.toUpperCase(t); // character 대문자화

//        for(int i=0; i<str.length(); i++){
//            if(str.charAt(i) == t){
//                answer++;
//            }
//        }

        // toCharArray : 문자 배열 생성
        for(char x:str.toCharArray()){
            if(x == t){
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args){
        Main01 T = new Main01();
        Scanner kb = new Scanner(System.in);
        String str = kb.next(); //next() 문자열을 하나 읽음
        char c = kb.next().charAt(0); //cha
        System.out.println(T.solution(str,c));
    }
}
