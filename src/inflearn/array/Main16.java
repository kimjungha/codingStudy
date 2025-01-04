package src.inflearn.array;

import java.util.ArrayList;
import java.util.Scanner;

/** 피보나치 수열 */
public class Main16 {
    public static void main(String[] args) {
        Main16 T  = new Main16();
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();

        for (int i:T.solution(num)) {
            System.out.print(i+" ");
        }
    }
    public ArrayList<Integer> solution(int num){
        ArrayList<Integer> answer= new ArrayList<>();
        answer.add(1);
        answer.add(1);
        for(int i =2; i<num; i++){
            answer.add(answer.get(i-1)+answer.get(i-2));
        }
        return answer;
    }
}
