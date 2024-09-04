class Solution {
    public int solution(int number, int n, int m) {
        int perfectNum = 0;
        if (number % n == 0 && number % m == 0) {
            perfectNum = 1;
        }
        int answer = perfectNum;
        return answer;
    }
}