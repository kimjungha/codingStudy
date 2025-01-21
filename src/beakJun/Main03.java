package src.beakJun;

import java.util.Scanner;
import java.util.Stack;

//9012번 : 괄호
public class Main03 {
    public static void main(String[] args) {
        Main03 T = new Main03();
        Scanner kb = new Scanner(System.in);
        int cnt = kb.nextInt();
        String[] strArr = new String[cnt];
        for(int i =0; i<cnt; i++){
            strArr[i] = kb.next();
        }
        for (String result:T.solution(strArr)){
            System.out.println(result);
        }
    }

    public String[] solution(String[] strArr){
        String[] result = new String[strArr.length];
        for (int i =0; i< strArr.length; i++){
            Stack<Character> stack = new Stack<>();
            for(char c :strArr[i].toCharArray()){
                if(c=='(') {
                    stack.push(c);
                }else{
                  if(stack.isEmpty()){
                      stack.push(c);
                      break;
                  }else{
                      stack.pop();
                  }
                }
            }
            if (stack.isEmpty()){
                result[i] = "YES";
            }else{
                result[i] = "NO";
            }
        }
        return result;
    }
}
