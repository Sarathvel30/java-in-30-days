import java.util.Scanner;
class c3{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        String color=sc.nextLine();
        if(color.equals("red")){
            System.out.println("stop");
        }else if(color.equals("yellow")){
            System.out.println("get ready");
        }else if(color.equals("green")){
            System.out.println("go");
        }
    
    }
}