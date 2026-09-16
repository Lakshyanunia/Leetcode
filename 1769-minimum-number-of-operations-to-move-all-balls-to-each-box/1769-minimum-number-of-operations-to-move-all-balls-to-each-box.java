class Solution {
    public int[] minOperations(String boxes) {
        int[] arr=new int[boxes.length()];
        for(int i=0;i<boxes.length();i++){
            if(boxes.charAt(i)=='1'){
                int j=0;
                while(j<arr.length){
                    arr[j]+=Math.abs(j-i);
                    j++;
                }
            }
        }
        return arr;
    }
}