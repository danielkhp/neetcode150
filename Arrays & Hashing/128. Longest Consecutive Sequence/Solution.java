class Solution {
  public int longestConsecutive(int[] nums) {
      Set<Integer> distinctNums = new HashSet<>();
      for (int n : nums) {
          distinctNums.add(n);
      }
      int maxLength = 0;
      for (int n : distinctNums) {
          if (!distinctNums.contains(n - 1)) {
              int end = n;
              while (distinctNums.contains(end + 1)) {
                  end++;
              }
              maxLength = Math.max(maxLength, end - n + 1);
          }
      }

      return maxLength;
  }
}
