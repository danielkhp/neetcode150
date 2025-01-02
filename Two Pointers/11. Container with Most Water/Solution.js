const maxArea = (height) => {
  let area = 0;
  let l = 0;
  let r = height.length - 1;
  while (l < r) {
      const w = r - l;
      const h = Math.min(height[l], height[r]);
      area = Math.max(area, w * h);
      if (height[l] < height[r]) {
          l++;
      } else {
          r--;
      }
  }

  return area;
};
