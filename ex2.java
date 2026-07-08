import java.util.Scanner;
class ex2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int income=sc.nextInt();
        if(income>7000){
            System.out.println("scholarShip is available");
        }else{
            System.out.println("not available");
        }
        
    }
}