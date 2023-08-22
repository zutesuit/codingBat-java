// Given an array of ints, return the sum of the first 2 elements in the array. If the array length is less than 2, just sum up the elements that exist, returning 0 if the array is length 0.

public int sum2(int[] nums) {
  if (nums.length >= 2) {
    return nums[0] + nums[1];
  } else if (nums.length == 1) {
    return nums[0];
  } else {
    return 0;
  }
  
  //return nums.length >= 2 ? nums[0] + nums[1] : nums.length == 1 ? nums[0] : 0;


}

