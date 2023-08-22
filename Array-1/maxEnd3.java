// Given an array of ints length 3, figure out which is larger, the first or last element in the array, and set all the other elements to be that value. Return the changed array.

public int[] maxEnd3(int[] nums) {
  int bigger = Math.max(nums[0], nums[nums.length-1]);
  for (int i = 0; i < nums.length; i++)
  {
    nums[i] = bigger;
  }
  return nums;
}

