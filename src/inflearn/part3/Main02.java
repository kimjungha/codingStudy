package src.inflearn.part3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

// 공통 원소 구하기 > 투 포인터 알고리즘 사용하기
public class Main02 {
    public static void main(String[] args) {
        Main02 T = new Main02();
        Scanner kb = new Scanner(System.in);
        int cnt1 = kb.nextInt();
        int[] cnt1Array = new int[cnt1];
        for (int i =0; i<cnt1; i++){
            cnt1Array[i] = kb.nextInt();
        }
        int cnt2 = kb.nextInt();
        int[] cnt2Array = new int[cnt2];
        for (int i =0; i<cnt2; i++){
            cnt2Array[i] = kb.nextInt();
        }

        for (int k:T.solution(cnt1Array,cnt2Array)) {
            System.out.print(k +" ");
        }
    }

    private ArrayList<Integer>  solution(int[] cnt1Array, int[] cnt2Array) {
        ArrayList<Integer> answer = new ArrayList<>();
        Arrays.sort(cnt1Array);
        Arrays.sort(cnt2Array);
        int p1 = 0;
        int p2 = 0;
        while(p1<cnt1Array.length && p2<cnt2Array.length){
            if(cnt1Array[p1] == cnt2Array[p2]){
                answer.add(cnt1Array[p1]);
                p1++;
                p2++;
            }else if(cnt1Array[p1]<cnt2Array[p2]){
                p1++;
            }else{
                p2++;
            }

        }

        return answer;
    }
}
