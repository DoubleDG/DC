package Oct1004;

public class Main {
    public static void main(String[] args) {

        Solution sol = new Solution();

        System.out.println(sol.insertDash("454793"));

    }
}

class Solution {
    public String insertDash(String str) {
        // TODO:

        //빈 문자열이 들어오면 null 을 return 한다.
        if(str.length() == 0) {
            return null;
        }
        String result = "" + str.charAt(0);

        for(int i = 1; i < str.length(); i++) {
            //str 인덱스 앞자리가 홀짝인지 구별한다.
            int preNumber = Character.getNumericValue(str.charAt(i - 1)) % 2;
            int curNumber = Character.getNumericValue(str.charAt(i)) % 2;
            //앞자리와 원래 자리의 홀수면 - 를 더해준다.
            if(preNumber != 0 && curNumber != 0) {
                result = result + "-";
            }
            //if 문 조건에 맞지않으면 조건문을 나와 숫자를 더해준다.
            result = result + str.charAt(i);
        }
        return result;
    }
}
