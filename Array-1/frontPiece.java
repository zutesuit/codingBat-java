// Given an int array of any length, return a new array of its first 2 elements. If the array is smaller than length 2, use whatever elements are present.

public int[] frontPiece(int[] nums) {
  if (nums.length > 1) 
  {
    return new int[] {nums[0], nums[1]};
  } 
  else if (nums.length == 1) 
  {
    return new int[] {nums[0]};
  } 
  else 
  {
    return new int[0];
  }
}

// just because:

public int[] frontPiece(int[] nums) {
  return nums.length > 1 ? new int[] {nums[0], nums[1]} 
  : (nums.length == 1 ? new int[] {nums[0]} : new int[0]);
}

