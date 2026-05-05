public class Constructors{
    public static void main(String[] args) {
        Student s1 = new Student("sagnik");
        System.out.println(s1.name);
        
    }
}

class Student{
    String name;
    int roll;



// Non-Parameterized Constructors

    // Student (){
    //     System.err.println("Constructors is called.......");
    // }

// Parameterized Constructors
    Student(String name) {
        this.name = name;
    }

    
}