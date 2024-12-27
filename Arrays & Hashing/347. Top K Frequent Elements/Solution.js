const topKFrequent = (nums, k) => {
  const count = {};
  for (const num of nums) {
      count[num] = (count[num] || 0) + 1;
  }

  const freq = Array.from({ length: nums.length + 1 }, () => []);
  for (const num in count) {
      freq[count[num]].push(parseInt(num));
  }

  const res = [];
  for (let i = freq.length -1; i > 0; i--) {
      for (const num of freq[i]) {
          res.push(num);
          if (res.length === k)
              return res;
      }
  }
};
