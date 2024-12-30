package src.backJoon.string;

import java.util.Scanner;
/** 팰린드롬인지 확인 */
public class Main06 {
    public static void main(String[] args){
        Main06 T = new Main06();
        Scanner kb=new Scanner(System.in);
        System.out.println(T.solution(kb.next()));
        kb.close();
    }
    public int solution(String str){
        for(int i =0; i<str.length()/2; i++){
          if(str.charAt(i) !=str.charAt(str.length()-1-i)){
              return  0;
          }
        }
        return 1;
    }
}
