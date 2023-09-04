// Return an array that contains the exact same numbers as the given array, but rearranged so that all the even numbers come before all the odd numbers. Other than that, the numbers can be in any order. You may modify and return the given array, or make a new array.

public int[] evenOdd(int[] nums) {
  int left = 0;
  int right = nums.length -1;
  
  while (left < right) 
  {
    while (left < right && nums[left] % 2 == 0) 
    {
      left++;
    }
  
  
    while (left < right && nums[right] % 2 == 1) 
    {
      right--;
    }
  
    if (left < right) 
    {
      int temp = nums[left];
      nums[left] = nums[right];
      nums[right] = temp;
    }
  }
  return nums;
}

