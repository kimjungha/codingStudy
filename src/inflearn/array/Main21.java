package src.inflearn.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//격자판 최대합
public class Main21 {
    public static void main(String[] args) {
        Main21 T = new Main21();
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
        int[][] arr = new int[num][num];
        for(int i =0; i<num; i++){
            for(int k =0; k<num; k++){
                arr[i][k] = kb.nextInt();
            }
        }
        ArrayList<Integer> addResult = new ArrayList<>();
        for(int i =0; i<num; i++){
            int tmp = 0;
            for(int k =0; k<num; k++){
                tmp +=arr[i][k];
            }
            addResult.add(tmp);
        }

        for(int j =0; j<num; j++){
            int tmp = 0;
            for(int m =0; m<num; m++){
                tmp +=arr[m][j];
            }
            addResult.add(tmp);
        }

        for(int j =0; j<num; j++){
            int tmp = 0;
            for(int m =0; m<num; m++){
                if(j==m){
                    tmp +=arr[j][m];
                }
            }
            addResult.add(tmp);
        }

        for(int l =0; l<num; l++){
            int tmp = 0;
            for(int m =0; m<num; m++){
                if(l+m == num){
                    tmp +=arr[l][m];
                }
            }
            addResult.add(tmp);
        }
        System.out.println(Collections.max(addResult));

        kb.close();
    }

    public int solution(int n, int[][] arr){
        int answer = Integer.MIN_VALUE;
        int sum1 =0;
        int sum2 =0;
        for (int i=0; i<n; i++){
            for(int k =0; k<n; k++){
                sum1 += arr[i][k];
                sum2 += arr[k][i];
            }
            answer = Math.max(answer,sum1);
            answer = Math.max(answer,sum2);
        }
        sum1 = sum2 =0;
        for (int i =0; i<n; i++){
           sum1 +=arr[i][i];
           sum2 +=arr[i][n-i-1];
        }
        answer = Math.max(answer,sum1);
        answer = Math.max(answer,sum2);
        return answer;
    }

}
