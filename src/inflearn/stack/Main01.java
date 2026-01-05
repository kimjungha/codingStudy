package src.inflearn.stack;

import java.util.Scanner;
import java.util.Stack;

// 스택 - 올바른 괄호
public class Main01 {
    public static void main(String[] args){
        Main01 T = new Main01();
        Scanner kb = new Scanner(System.in);
        String str = kb.next(); 
        System.out.println(T.solution(str));
        kb.close();
    }

    public String solution(String str) {
       String answer = "YES";
       Stack<Character> stack = new Stack<>();
         for (char x : str.toCharArray()) {
              if (x == '(') {
                stack.push(x);
              } else if (x == ')') {
                if (stack.isEmpty()) {
                     return "NO";
                }
                stack.pop();
              }
         }
        if (!stack.isEmpty()) {
            return "NO";
        }
       return answer;
    }
}
