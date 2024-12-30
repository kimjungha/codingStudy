package src.inflearn;

import java.util.Scanner;

/** 12강 암호*/
public class Main12 {
    public static void main(String[] args){
        Main12 T = new Main12();
        Scanner kb=new Scanner(System.in);
        int cnt = kb.nextInt();
        String str =kb.next();
        System.out.println(T.solution(cnt,str));
//        for (char x:T.solution(cnt,str)){
//            System.out.printf(String.valueOf(x));
//        }
    }
    public char[] solution(int cnt,String str){
        String answer = str.replace("#","1");
        answer = answer.replace("*","0");

        int arrSize = str.length()/cnt;
        int num = 0;
        char[] answerArr = new char[cnt];
        for(int i =0; i<answer.length(); i+=arrSize){
            int end = arrSize * (num+1);
            answerArr[num] = (char) Integer.parseInt(answer.substring(i,end), 2);
            ++num;
        }
        return answerArr;
    }
    public String solution2(int cnt,String str){
      StringBuilder answer = new StringBuilder();
      int moq = str.length()/cnt;
      for(int i =0; i<cnt; i++){
          String tmp = str.substring(i,moq).replace("#","1").replace("*","0");
          int num = Integer.parseInt(tmp,2); //2진수로 넘어 간다 -> 10진수로 변경
          answer.append((char) num);
      }
      return answer.toString();
    }
}
