package src.inflearn.array;

import java.util.Scanner;

/**
 * 개수 세기
 */
public class Main25 {
    public static void main(String[] args) {
        Main25 T = new Main25();
        Scanner kb = new Scanner(System.in);
        int count = kb.nextInt();
        int[] numArr = new int[count];
        for(int i =0; i<count; i++){
            numArr[i] = kb.nextInt();
        }
        int searchNum = kb.nextInt();

        System.out.println(T.solution(numArr,searchNum));
    }

    public int solution(int[] numArr, int searchNum){
        int result = 0;
       for(int i =0; i<numArr.length; i++){
           if(numArr[i] == searchNum)result++;
       }
       return result;
    }
}
