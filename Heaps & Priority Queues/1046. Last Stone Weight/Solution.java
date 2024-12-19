class Solution {
  public int lastStoneWeight(int[] stones) {
      Queue<Integer> weights = new PriorityQueue<>((a, b) -> b - a);
      for (int stone : stones) {
          weights.offer(stone);
      }

      while (weights.size() > 1) {
          int x = weights.poll();
          int y = weights.poll();
          int diff = x - y;
          if (diff > 0) {
              weights.offer(diff);
          }
      }

      return weights.size() == 1 ? weights.peek() : 0;
  }
}
