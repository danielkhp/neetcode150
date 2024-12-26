class Solution {
  public List<List<String>> groupAnagrams(String[] strs) {
      Map<String, List<String>> anagramToGroup = new HashMap<>();
      for (String s : strs) {
          int[] occurrences = new int[26];
          for (int i = 0; i < s.length(); i++) {
              occurrences[s.charAt(i) - 'a']++;
          }
          String key = Arrays.toString(occurrences);

          anagramToGroup.putIfAbsent(key, new ArrayList<>());
          anagramToGroup.get(key).add(s);
      }

      return new ArrayList<>(anagramToGroup.values());
  }
}
