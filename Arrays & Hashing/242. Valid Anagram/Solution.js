let isAnagram = (s, t) => {
  if (s.length !== t.length) return false;

  let map = {};
  for (let i in s) {
    let char = s[i];
    map[char] = (map[char] || 0) + 1;
    char = t[i];
    map[char] = (map[char] || 0) - 1;
  }

  for (let key in map) {
    if (map[key] !== 0) return false;
  }

  return true;
};
