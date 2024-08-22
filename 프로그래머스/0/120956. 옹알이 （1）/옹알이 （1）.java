class Solution {
    public int solution(String[] babbling) {
        //조카가 가능한 발음
        String[] str = {"aya", "ye", "woo", "ma"};        
        int answer = 0;
        
        //주어진 배열과, 발음할 수 있는 문자가 일치하는 문자열이 있으면 공백으로 바꾸기
        for(int i=0; i<babbling.length; i++){
            for(int j=0; j<str.length; j++){
                babbling[i] = babbling[i].replace(str[j], " ");
                //발음 가능한 문자열을 찾아서 공백으로 대체
            }
            
            //trim을 이용하여 문자열 양쪽 끝 공백제거 및 길이가 0인지 확인
            //길이가 0이면, 발음할 수 있는 만자열로 구성
            if(babbling[i].trim().length() == 0){
                answer++;
            }
        }
        return answer;
    }
}