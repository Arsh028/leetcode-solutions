class Solution 
{
    public int[] shuffle(int[] nums, int n) 
    {
        int[] newArr = new int[nums.length];
        int firstPointer = 0;
        int secondPointer = n;
        int index = 0;
        while(firstPointer < n){
            newArr[index++] = nums[firstPointer++];
            newArr[index++] = nums[secondPointer++];
        }  
        return newArr;
    }
}