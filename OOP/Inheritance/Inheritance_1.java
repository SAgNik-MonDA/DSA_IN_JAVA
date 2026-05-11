public class Inheritance_1{
    public static void main(String[] args) {
        // Fish f1 = new Fish();
        // f1.eat();
        // Dog dobby = new Dog();
        // dobby.eat();
        // dobby.legs = 4;
        // System.out.println(dobby.legs);

        Mammals m1 = new Mammals();
        m1.breathe();
        m1.walk();

    }
}


// Base Class

class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
}



class Mammals extends Animal{
    int legs;
    void walk(){
        System.out.println("Walks");
    }
}

class Fish extends Animal{
    void swim(){
        System.out.println("swim");
    }
}


class bird extends Animal{
    void fly(){
        System.out.println("fly");
    }
}

// class Dog extends Mammals{
//     String breed;
// }

// Derived Class

// class Fish extends Animal{
//     int fins;
//     void swim(){
//         System.out.println("Swims in water");
//     }
// }