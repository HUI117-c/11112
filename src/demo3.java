import java.util.Scanner;
public class demo3{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int a;
        if(num%7==0){
            System.out.println("过");
        } else{
            while(num>0){
                a=num%10;
                num/=10;
                if(a==7){
                    System.out.println("过");
                    break;
                }
            }
        }

    }
}
