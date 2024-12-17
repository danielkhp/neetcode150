let reverseList = (head) => {
  let prev = null;
  let curr = head;
  let next;

  while (curr !== null) {
      next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
  }

  return prev;
};
