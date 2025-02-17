package src.backJoon.input_output.p11721;

import java.util.Scanner;
// 문자열 갯수만큼 자를때 subString 사용, 마지막 index 처리 필요
public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String line = kb.nextLine();
        for(int i =0; i< line.length(); i = i+10){
            int endIndex = Math.min(i + 10, line.length()); // 마지막 부분 처리
            System.out.println(line.substring(i,endIndex));
        }
    }
}
