import java.util.Scanner;
public class inputvar{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        String Name=obj.nextLine();
        int Age=obj.nextInt();
        obj.nextLine();
        String Address=obj.nextLine();
    
        System.out.println("my name is:"+Name+"my age is: "+Age+"my address is:"+Address);
        
        
    }
}

