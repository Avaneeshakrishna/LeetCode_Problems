class Solution {
    public int[] twoSum(int[] nums, int target) {              // method definition
     
        int [] res =new int [2];                               // holds the result
        
        for (int i=0; i<nums.length; i++){                    // to compare elements
            for (int j=i+1; j<nums.length; j++){
                if(nums[i] + nums[j] == target){              // check the condition
                    res[0] = i;                               // update indices
                    res[1] = j;
                    return res;                               // return result
                }
            }
        }
      return res;
    }
}
