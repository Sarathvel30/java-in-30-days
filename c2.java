import java.util.Scanner;
class c2{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int eng=sc.nextInt();
        int tam=sc.nextInt();
        int mat=sc.nextInt();
        int sci=sc.nextInt();
        int soc=sc.nextInt();
        int tot=eng+tam+mat+sci+soc;
        double avg=tot/5;
        if(avg<35){
            System.out.println("additional class is required:"+avg);

        }else{
            System.err.println("you are good to go:"+ avg);
        }

    }
}