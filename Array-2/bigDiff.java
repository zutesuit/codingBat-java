// Given an array length 1 or more of ints, return the difference between the largest and smallest values in the array. Note: the built-in Math.min(v1, v2) and Math.max(v1, v2) methods return the smaller or larger of two values.

import java.util.*;

public int bigDiff(int[] nums) {
    Arrays.sort(nums);
    return nums[nums.length - 1] - nums[0];
}


// obvious way to do this is using Array.sort from java.utils, but this doesnt have that imported so:


public int bigDiff(int[] nums) {
  int min = nums[0];
  int max = nums[0];
  
  for (int i = 0; i < nums.length; i++)
  {
    min = Math.min(min, nums[i]);
    max = Math.max(max, nums[i]);
  }  
  return max - min;
}
