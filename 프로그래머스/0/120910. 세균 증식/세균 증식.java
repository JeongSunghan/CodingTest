class Solution {
    public int solution(int n, int t) {
        //세균은 1시간에 2배 증식 => 2의 제곱
        //세균의 마리수는 n, 경과 시간은 t
                
        double virus = Math.pow(2, t);        
        int t2 = (int)virus;
        int answer = n * t2;
        return answer;
    }
}