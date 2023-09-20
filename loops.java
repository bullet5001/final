import java.util.Scanner;

public class loops {
    public static void main(String[] args)
    {
        //int num=2;
        int mul=1;
        int count=1;
        System.out.println("enter the number to be multiplied");
        Scanner scn=new Scanner(System.in);
        int num= scn.nextInt();

        do{
            mul=count*num;
            System.out.println(num + "*" + count + "=" + mul);
            count++;
        }while(count<=10);
        //System.out.println(sum);
    }
}
::::ijbkjdbskjdbkjsdb:x