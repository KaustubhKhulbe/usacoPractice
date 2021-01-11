package Not_USACO.LeetCode.topInterviewQuestions.easyCollection;

class PlusOne {
    public int[] plusOne(int[] digits) {
        digits[digits.length - 1]++;
        for(int i = digits.length - 1; i > 0; i--){
            if(digits[i] >= 10){
                int rem = digits[i] % 10;
                int carry = digits[i] / 10;
                digits[i - 1] += carry;
                digits[i] = rem;
            }
        }
        if(digits[0] >= 10){
            int[] temp = new int[digits.length + 1];
            temp[0] = digits[0] / 10;
            temp[1] = digits[0] % 10;

            for(int i = 1; i < digits.length-1; i++){
                temp[i+1] = digits[i];
            }

            digits = temp;

        }
        return digits;
    }
}
