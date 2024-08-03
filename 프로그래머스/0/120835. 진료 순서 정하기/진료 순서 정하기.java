class Solution {
    public int[] solution(int[] emergency) {                       
        int[] answer = new int[emergency.length];
        
        //배열의 각 요소를 순회 후 순위를 매김
        for (int i = 0; i < emergency.length; i++) {
            int rank = 1;
            //rank는 1위로 초기화
         for (int j = 0; j < emergency.length; j++) {
            if(emergency[j] > emergency[i]) {
                rank++;
            } 
            // j가 i보다 크면 순위 증가, 아니면 유지
        }
        answer[i] = rank;
        }
        return answer;
    }
}