// Given three ints, a b c, one of them is small, one is medium and one is large. Return true if the three values are evenly spaced, so the difference between small and medium is the same as the difference between medium and large.

public boolean evenlySpaced(int a, int b, int c) {
 int[] sortedNums = {a,b,c};
 Arrays.sort(sortedNums);
 
 int diff1 = sortedNums[1] - sortedNums[0];
 int diff2 = sortedNums[2] - sortedNums[1];
 
 return diff1 == diff2;
}

