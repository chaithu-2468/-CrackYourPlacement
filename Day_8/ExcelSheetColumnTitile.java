class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        int n = columnNumber;
        while(n>0){
            n--;
            int temp = n%26;

            sb.append((char)('A' + temp));

            n /= 26;
        }

        return sb.reverse().toString();
    }
}