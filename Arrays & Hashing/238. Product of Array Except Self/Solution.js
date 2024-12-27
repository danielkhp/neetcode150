const productExceptSelf = (nums) => {
  let answer = [1];
  for (let i = 1; i < nums.length; i++) {
      answer[i] = answer[i - 1] * nums[i - 1];
  }
  
  let rProd = 1;
  for (let i = nums.length - 1; i >= 0; i--) {
      answer[i] *= rProd;
      rProd *= nums[i];
  }

  return answer;
};
