package leet_code_solutions;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BracketCheck {
    public static void main(String[] args) {
        String brackets = "{([()])}";
        System.out.println(checkForBracketValidity(brackets));
    }
    public static boolean checkForBracketValidity(String theBrackets){
        Map<Character, Character> map = new HashMap<>();
        map.put('(',')');
        map.put('{','}');
        map.put('[',']');
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < theBrackets.length(); i++) {
            char theBracket = theBrackets.charAt(i);
           if(map.containsKey(theBracket)){
               stack.push(theBracket);
           }
           else if(map.containsValue(theBracket)){
               if(!stack.isEmpty() && map.get(stack.peek())==theBracket){
                   stack.pop();
               }
               else{
                   return false;
               }
           }
        }
        return stack.isEmpty();
    }
}
