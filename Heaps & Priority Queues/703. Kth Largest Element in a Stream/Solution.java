class KthLargest {
  int cutoff;
  Queue<Integer> queue;

  public KthLargest(int k, int[] nums) {
      this.cutoff = k;
      this.queue = new PriorityQueue<>();

      for (int num : nums) {
          add(num);
      }
  }

  public int add(int val) {
      if (queue.size() < cutoff) {
          queue.offer(val);
      } else if (val > queue.peek()) {
          queue.poll();
          queue.offer(val);
      }

      return queue.peek();
  }
}
