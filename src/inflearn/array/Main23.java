package src.inflearn.array;

import java.util.Scanner;
// 임시 반장 정하기
public class Main23 {
    public static void main(String[] args) {
        Main23 T = new Main23();
        Scanner kb = new Scanner(System.in);
        int count = kb.nextInt();
        int[][] arr = new int[count+1][6];
        for (int i =1; i<=count; i++){
            for(int k =1; k<=5; k++){ //1학년~ 5학년
                arr[i][k] = kb.nextInt();
            }
        }

        System.out.println(T.solution(count,arr));
    }
    public int solution(int count, int[][] arr){
        int answer = 0; //학생 번호
        int max = Integer.MIN_VALUE; // 최고값 비교를 위한 변수
        for (int i =1; i<=count; i++){
            int cnt =0;
            for(int k =1; k<=count; k++){
                for(int j =1; j<=5; j++){
                   if(arr[i][j] == arr[k][j]){
                     cnt++;
                     break; // 한 학생과 여러번 반이 중복 되어도 1번만 처리함
                   }
                }
            }
            if(cnt>max){
                max = cnt;
                answer=i;
            }
        }

        return answer;
    }
}
