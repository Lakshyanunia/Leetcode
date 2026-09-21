class Solution {
    public String firstPalindrome(String[] words) {
        // for(String word:words){
        //     StringBuilder sb=new StringBuilder();
        //     for(int i=word.length()-1;i>=0;i--){
        //         sb.append(word.charAt(i));
        //     }
        //     if(sb.toString().equals(word)) return sb.toString();
        // }
        for(String word:words){
            int left = 0;
            int right = word.length()-1;
            boolean x=true;
            while (left<right){
                if (word.charAt(left) != word.charAt(right)){
                    x=false;
                    break;
                }
                left++;
                right--;
            }
            if(x) return word;
        }
        return "";
    }
}