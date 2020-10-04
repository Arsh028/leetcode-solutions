//1431. Kids With the Greatest Number of Candies
import java.util.*;
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) 
    {
        List<Boolean> ans = new ArrayList<Boolean>();
        int max = max(candies);
        for(int i : candies)
        {    
            if(i + extraCandies >= max)
            {
                ans.add(true);
            }   
            else{
                ans.add(false);
            }
        }
        return ans;
    }
    
    public int max(int arr[])
    {
        int max = arr[0];
        for(int i : arr)
        {
            max = Math.max(max,i);   
        }
        return max;
    }
}