package src.inflearn.array;

import java.util.Scanner;

public class Main23 {
    public static void main(String[] args) {
        Main23 T = new Main23();
        Scanner kb = new Scanner(System.in);
        int count = kb.nextInt();
        int[][] arr = new int[count][count];
        for (int i =0; i<count; i++){
            for(int k =0; k<count; k++){
                arr[i][k] = kb.nextInt();
            }
        }

        System.out.println(T.solution(arr));
    }
    public int solution(int[][] arr){
        int answer = 1;
      // 여기 해야함

        return answer;
    }
}
