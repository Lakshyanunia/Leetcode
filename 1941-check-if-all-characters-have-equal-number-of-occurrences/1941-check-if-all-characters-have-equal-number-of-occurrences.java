class Solution {
    public boolean areOccurrencesEqual(String s) {
        int[] arr=new int[26];
        int num=0;
        for(char c:s.toCharArray()){
            arr[c-97]++;
            num=Math.max(num,arr[c-97]);
        }
        for(int i=0;i<26;i++){
            if(arr[i]!=0 && arr[i]!=num) return false;
        }
        return true;

    }
}