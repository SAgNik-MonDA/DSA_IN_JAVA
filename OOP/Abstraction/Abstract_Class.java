public class Abstract_Class{
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();
        h.chnageColor();

        Chicken c = new Chicken();
        c.eat();
        c.walk();
    }
}


abstract class Animal{
    String color;
    Animal(){
        color = "brown";

    }
    void eat(){
        System.out.println("animal eats");
    }
    abstract void walk();
}

class Horse extends Animal{
    void chnageColor(){
        color = "dark brown";
        System.out.println(color);
    }
    void walk(){
        System.out.println("walk on 4 legs");
    }
}

class Chicken extends Animal{
    void chnageColor(){
        color = "dark brown";
    }
    void walk(){
         System.out.println("walk on 2 legs");
    }
}