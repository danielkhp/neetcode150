let isAlNum = (s) => {
  let charCode = s.charCodeAt(0);
  if (charCode < 48 || (charCode > 57 && charCode < 97) || charCode > 122) return false;

  return true;
}

let isPalindrome = (s) => {
s = s.toLowerCase();
let left = 0;
let right = s.length - 1;

while (left < right) {
  if (!isAlNum(s[left])) {
      left++;
      continue;
  }

  if (!isAlNum(s[right])) {
      right--;
      continue;
  }

  if (s[left] !== s[right]) return false;
  left++;
  right--;
}

return true;
}
