class Solution {
    //Brute force - not optimal - Time complexity is O(N log N + N) and No extra space required.
    public int longestConsecutive(int[] arr) {
        if(arr.length == 0) return 0;
        int max = 1;
        int current = 1;
        Arrays.sort(arr);
        for(int i=1;i<arr.length;i++){
            if(arr[i] == arr[i-1]){
                continue;
            }
            else if((arr[i] - arr[i-1]) == 1){
                current++;
            }
            else{
                current = 1;
            }
            max = Math.max(max,current);
        }
        return max;
    }
}
