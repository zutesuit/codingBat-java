// Given an array of ints of odd length, look at the first, last, and middle values in the array and return the largest. The array length will be a least 1.

public int maxTriple(int[] nums) {
  return Math.max(nums[0], Math.max(nums[nums.length/2], nums[nums.length-1]));
}

// the above isn't good practice or super readable though, best to do like this:

public int maxTriple(int[] nums) {
  int first = nums[0];
  int middle = nums[nums.length / 2];
  int last = nums[nums.length - 1];
  
  return Math.max(first, Math.max(middle, last));
}

