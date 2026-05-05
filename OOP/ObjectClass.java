public class ObjectClass{
    public static void main(String[] args) {
        Pen p1=new Pen();
        p1.setColor("Blue");
        System.out.println(p1.color);

        BankAccount myAcc = new BankAccount();
        myAcc.username = "Sagnik Mondal";
        myAcc.setPassword("Sagnik@123");
        
         
    }
}

class Pen{
    String color;
    int tip;
    
    void setColor(String newColor){
        color = newColor;
    }




    void setTip(int newTip){
        tip = newTip;
    }
}


// Access Modifiers

class BankAccount{
    public String username;
    private  String password;
    public void setPassword(String pwd){
        password = pwd;
    }

}


