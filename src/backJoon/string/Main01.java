package src.backJoon.string;

import java.util.Scanner;

/** 문자열 :27866번  */
public class Main01 {
    public static void main(String[] args){
        Main01 T = new Main01();
        Scanner kb=new Scanner(System.in);
        String str =kb.next();
        int num =kb.nextInt();
        System.out.println(T.solution(str,num));
    }
    public char solution(String str,int num) {
        return str.charAt(num-1);
    }
}
