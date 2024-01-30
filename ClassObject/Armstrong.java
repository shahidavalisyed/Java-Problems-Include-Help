package ClassObject;

import java.util.Scanner;

class ArmstringCheck{
    public boolean armstrong(int num){
        int sum=0,n=num;

        while(n>0){
            int d=n%10;
            sum=sum+(d*d*d);
            n=n/10;
        }

        if(sum==num)return true;
        else return false;
    }
}

public class Armstrong {
    public static void main(String[] args) {

        System.out.println("Enter a Positive Number");
        int n;
        Scanner sc =new Scanner(System.in);
        n=sc.nextInt();
        ArmstringCheck ar=new ArmstringCheck();

        if(ar.armstrong(n)){
            System.out.println(n+" is Armstron Number");
        }else{
            System.out.println(n+" is Not Armstrong Number");
        }

    }
}
