import java.util.Scanner;


public class LeafyearNot {
    public static void main(String[] args) {
        System.out.println("enter the year =20");
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        if(year%2!=0){
            System.out.println("it is an leap year ");

        }
        else{
            System.out.println("it is not a leap year ");
        }sc.close();
}}
