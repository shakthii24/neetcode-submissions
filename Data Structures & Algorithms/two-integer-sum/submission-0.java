class Solution {
    public int[] twoSum(int[] num, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<num.length;i++){
            int n = num[i];
            if(map.containsKey(target - num[i])){
                return new int[]{map.get(target - num[i]), i};
            }else{
                map.put(num[i] , i);
            }
        }
        return new int[]{-1,-1};
    }
}
