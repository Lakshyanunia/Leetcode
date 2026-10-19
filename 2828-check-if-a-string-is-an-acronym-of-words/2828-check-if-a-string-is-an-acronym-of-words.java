class Solution {
    public boolean isAcronym(List<String> words, String s) {
        StringBuilder sb=new StringBuilder();
        for(String c:words){
            sb.append(c.charAt(0));
        }
        if(s.equals(sb.toString())){
            return true;
        }
        return false;
    }
}