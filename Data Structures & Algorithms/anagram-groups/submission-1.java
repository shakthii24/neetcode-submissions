class Solution {
    public String generateFrequencyString(String str){
        int[] arr = new int[26];
        for(char ch : str.toCharArray()){
            arr[ch - 'a']++;
        }
        StringBuilder sb = new StringBuilder();
        char c = 'a';
        for(int i : arr){
            sb.append(c);
            sb.append(i);
            c++;
        }
        return sb.toString();
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();

        for(String str : strs){

            String frequencyString = generateFrequencyString(str);

            if(!map.containsKey(frequencyString)){
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(frequencyString, list);
            }else{
                map.get(frequencyString).add(str);
            }
        }
        return new ArrayList<>(map.values());
    }
}
