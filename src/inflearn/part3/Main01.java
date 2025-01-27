package src.inflearn.part3;

import java.util.ArrayList;
import java.util.Scanner;

//강의 part 3 1번 문제 > 두 배열 합치기
// 투 포인터 알고리즘으로 접 => 시간복잡도 o(n)
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
        for (int m:T.soultion(num1,num2,num1Array,num2Array)) {
            System.out.print(m);
        }
    }

    public ArrayList<Integer> soultion(
        int num1,int num2,int[] num1Array, int[]num2Array
    ){
        ArrayList<Integer> answer = new ArrayList<>();
        int p1 = 0;
        int p2 = 0;

        while(p1<num1 && p2<num2){
            if(num1Array[p1]<num2Array[p2]){
                answer.add(num1Array[p1++]);
            }else{
                answer.add(num2Array[p2++]);
            }
        }
        while(p1<num1){
            answer.add(num1Array[p1++]);
        }
        while(p2<num2){
            answer.add(num2Array[p2++]);
        }

        return answer;
    }

}
