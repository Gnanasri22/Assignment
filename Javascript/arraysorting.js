var numbers = [567, 878,453,765,856];

// Using a custom comparison function
numbers.sort(function(a, b) {
  return b - a;
});

console.log(numbers); 
