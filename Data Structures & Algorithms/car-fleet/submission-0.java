class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;

        if (n == 0) return 0;

        int[][] cars = new int[n][2];

        for(int i = 0; i< n ;i++){
            cars[i][0] = position[i];
            cars[i][1] = speed[i];
        }

        Arrays.sort(cars,(a,b)-> Integer.compare(a[0],b[0]));

        Stack <Double> stack = new Stack<>();

        for(int i = n-1; i >=0 ;i--){

             Double timeToTarget = (double) (target - cars[i][0]) / cars[i][1];

             if(stack.isEmpty()) {
                    stack.push(timeToTarget);
             }else if(timeToTarget > stack.peek() ){
                stack.push(timeToTarget);
             }

            
             
        }
        return stack.size();
    }
}
