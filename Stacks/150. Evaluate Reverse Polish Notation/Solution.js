var evalRPN = function(tokens) {
  const operations = {
      '+': (a, b) => a + b,
      '-': (a, b) => a - b,
      '*': (a, b) => a * b,
      '/': (a, b) => Math.trunc(a / b),
  }
  const stack = [];
  for (const token of tokens) {
      if (operations.hasOwnProperty(token)) {
          const op1 = stack.pop();
          const op2 = stack.pop();
          const oper = operations[token];
          stack.push(oper(op2, op1));
      } else {
          stack.push(parseInt(token));
      }
  }

  return stack[0];
};
