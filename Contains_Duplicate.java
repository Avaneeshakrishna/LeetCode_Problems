import java.util.HashSet;

class Solution {                                                 // java class
    public boolean containsDuplicate(int[] nums) {               // method definition
        HashSet <Integer> set = new HashSet <Integer> ();        // Create object of HashSet
        
        for (int x : nums){                                      // loop for the iteration
            if (set.contains(x))                                 // contains method checks if x is present is the set
                return true;                                     // return answer
            else
                set.add(x);                                      // adding element x to the set
        }
            
        return false;                                            // return ans
    }
}
