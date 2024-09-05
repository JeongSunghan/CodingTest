class Solution {
    public int[] solution(int money) {
        int americanoPrice = 5500;
        int americanoCount = money / americanoPrice ;
        int smallChange = money % americanoPrice;
        int[] answer = new int[2];
        answer[0] = americanoCount;
        answer[1] = smallChange;
    
        return answer;
    }
}