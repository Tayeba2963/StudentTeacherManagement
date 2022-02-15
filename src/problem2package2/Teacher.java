
package problem2package2;


public class Teacher extends Person {

    private String designation=" assistant";

    public Teacher(String name, Department dept) {
        super(name, dept);
    }

    

   /* public Teacher(String ID, String name, String department, String designation) {
        super(ID, name, department);
        //designation = designation;
    }
*/
    public void printTeacher() {
        printInfo();
        System.out.println("Designation : " + this.designation);
    }
    
}