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

    public ArrayList<String> solution2(int n, String[] str){
        ArrayList<String> answer = new ArrayList<>();
        for(String x:str){
           char[] s= x.toCharArray();
           int lt =0;
           int rt = x.length() -1;
           while (lt<rt){
               char tmp = s[lt];
               s[lt] = s[rt];
               s[rt] = tmp;
               lt++;
               rt--;
           }

           //valueOf 는 static으로 선언된 클래스 메서드 char배열값을 string으로 변경
           String tmp = String.valueOf(s);
           answer.add(tmp);
        }
        return answer;
    }
}
