class Solution {
    public String sortSentence(String s) {
        StringBuilder sb=new StringBuilder();
        String[] str=s.split(" ");
        String[] arr=new String[s.length()];
        int x=0;
        for(String elm:str){
            arr[(int)(elm.charAt(elm.length()-1)-'0')-1]=elm.substring(0,elm.length()-1);
        }
        for(String elm:arr){
            sb.append(elm);
            x++;
            if(x==str.length) break;
            sb.append(" ");
        }
        return sb.toString();
    }
}