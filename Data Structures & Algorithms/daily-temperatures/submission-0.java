class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
  
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < temperatures.length; i++) {
            int currentTemp = temperatures[i];
 
            while (!stack.isEmpty() && currentTemp > temperatures[stack.peek()]) {
                
                int pastDayIndex = stack.pop(); 

                result[pastDayIndex] = i - pastDayIndex; 
            }
            
          
            stack.push(i);
        }
        
        return result;
    }
}