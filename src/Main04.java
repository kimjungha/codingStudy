package src;

import java.util.ArrayList;
import java.util.Scanner;
/** 4강 단어 뒤집기 */
public class Main04 {
    public static void main(String[] args){
        Main04 T = new Main04();
        Scanner kb = new Scanner(System.in);
        int n =kb.nextInt();
        String[] str = new String[n];
        for(int i=0; i<n; i++){
            str[i] = kb.next();
        }
        for(String x:T.solution(n,str)){
            System.out.println(x);
        }
    }
    public ArrayList<String> solution(int n, String[] str){
       ArrayList<String> answer = new ArrayList<>();
        for(String x:str){
            String tmp = new StringBuilder(x).reverse().toString();
            answer.add(tmp);
        }
       return answer;
    }
}
