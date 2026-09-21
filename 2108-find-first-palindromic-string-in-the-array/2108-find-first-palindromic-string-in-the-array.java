class Solution {
    public String firstPalindrome(String[] words) {
        for(String word:words){
            StringBuilder sb=new StringBuilder();
            for(int i=word.length()-1;i>=0;i--){
                sb.append(word.charAt(i));
            }
            if(sb.toString().equals(word)) return sb.toString();
        }
        String a="";
        return a;
    }
}