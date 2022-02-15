/*
Example 2.1 - Problem for Inheritance (IS A relation)

You have to manage the information of your Teachers & Students of your class. 
For Teacher’s info take ID, name, department, designation etc. For Student’s info take ID, name, department & batch. 
Keep the main class in a separate package.
Take 2 teachers info & 2 student’s info. and print their info.

(Hint: [for BOTTOM-UP Approach]
1. Identify the classes (first think about the type of objects from the problem)
2. Identify the attributes & methods needed for the classes
3. If there exists any common attribute or method, TAKE them to another class.
Make the later class parent and the previous classes child.
* Name the parent class, so that we can say “Child class” IS A “Parent Class”
*/

package problem2package1;


import  problem2package2.*;

public class Main {
     public static void main(String[] args) {
         
         
      Department dept =new Department("SWE",35);
    Semester sem =new Semester("Spring 2022",221);
    
    Student St1= new Student("Tayeba" ,dept,sem,31);
    Student St2= new Student("Nishi",dept,sem,31);
    
    System.out.println("Students Information:");
        St1.printInfo();
        St2.printInfo();
 
         
        /* System.out.println("First Teacher :");
        Teacher teach1 = new Teacher("710001444","Mr. Md. Mushfiqur Rahman","SWE","Lecturer");
        teach1.printTeacher();

        System.out.println("\nSecond Teacher :");
        Teacher teach2 = new Teacher("710001281","Md. Fahad Bin Zamal","SWE","Assistant Professor & Associate Head (In-Charge)");
        teach2.printTeacher();
        
        System.out.println("\nFirst Student :");
        Student stu1 = new Student("201-35-2991","Priyanka","SWE","31");
        stu1.printInfo();
        
        System.out.println("\nSecond Student :");
        Student stu2 = new Student("201-35-2980","Ovi","SWE","31");
        stu2.printInfo();
        */
    }
}
