class Solution {
    public boolean isAcronym(List<String> words, String s) {
        if(words.size()!=s.length()) return false;
        // StringBuilder sb=new StringBuilder();
        // for(String c:words){
        //     sb.append(c.charAt(0));
        // }
        // if(s.equals(sb.toString())){
        //     return true;
        // }
        // return false;

        int index=0;
        for(String i: words){
            if(s.charAt(index++)!=i.charAt(0)){
                return false;
            }
        }
        return true;

    }
}