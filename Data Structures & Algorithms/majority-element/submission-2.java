class Solution {
    public int majorityElement(int[] nums) {
        //Moore's voting algorithm - checking if any single element occures more than other all elements.

        int element = 0;
        int count = 0;
        for(int i : nums){
            if(count == 0){
                element = i;
            }
            count += (i == element) ? 1 : -1;
        }
        return element;
    }
}