class Solution {
    public String convertDateToBinary(String date) {
        String[] s= date.split("-");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length; i++) {
            int num=Integer.parseInt(s[i]);
            sb.append(Integer.toBinaryString(num));
            if (i != s.length - 1) sb.append("-");
        }
        return sb.toString();
    }
}