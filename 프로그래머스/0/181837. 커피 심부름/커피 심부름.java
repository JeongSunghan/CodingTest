class Solution {
    public int solution(String[] order) {
        int answer = 0;
        //아메리카노, 라떼는 각각 4500, 5000
        //아무거나는 아아로 통일        
        for (String menu : order) {     //배열 순회                    
            if (menu.contains("americano") || menu.contains("anything")) {
                //특정문자 조회 후 계산
                answer += 4500;
            } else {
                answer += 5000;
            }            
        }        
        
        return answer;
    }
}