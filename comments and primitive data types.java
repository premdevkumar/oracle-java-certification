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




