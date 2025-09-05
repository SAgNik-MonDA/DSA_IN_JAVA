 public class Character{
    public static void main(String[] args) {
        char ch='A';
        // print lines
        for(int line=1;line<=5;line++){
            // print characters
            for(int star=1;star<=line;star++){
                
                System.out.print(ch +"\t");
                // character update
                ch++;
            }
        System.out.println();
        }
    }
 }