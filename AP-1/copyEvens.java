// Given an array of positive ints, return a new array of length "count" containing the first even numbers from the original array. The original array will contain at least "count" even numbers.

public int[] copyEvens(int[] nums, int count) {
  return Arrays.stream(nums)
               .filter(num -> num % 2 == 0)
               .limit(count)
               .toArray();
}


// java streams - very cool, very useful. very neat too. 
