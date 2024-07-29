class Solution {
    public int solution(int n, int k) {
        //10인분 => 음료하나 서비스
        //양꼬치 1인분 = 12,000
        //음료 1개 = 2,000
        int stick = n * 12000;
        int juice = k * 2000;        
        int total = 0;
        
               
        //양꼬치를 10인분 먹었을 때 음료수 하나 서비스        
        if (n >= 10) {
            int service = n/10 * 2000;        
            total = stick + juice - service;
        } else if (n < 10) {
            total = stick + juice;
        }
                                                
        int answer = total;
        //답은 (양꼬치 갯수 * 12000) + (음료수 갯수 * 2000) - 서비스로 받은 음료수 값 제외
        return answer;
    }
}