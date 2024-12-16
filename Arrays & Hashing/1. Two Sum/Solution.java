import java.util.HashMap;
import java.util.Map;

class Solution {
  public int[] twoSum(int[] nums, int target) {
      Map<Integer, Integer> diffToIndex = new HashMap<>();

      for (int i = 0; i < nums.length; i++) {
          int diff = target - nums[i];
          if (diffToIndex.containsKey(diff)) {
              return new int[] { diffToIndex.get(diff), i };
          };

          diffToIndex.put(nums[i], i);
      }

      return new int[] {};
  }
}
