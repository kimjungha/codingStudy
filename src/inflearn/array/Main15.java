package src.inflearn.array;

import java.util.ArrayList;
import java.util.Scanner;

/** 가위 바위 보 */
public class Main15 {
    public static void main(String[] args) {
        Main15 T = new Main15();
        Scanner kb = new Scanner(System.in);
        int cnt = kb.nextInt();
        int[] aInfo = new int[cnt];
        int[] bInfo = new int[cnt];

        for (int i =0; i<cnt; i++){
            aInfo[i] = kb.nextInt();
        }
        for (int i =0; i<cnt; i++){
            bInfo[i] = kb.nextInt();
        }
        System.out.println(T.solution(aInfo,bInfo));

        for(Object x: T.solution(aInfo,bInfo).toArray()){
            System.out.println(x);
        }
    }

    public ArrayList<String> solution(int[] aInfo,int[] bInfo){
        ArrayList<String> answer = new ArrayList<>();

        for (int i=0; i<aInfo.length; i++){
            if(aInfo[i]==bInfo[i]){
                answer.add("D");
            }else if(aInfo[i]!=2 && bInfo[i]!=2 ){
                if(aInfo[i] ==1){
                    answer.add("A");
                }else{
                    answer.add("B");
                }
            }else{
                if(aInfo[i]<bInfo[i]){
                    answer.add("B");
                }else{
                    answer.add("A");
                }
            }
        }

//      A 의 입장에서 이기는 모든 케이스를 if에 해두고 나머지를 생각해도 됌 (한 편에서만 생각해보기)
//        for (int i=0; i<aInfo.length; i++){
//            if(aInfo[i]==bInfo[i]) answer.add("D");
//            else if (a[i]==1) {}
//        }
        return answer;
    }
}
