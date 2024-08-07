class Solution {
    public String solution(String my_string) {
        
        StringBuffer sb = new StringBuffer(my_string);        
        String reverse = sb.reverse().toString();

        
        String answer = reverse;
        return answer;
    }
}