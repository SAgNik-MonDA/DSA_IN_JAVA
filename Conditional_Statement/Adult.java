

public class Adult{
    public static void main(String[] args) {
        int age=22;
        if(age>=18){
            System.out.println("adult : drive,vote");
        }
        if(age>13 && age<18){
            System.out.println("teenager");
        }
        else{
            System.out.println("Not adult");
        }
    }
}