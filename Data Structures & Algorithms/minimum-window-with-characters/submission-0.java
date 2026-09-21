class Solution {
    public String minWindow(String s, String t) {
        if(t.length() > s.length()){
            return "";
        }
        int[] tCount = new int[128];
        int[] window = new int[128];
        int count =0;
        int l=0;
        int r=0;
        int minLen = Integer.MAX_VALUE; 
        int startIndex = 0;

        for(int i = 0; i<t.length();i++){
            tCount[t.charAt(i)]++;
        }

        while(r<s.length()){
            char c= s.charAt(r);
            window[c]++;
            if(window[c] <= tCount[c]){
                count++;
            }

            while(count == t.length()){

                if (r - l + 1 < minLen) {
                    minLen = r - l + 1;
                    startIndex = l;
                }
                char leftChar = s.charAt(l);
                window[leftChar]--;

                if (window[leftChar] < tCount[leftChar]) {
                    count--; 
                }

                l++;
            }
            r++;
        }
       
        if (minLen == Integer.MAX_VALUE) {
            return "";
        }
        
        return s.substring(startIndex, startIndex + minLen);
    }
}
