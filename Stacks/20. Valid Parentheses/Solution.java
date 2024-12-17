import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

class Solution {
  public boolean isValid(String s) {
      Deque<Character> stack = new ArrayDeque<>();
      Map<Character, Character> closeToOpen = new HashMap<>();
      closeToOpen.put(')', '(');
      closeToOpen.put(']', '[');
      closeToOpen.put('}', '{');
      for (char c : s.toCharArray()) {
          if (closeToOpen.containsValue(c)) {
              stack.push(c);
          } else {
              if (stack.size() == 0) return false;
              if (stack.pop() != closeToOpen.get(c)) return false;
          }
      }

      return stack.size() == 0;
  }
}
