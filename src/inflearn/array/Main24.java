package src.inflearn.array;

import java.util.Scanner;

//멘토링
public class Main24 {
    public static void main(String[] args) {
        Main24 T = new Main24();
        Scanner kb = new Scanner(System.in);
        int studentCnt = kb.nextInt();
        int examCnt = kb.nextInt();
        int[][] arr = new int[examCnt][studentCnt];
        for (int i =0; i<examCnt; i++){
            for(int k =0; k<studentCnt; k++){
                arr[i][k] = kb.nextInt();
            }
        }

        System.out.println(T.solution(examCnt,studentCnt,arr));
    }

    //2차원 배열을 4중 포문을 돌려봐라~ 문제
    public int solution(int examCnt,int studentCnt,int[][] arr){
        int answer =0;

        // 가능한 최대의 수를 생각해봤을때 멘토 4명 * 멘티 4명 => 16명을 생각
        for (int i =1; i<=studentCnt; i++){
            for (int j =1; j<=studentCnt; j++){
                int cnt =0;
                for(int k =0; k<examCnt; k++){
                    int pi =0;
                    int pj =0;
                    for(int s =0; s<studentCnt; s++){
                        if(arr[k][s] == i)pi =s;
                        if(arr[k][s] ==j)pj =s;
                    }
                    if(pi<pj)cnt++;
                }
                if(cnt==examCnt)answer++;
            }
        }
        return answer;
    }
}
