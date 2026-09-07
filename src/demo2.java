import java.util.Scanner;
public class demo2{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int anum=sc.nextInt();
        int bnum=sc.nextInt();
        int count=0;
        while(anum>=bnum){
            anum-=bnum;
            count++;
        }
        System.out.println(anum);
        System.out.println(count);
    }
}
