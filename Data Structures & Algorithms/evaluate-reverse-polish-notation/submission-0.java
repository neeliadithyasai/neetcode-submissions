class Solution {
    public int evalRPN(String[] tokens) {

        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<tokens.length;i++){

            String s = tokens[i];

            if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {  int n1 = (int) stack.pop();
                int n2 = (int) stack.pop();
                int result =0;
                switch (s) {
                    case "+":
                        result = n2 + n1;
                        break;
                    case "-":
                        result = n2 - n1;
                        break;
                    case "*":
                        result = n2 * n1;
                        break;
                    case "/":
                        result = n2 / n1; 
                        break;
                }
                stack.push(result);
            }else{
                stack.push(Integer.parseInt(s));
            }

        }
        return stack.pop();
    }
}
