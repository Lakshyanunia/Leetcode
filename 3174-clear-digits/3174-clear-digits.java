class Solution {
    public String clearDigits(String s) {
        StringBuilder sb=new StringBuilder();
        if(s.charAt(0)>='a' && s.charAt(0)<='z') sb.append(s.charAt(0));
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                sb.append(s.charAt(i));
            }
            else{
                if(sb.length()>0) sb.deleteCharAt(sb.length() - 1);

            }
        }
        return sb.toString();
    }
}