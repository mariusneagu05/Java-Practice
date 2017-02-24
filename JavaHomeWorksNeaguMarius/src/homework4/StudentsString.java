/*
 * Exercices 2 and 3 
 */
package homework4;

public class StudentsString {
    String[] students = new String[10];
    String studentName = "Peter Parker";
    //students[0] = studentName;
    //studentName = null;
}
/*
 * There is one reference to the array students and one reference to the string Peter Parker.
 * An object is eligible for garbage collection when there is no reference to it. Once an object is no longer 
 * referenced and therefore is not reachable by the application code, the garbage collector removes it and 
 * reclaims the unused memory. In our case the array students has a reference to the object 
 * studentName and the object studentName has one reference students[0], which means none of the 
 * objects above are eligible for garbage collection.
*/

/*
* Ex.3 In Java, objects are not destroyed. When an object has a reference it`s tracked by JVM and it is 
* considered alive. Once there is no reference to that object it becomes eligible for garbage collection and 
* like in the exercise above, the garbage collector removes it and reclaims the unused memory for future objects. 
*/
