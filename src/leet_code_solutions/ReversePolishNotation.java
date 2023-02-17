package leet_code_solutions;

//        Evaluate the value of an arithmetic expression in Reverse Polish Notation.
//                Valid operators are +, -, *, /. Each operand may be an integer or another
//                 expression.
//                Some examples:
//                ["2", "1", "+", "3", "*"] -> ((2 + 1) * 3) -> 9
//                ["4", "13", "5", "/", "+"] -> (4 + (13 / 5)) -> 6

import java.util.Stack;

public class ReversePolishNotation {
    public static void main(String[] args) {
        String[] tokens = {"2","1","+","3","*"};
        int result = reversePolishNotation(tokens);
        System.out.println(result);
    }
    public static int reversePolishNotation(String[] token){
      String identifiers = "-+/*";
      Stack<String> stack = new Stack<>();
        for (String value : token) {
            if (!identifiers.contains(value)) {
                stack.push(value);
            } else {
                System.out.println(stack.peek());
                int a = Integer.parseInt(stack.pop());
                System.out.println(stack.peek());
                int b = Integer.parseInt(stack.pop());
                int index = identifiers.indexOf(value);
                System.out.println(value);

                switch (index) {
                    case 0 -> stack.push(String.valueOf(b - a));
                    case 1 -> stack.push(String.valueOf(b + a));
                    case 2 -> stack.push(String.valueOf(b / a));
                    case 3 -> stack.push(String.valueOf(b * a));
                }

            }
        }
       return Integer.parseInt(stack.pop());
    }
}
