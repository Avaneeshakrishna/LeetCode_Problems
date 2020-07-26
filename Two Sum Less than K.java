class Solution {                                                                  // java class
    public int twoSumLessThanK(int[] A, int K) {                                  // method definition
        
        if (A.length < 1 || A.length > 100 || K < 1 || K > 2000) return -1;       // checking constraints
        int S = -1;                                                               // S to hold the max sum less than k
        Arrays.sort(A);                                                           // sorting A - O(nlogn) time complexity
        int left = 0, right = A.length - 1;                                       // initialize two pointers
        
        while (left < right){                                                     // Iterate the array when left overlaps (equals) right
            if (A[left] + A[right] < K){                                          // checking sum is less than K
                S = Math.max(S, A[left] + A[right]);                              // if so, upadte the S
                ++left;                                                           // increment the left pointer
            }
            else{                                                                 // if sum is greater than K
                --right;                                                          // decrement right pointer
            }
        }
        return S;                                                                 // return the sum S
    }
}
