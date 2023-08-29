// Given an array of ints, return true if the array contains a 2 next to a 2 somewhere.

public boolean has22(int[] nums) {
  for (int i = 0; i < nums.length -1; i++)
    if (nums[i] == 2 && nums[i+1] == 2)
      return true;
      
  return false;
}

// another method:

public boolean has22(int[] nums) {
  int prevNum = -1;  // Initialize to a value that is not 2
  for (int num : nums) {
    if (prevNum == 2 && num == 2) {
      return true;
    }
    prevNum = num;
  }
  
  return false;
}

