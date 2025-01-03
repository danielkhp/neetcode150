class Solution {
  public int[] dailyTemperatures(int[] temperatures) {
      Deque<Integer> stack = new ArrayDeque<>();
      int[] answer = new int[temperatures.length];
      for (int i = temperatures.length - 1; i >= 0; i--) {
          while (stack.size() != 0 && temperatures[stack.peek()] <= temperatures[i]) {
              stack.pop();
          }
          answer[i] = stack.size() == 0 ? 0 : stack.peek() - i;
          stack.push(i);
      }

      return answer;
  }
}
