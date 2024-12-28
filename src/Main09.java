package src;

import java.util.Scanner;

/** 숫자만 추출 */
public class Main09 {
    public static void main(String[] args){
        Main09 T = new Main09();
        Scanner kb = new Scanner(System.in);
        System.out.println(T.solution2(kb.next()));
    }

    public int solution(String str){
        int answer = 0;
        for(char x:str.toCharArray()){
            //아스키번호로 48~57 사이는 숫자 0~9
            if(x>=48 && x<=57){
                answer = answer*10 + (x-48);
            }
        }
        return answer;
    }

    public int solution2(String str){
        StringBuilder answer = new StringBuilder();
        for(char x:str.toCharArray()){
            if(Character.isDigit(x)){ //isDigit 숫자인지 확인
                answer.append(x); //string 으로 누적
            }
        }
        return Integer.parseInt(answer.toString());
    }
}
