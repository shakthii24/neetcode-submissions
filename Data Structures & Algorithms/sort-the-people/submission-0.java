class Solution {
    public void swap(String[] strs, int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        String st = strs[i];
        strs[i] = strs[j];
        strs[j] = st;
    }
    public int partition(String[] strs, int[] arr, int low, int high){
        int pivot = arr[low];
        int left = low;
        int right = high;

        while(left < right){
            while(left <= right && arr[left] >= pivot) left++;
            while(right >= left && arr[right] < pivot) right--;
            if(left < right) swap(strs, arr, left, right);
        }
        swap(strs,  arr, low, right);
        return right;
    }
    public void quickSort(String[] strs, int[] arr, int low, int high){
        if(low >= high) return;

        int pivotIndex = partition(strs, arr, low, high);

        quickSort(strs, arr, low, pivotIndex-1);
        quickSort(strs, arr, pivotIndex+1, high);
    }
    public String[] sortPeople(String[] names, int[] heights) {
        quickSort(names, heights, 0 , heights.length-1);
        return names;
    }
}