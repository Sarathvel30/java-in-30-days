import java.util.Scanner;
public class c4{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the salary:");
        int salary=sc.nextInt();
        System.out.println("enter the age:");
        int age=sc.nextInt();
        if(salary>=20000 || age<=25){
            System.out.println("eligible");
            System.out.println("enter the loan amount:");
            int loan=sc.nextInt();
            if(loan<=50000){
                System.out.println("eligible for loan"); 
            }else{
                System.out.println("max loan amount is 50000");
            }
        }else{
            System.out.println("not eligible");
        }

    }
}