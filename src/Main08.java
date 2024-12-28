package src;

import java.util.Scanner;

/** 팰린드롭 = 회문 문자열
 * 알파벳만 회문인지 검증하기 */
public class Main08 {
    public static void main(String[] args){
        Main08 T = new Main08();
        Scanner kb = new Scanner(System.in);
        System.out.println(T.solution(kb.nextLine()));
    }

    public String solution(String str){
        //정규식 사용해서 문자열 아닌거 다 제거
        str = str.toUpperCase().replaceAll("[^A-Z]","");
        String reverse = new StringBuilder(str).reverse().toString();
        if(str.equals(reverse)){
            return "YES";
        }
        return "NO";
    }
}
