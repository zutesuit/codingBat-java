// Given a non-empty array of ints, return a new array containing the elements from the original array that come after the last 4 in the original array. The original array will contain at least one 4. Note that it is valid in java to create an array of length 0.

public int[] post4(int[] nums) {
   int lastFourIndex = nums.length -1;
  
  while (nums[lastFourIndex] != 4)
    lastFourIndex--;
    
  int length = nums.length -1 - lastFourIndex;
  
  int[] newArr = new int[length];
  
  for (int i = 0; i < length; i++)
    newArr[i] = nums[lastFourIndex + 1+ i];
    
  return newArr;
}

 
