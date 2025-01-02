const threeSum = (nums) => {
  nums.sort((a, b) => a - b);
  const res = [];
  for (let i = 0; i < nums.length - 2; i++) {
      if (nums[i] > 0) {
          break;
      }
      if (i > 0 && nums[i] === nums[i - 1]) {
          continue;
      }
      let l = i + 1;
      let r = nums.length - 1;
      while (l < r) {
          const sum = nums[l] + nums[r] + nums[i];
          if (sum === 0) {
              res.push([nums[l], nums[r], nums[i]]);
              while (nums[l + 1] === nums[l]) {
                  l++;
              }
              while (nums[r - 1] === nums[r]) {
                  r--;
              }
              l++;
              r--;
          } else if (sum < 0) {
              while (nums[l + 1] === nums[l]) {
                  l++;
              }
              l++;
          } else if (sum > 0) {
              while (nums[r - 1] === nums[r]) {
                  r--;
              }
              r--;
          }
      }
  }

  return res;
};
