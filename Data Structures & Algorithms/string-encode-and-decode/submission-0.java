class Solution {

    public String encode(List<String> strs) {

        StringBuilder message = new StringBuilder();

        for(String str : strs){
           message.append(str.length()).append('#').append(str);
        }
        return message.toString();
    }

    public List<String> decode(String str) {

        List<String> result = new ArrayList<>();

        int i = 0;

        while(i<str.length()){
            int j= i;
            while(str.charAt(j) != '#'){
                j++;
            }

            int length = Integer.parseInt(str.substring(i, j));

            int wordStart = j + 1;
            int wordEnd = wordStart + length;
            
            result.add(str.substring(wordStart, wordEnd));

            i = wordEnd;
        }
        return result;
    }
}
