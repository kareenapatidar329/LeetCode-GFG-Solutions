//time complexity O(n)
//space complexity O(n)


import java.util.Stack;

class Solution {
    
    public int evaluatePostfix(String[] arr) {
        
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < arr.length; i++) {
            
            String token = arr[i];
            
            if (!isOperator(token)) {
                stack.push(Integer.parseInt(token));
            } 
            else {
                
                int b = stack.pop();
                int a = stack.pop();
                
                int result = 0;
                
                switch (token) {
                    
                    case "+":
                        result = a + b;
                        break;
                        
                    case "-":
                        result = a - b;
                        break;
                        
                    case "*":
                        result = a * b;
                        break;
                        
                    case "/":
                        // floor division
                        result = (int) Math.floor((double)a / b);
                        break;
                        
                    case "^":
                        result = (int) Math.pow(a, b);
                        break;
                }
                
                stack.push(result);
            }
        }
        
        return stack.pop();
    }
    
    private boolean isOperator(String s) {
        return s.equals("+") || s.equals("-") || 
               s.equals("*") || s.equals("/") || 
               s.equals("^");
    }
}