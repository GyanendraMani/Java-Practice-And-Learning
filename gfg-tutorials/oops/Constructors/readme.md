
### What are Constructors in java ?

 1. Constructor is a block of codes similar to the method.
 2. It is called when an instance of the class is created.
 3. At the time of calling the constructor, memory for the object is allocated in the memory.
 4. It is special type of method that is used to initialize the object.
 5. Every time an object is created using the new() keyword, at least one constructor is called.

 Note: It is not necessary to write a constructor for a class. It is because the java compiler creates a default constructor (constructor with no arguments) if your class doesn’t have any.


### How Java Constructors are Different From Java Methods?

1. Constructor must have the same name as the class within which it is defined it is not necessary for the method in java
2. Constructors are called only once at the time of Object creation while methods can called any number of time
3. Constructors do not return any type while methods have return type or void if does not return any value