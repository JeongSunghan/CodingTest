class Solution {
    public int solution(int[] date1, int[] date2) {
        //date1 과 2의 길이는 같다.
        //date1 이 2보다 앞서는 날짜라면 1 아니면 0을 반환
        
        for (int i = 0; i < date1.length; i++) {
            if(date1[i] < date2[i]) {
                return 1;
                
            } else if (date1[i] > date2[i]) {
                return 0;
            }
        }            
        //날짜가 동일해도 0을 반환
        return 0;
    }
}