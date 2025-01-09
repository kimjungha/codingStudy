package src.inflearn.array;


import java.util.Scanner;

// 봉우리
public class Main22 {
    public static void main(String[] args) {
        Main22 T = new Main22();
        Scanner kb = new Scanner(System.in);
        int count = kb.nextInt();
        int[][] arr = new int[count+2][count+2];
        for (int i =1; i<count+1; i++){
            for(int k =1; k<count+1; k++){
                arr[i][k] = kb.nextInt();
            }
        }

        System.out.println(T.solution(count,arr));
    }
    public int solution(int count,int[][] arr){
        int answer = 0;
        for (int i =1; i<count+1; i++){
            for(int k =1; k<count+1; k++){
                int max = 0;
                max = Math.max(max,arr[i][k-1]);
                max = Math.max(max,arr[i-1][k]);
                max = Math.max(max,arr[i][k+1]);
                max = Math.max(max,arr[i+1][k]);
                if(arr[i][k]>max){
                    ++answer;
                }
            }
        }
        return answer;
    }
}
