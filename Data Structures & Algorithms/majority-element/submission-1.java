class Solution {
    public int majorityElement(int[] nums) {
        //Moore's voting algorithm - checking if any single element occures more than other all elements.

        int element = 0;
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(count == 0){
                element = nums[i];
                count = 1;
            }else if(nums[i] == element){
                count++;
            }else{
                count--;
            }
        }
        int res = 0;
        for(int j : nums) if(j == element) res++;
        return (res > nums.length / 2) ? element : -1;
    }
}