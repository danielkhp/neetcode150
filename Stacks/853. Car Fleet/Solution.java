class Solution {
  public int carFleet(int target, int[] position, int[] speed) {
      double[] timeToTarget = IntStream.range(0, position.length)
          .mapToObj(i -> new int[]{ position[i], speed[i]})
          .sorted(Comparator.comparingInt(a -> a[0]))
          .mapToDouble(pair -> (double)(target - pair[0]) / pair[1])
          .toArray();

      Deque<Double> stack = new ArrayDeque<>();
      for (int i = timeToTarget.length - 1; i >= 0; i--) {
          if (stack.size() == 0 || stack.peek() < timeToTarget[i]) {
              stack.push(timeToTarget[i]);
          }
      }

      return stack.size();
  }
}
