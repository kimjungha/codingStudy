package src.backJoon.string;

import java.util.Scanner;

/** 입력받은 문자열 출력 */
public class Main05 {
    public static void main(String[] args){
        Scanner kb=new Scanner(System.in);
        while (kb.hasNextLine()){ //다음줄에 있는지 확인
            System.out.println(kb.nextLine());
        }
        kb.close();
    }
}
