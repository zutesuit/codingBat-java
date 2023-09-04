// Given arrays nums1 and nums2 of the same length, for every element in nums1, consider the corresponding element in nums2 (at the same index). Return the count of the number of times that the two elements differ by 2 or less, but are not equal.

public int matchUp(int[] nums1, int[] nums2) {
  int count  = 0;
  
  
  for (int i = 0; i < nums1.length; i++)
  {
    int max = Math.max(nums1[i], nums2[i]);
    int min = Math.min(nums1[i], nums2[i]);
    
    if (max - min <= 2 && max != min)
      count++;

    // or use math.abs to get absolute value and just type:
    
    if (Math.abs(nums1[i] - nums2[i]) <=2 && nums1[i] != nums2[i])  
      count++;  
      
  
  }
  return count;
    
}

