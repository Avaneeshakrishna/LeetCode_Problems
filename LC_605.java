/*
 605. Can Place Flowers

You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots.
Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n, return true if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule and false otherwise.


Example 1:

Input: flowerbed = [1,0,0,0,1], n = 1
Output: true

Example 2:

Input: flowerbed = [1,0,0,0,1], n = 2
Output: false
 

Constraints:

1 <= flowerbed.length <= 2 * 104
flowerbed[i] is 0 or 1.
There are no two adjacent flowers in flowerbed.
0 <= n <= flowerbed.length
 */

public class LC_605 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        for(int i = 0; i < flowerbed.length; i++){
            if(flowerbed[i] == 0){
                int prev = (i == 0 || flowerbed[i - 1] == 0)?0:1;
                int next = (i == flowerbed.length - 1 || flowerbed[i + 1] == 0) ? 0:1;

                if(prev == 0 && next == 0){
                    flowerbed[i] = 1;
                    count++;
                }
            }
            if(count >= n){
                return true;
            }
        }
        return false;
    
    }
    public static void main(String[] args) {
        LC_605 lc = new LC_605();
        int[] flowerbed = {1,0,0,0,1};
        boolean ans = lc.canPlaceFlowers(flowerbed, 1);
        System.out.println(ans);
        
    }
}