## Some important points about java arrays

*   In Java, all arrays are dynamically allocated.
*   Arrays are stored in contiguous memory [consecutive memory locations].
*   Since arrays are objects in Java, we can find their length using the object property length. 
*   This is different from C/C++, where we find length using sizeof.
*   A Java array variable can also be declared like other variables with [] after the data type.
*   The variables in the array are ordered, and each has an index beginning with 0.
*   Java array can also be used as a static field, a local variable, or a method parameter.
*   The size of an array must be specified by int or short value and not long.
*   The direct superclass of an array type is Object.
*   Every array type implements the interfaces Cloneable and java.io.Serializable. 
*   This storage of arrays helps us randomly access the elements of an array [Support Random Access].
*   The size of the array cannot be altered(once initialized).  However, an array reference can be made to point to another array.