
package oop1_myworld;


public class Student extends Person{
  
    protected String fNumber;

    public String getfNumber() {
        return fNumber;
    }

    public void setfNumber(String fNumber) {
        this.fNumber = fNumber;
    }

    public Student(String fNumber, String name, int age) {
        super(name, age);
        this.fNumber = fNumber;
    }

    public Student() {
        //this("Test",45);
        fNumber = "3213123112312";
    }
    
       public Student(String name,int age) {
    super(name,age);  
   
    }
        
        @Override
            public void introduceYourself(){
                super.introduceYourself();
                System.out.println("I am a student. My name is: " + name + " and  My fNumber is: " + fNumber + " I am " + age + " years old. ");
            }

            @Override
            public String toString(){
                return "Student{"+ "fNumber=" + fNumber + '}';
            }
}

    

