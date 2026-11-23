class Solution {
    public boolean areNumbersAscending(String s) {
        String[] arr=s.split(" ");
        List<Integer> n=new ArrayList<>();
        for(String elm:arr){
            if(elm.charAt(0)-'0'>=0 && elm.charAt(0)-'0'<=9) n.add(Integer.parseInt(elm)); 
        }
        for(int i=0;i<n.size()-1;i++){
            if(n.get(i)>=n.get(i+1)) return false;
        }
        return true;
    }
}