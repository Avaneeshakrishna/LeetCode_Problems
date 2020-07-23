class Solution {
    public int[] twoSum(int[] numbers, int target) {                    // method definition, numbers are already sorted
        int low = 0, high = numbers.length-1;                           // left pointer and right pointers are initialized
        int sum = 0;                                                    
        int[] res = new int [2];                                        // res holds our final result
        while (low < high){                                             // iterate through the numbers
            sum = numbers[low] + numbers[high];                         // calculate sum of first ans last numbers
            if (sum == target){                                         // if sum is equal to target
                res[0] = low + 1;                                       // update result with the indices
                res [1] = high + 1;
                return res;                                             // return the result
            }
            else if (sum < target)                                      // else if sum is less than the target, then pre increment the low pointer
                ++low;
            else                                                        // else if sum is greater than the target, then pre decrement the high pointer
                --high;
        }
        return res;                                                     // return the result, if there are no pairs
    }
}
