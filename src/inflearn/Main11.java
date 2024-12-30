package src.inflearn;

import java.util.Scanner;

/** 11강 문자열 압축 */
public class Main11 {
    public static void main(String[] args){
        Main11 T = new Main11();
        Scanner kb=new Scanner(System.in);
        String str =kb.next();
        System.out.println(T.solution(str));
    }
    public String solution(String str){
        StringBuilder answer = new StringBuilder();
        str =str+" "; //끝 지점 까지 확인을 위해 공백 추가
        int cnt =1;
        for(int i =0; i<str.length()-1; i++){
            if(str.charAt(i) == str.charAt(i+1)) cnt++;
            else{
                answer.append(str.charAt(i));
                if(cnt>1)answer.append(cnt);
                cnt =1;
            }
        }
        return answer.toString();
    }
}
