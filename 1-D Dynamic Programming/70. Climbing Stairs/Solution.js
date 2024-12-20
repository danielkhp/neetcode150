let climbStairs = (n) => {
  if (n < 3) return n;

  let one = 1;
  let two = 2;

  for (i = n - 3; i > 0; i--) {
      let temp = one + two;
      one = two;
      two = temp;
  }

  return one + two;
};
