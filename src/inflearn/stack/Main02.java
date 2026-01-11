package src.inflearn.stack;
import java.util.Scanner;
import java.util.Stack;
  
public class Main02 {
  public static void main(String[] args){
    Main02 T = new Main02();
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
 	  System.out.println(T.solution(str));
    in.close();
  }

  // 후순위연산 
  public int solution(String str){
    Stack<Integer> stack = new Stack<>();
    for(char x: str.toCharArray()){
      if(Character.isDigit(x)){
        stack.push(x - '0');
      }else{
        int rt = stack.pop();
        int lt = stack.pop();
        if(x == '+'){
          stack.push(lt + rt);
        }else if(x == '-'){
          stack.push(lt - rt);
        }else if(x == '*'){
          stack.push(lt * rt);
        }else if(x == '/'){
          stack.push(lt / rt);
      }
    }
  }
   return stack.get(0);
  }
}