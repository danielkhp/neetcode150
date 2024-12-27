class Solution {

  public String encode(List<String> strs) {
      String encoded = strs.stream()
          .map(s -> s.length() + "\u001F" + s)
          .collect(Collectors.joining(""));

      return encoded;
  }

  public List<String> decode(String str) {
      int i = 0;
      List<String> res = new ArrayList<>();

      while (i < str.length()) {
          int sepIndex = str.indexOf("\u001F", i);
          int length = Integer.parseInt(str.substring(i, sepIndex));

          int start = sepIndex + 1;
          int end = start + length;
          res.add(str.substring(start, end));

          i = end;
      }

      return res;
  }
}
