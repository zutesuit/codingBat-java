// Given an array of ints, return true if the array contains no 1's and no 3's.

public boolean lucky13(int[] nums) {
  for (int num : nums)
    if (num == 1 || num == 3)
      return false;
      
  return true;
}

