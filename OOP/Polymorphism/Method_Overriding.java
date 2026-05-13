public class Method_Overriding{
    public static void main(String[] args) {
        // Deer D = new Deer();
        Animal A = new Animal();
        A.eat();
        // D.eat();
    }
}

class Animal{
    void eat(){
        System.out.println("eats anything");
    }
}
class Deer extends Animal{
    void eat(){
        System.out.println("eats grass");
    }
}