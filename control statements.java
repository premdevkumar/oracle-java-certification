CONDITIONAL STATEMENTS:
* if condition:
if(condition) {
    // code executes if condition is true
}
* if else
if(condition) {
    // true block
} else {
    // false block
}
*else if ladder
if(condition1) {
}
else if(condition2) {
}
else if(condition3) {
}
else {
}
*switch statement
switch(variable) {
    case value1:
        // code
        break;
    case value2:
        // code
        break;
    default:
        // code
}
example:
int day = 2;

switch(day) {
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    default:
        System.out.println("Invalid");
}
/* break stops execution
Without break → fall-through
default is optional */

LOOPS:
types of loops :
1. for loop
2. while loop
3. do-while loop
4. for-each loop (Enhanced for loop)
5. Infinite loop
6. Nested loops

1.for loop:
for(initialization; condition; update) {
    // code
}
// it is used when number of iterations are known
types of for loops 
*simple for loop:
for(int i = 0; i < 5; i++) {
    System.out.println(i);
}
*multiple variables in for loop
  for(int i = 0, j = 10; i < j; i++, j--) {
    System.out.println(i + " " + j);
}
*infinite for loop
  for(;;) {
    System.out.println("Infinite Loop");
}
*nested for loop 
  for(int i = 1; i <= 3; i++) {
    for(int j = 1; j <= 2; j++) {
        System.out.println(i + " " + j);
    }
}
* for each loop
int[] arr = {10, 20, 30};

for(int num : arr) {
    System.out.println(num);
}
