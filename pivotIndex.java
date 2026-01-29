class Solution {
    public int pivotIndex(int[] nums) {
        int total= 0;
        for(int i=0; i<nums.length;i++){
            total+=nums[i];
        }
        int n = nums.length;
        int leftmost =0;

        for(int j=0; j<n;j++){
            int rightmost = total-leftmost-nums[j];

            if(leftmost==rightmost){
                return j;
            }
            leftmost+=nums[j];
        }

        
        return -1;
        
    }
}
