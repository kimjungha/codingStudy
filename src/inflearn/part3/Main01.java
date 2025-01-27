package src.inflearn.part3;

import java.util.ArrayList;
import java.util.Scanner;

//강의 part 3 1번 문제 > 두 배열 합치기
public class Main01 {
    public static void main(String[] args) {
        Main01 T = new Main01();
        Scanner kb = new Scanner(System.in);
        int num1 = kb.nextInt();
        int[] num1Array  = new int[num1];
        for (int i =0; i<num1; i++){
            num1Array[i] = kb.nextInt();
        }
        int num2 = kb.nextInt();
        int[] num2Array  = new int[num2];
        for (int i =0; i<num2; i++){
            num2Array[i] = kb.nextInt();
        }
        System.out.println(T.soultion(num1Array,num2Array));
    }



}
