
package problem2package2;

public class  Person {
    
    protected String ID;
    protected String name;
    protected Department dept = new Department();
    //private Semester as = new Semester();

public Person(){
    
}
    public Person( String name, Department dept)
    {
      
        this.name = name;
        this.dept = dept;
        
    }

    public void printInfo() {
        System.out.println(" Name "+name+",Department "+dept.getName());

    }
    
}//Abstraction
