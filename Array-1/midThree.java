// Given an array of ints of odd length, return a new array length 3 containing the elements from the middle of the array. The array length will be at least 3.

public int[] midThree(int[] nums) {
  int middle = nums.length / 2;
  return new int[] {nums[middle -1], nums[middle], nums[middle+1]};
}

