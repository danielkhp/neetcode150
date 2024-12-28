class Solution {
  public boolean isValidSudoku(char[][] board) {
      Map<String, Map<Integer, Set<Character>>> seen = new HashMap<>();
      seen.put("row", new HashMap<>());
      seen.put("col", new HashMap<>());
      seen.put("box", new HashMap<>());

      for (int i = 0; i < 9; i++) {
          seen.get("row").put(i, new HashSet<>());
          seen.get("col").put(i, new HashSet<>());
          seen.get("box").put(i, new HashSet<>());
      }

      for (int row = 0; row < 9; row++) {
          for (int col = 0; col < 9; col++) {
              char c = board[row][col];
              if (c == '.') continue;

              int boxKey = (row / 3) * 3 + (col / 3);

              if (!seen.get("row").get(row).add(c) ||
                  !seen.get("col").get(col).add(c) ||
                  !seen.get("box").get(boxKey).add(c)) {
                  return false;
              }
          }
      }

      return true;
  }
}
