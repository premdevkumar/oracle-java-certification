public static void main(String[] args):
public - accessible to JVM
static - JVM calls without object
void - returns nothing
String[] args - command line arguments

*jvm: Java Virtual Machine is a virtual machine that runs Java bytecode and makes Java platform independent.

// Single line comment

/*
   Multi-line comment
   Used for documentation
*/

Primitive data types
        | Type    | Size    | Default Value | Example              |
| ------- | ------- | ------------- | -------------------- |
| byte    | 1 byte  | 0             | byte b = 10;         |
| short   | 2 bytes | 0             | short s = 100;       |
| int     | 4 bytes | 0             | int x = 50;          |
| long    | 8 bytes | 0L            | long l = 1000L;      |
| float   | 4 bytes | 0.0f          | float f = 10.5f;     |
| double  | 8 bytes | 0.0           | double d = 20.99;    |
| char    | 2 bytes | '\u0000'      | char c = 'A';        |
| boolean | 1 bit*  | false         | boolean flag = true; |


Non primitive data types:

| Type            | Example                      |
| --------------- | ---------------------------- |
| String          | String name = "Prem";        |
| Arrays          | int[] arr = {1,2,3};         |
| Classes         | MyClass obj = new MyClass(); |
| Interfaces      | Runnable r;                  |
| Enums           | enum Day {MON, TUE}          |
| Wrapper Classes | Integer, Double, etc.        |
| Collections     | ArrayList, HashMap           |

examples:
*class object: Student s = new Student();

*interface reference:An interface is a blueprint of a class that contains abstract methods which a class must implement.
 Runnable r = new Thread();

*enum:Enum is a special data type in Java used to define a fixed set of constant values.It is used when variables should have only predefined values.
enum Day { MONDAY, TUESDAY, WEDNESDAY }
Day today = Day.MONDAY;

*Wrapper class :
A wrapper class is a class that wraps  a primitive value inside an object.
Wrapper classes belong to java.lang package.
They allow primitive values to be treated as objects.
They support autoboxing and unboxing.
Wrapper objects can store null, primitives cannot.

Autoboxing = Automatic conversion of primitive → Wrapper object
int x = 10;
Integer num = x;   // Autoboxing
//Integer num = Integer.valueOf(x);

Unboxing = Automatic conversion of Wrapper object → Primitive
   Integer num = 20;
int x = num;   // Unboxing
//int x = num.intValue();
/* ArrayList<Integer> list = new ArrayList<>();
list.add(10);   // Autoboxing happens here
*/

***

// Difference Between int and Integer
Feature	         int	     Integer
Type	        Primitive	    Wrapper Class
Stores	    Actual value	Object (reference)
Can be null?	❌ No	       ✅ Yes
Memory	       Less	       More
Methods available?	❌ No	  ✅ Yes (parseInt, compareTo, etc.)
Used in Collections?	❌ No	  ✅ Yes


int (Primitive)
int x = 10;
Stores value directly.
Faster.
Cannot store null.
Cannot call methods.

Example:
/////
int a = 5;
// a.compareTo(10); ❌ Not possible


Integer (Wrapper Class)
Integer num = 10;

Stores object reference.

Can store null.

Has useful methods.

Example:
Case 1: Null Problem
Integer num = null;
int x = num;   // Runtime error (NullPointerException)

Because Java tries to unbox null.

⚠️ Case 2: == Comparison
Integer a = 100;
Integer b = 100;
System.out.println(a == b);   // true
Integer num = 10;
System.out.println(num.compareTo(20));







