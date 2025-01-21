package src.inflearn.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/** 과제 안 내신분 */
public class Main26 {
    public static void main(String[] args) {
        Main26 T = new Main26();
        Scanner kb = new Scanner(System.in);
        int[] numArr = new int[28];

        for(int i =0; i<28; i++){
            numArr[i] = kb.nextInt();
        }

        Arrays.sort(numArr);
        for(int num:T.solution(numArr)){
            System.out.println(num);
        }
    }
    public ArrayList<Integer> solution(int[] numArr){
        ArrayList<Integer> result = new ArrayList<>();

        for (int i =1; i<31; i++){
            for (int num = 0; num<numArr.length; num++){
                if(i == numArr[num]){
                    break;
                }
                if (num == numArr.length-1){
                    result.add(i);
                }
            }

        }

        return result;
    }
}
