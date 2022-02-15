
package problem2package2;


public class Student extends Person {
 
    private Semester as = new Semester();
    private static final int LastSerial=2000;
    private int Batch;
    private static int count;
    //private final Department dept;

    
    public Student(String name,Department dept,Semester sem, int batch) {
        //super(ID, name, department);
        this.name =name;
       this.dept=dept;
       this.as=sem;
        this.Batch = batch;
        count++;
        this.ID=generateID();
    }
    
   
    
    public String generateID(){
        
        int Serial  =LastSerial+count;
        return as.getCode()+"-"+dept.getcode()+"-"+Serial;
        
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("ID: " +ID+",Name: "+name+",Semester: "+as.getName()+",batch: "+Batch);
    }//override(Polymorphism)
    
}
