import java.util.Scanner;
public class demo1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int number=num;
        int newnum=0;
        int ak;
        do{

            ak=number%10;
            number/=10;
            newnum=newnum*10+ak;

        }while(number!=0);
        System.out.println(newnum);
        if(newnum==num){
            System.out.println("是回文");
        }

    }
}