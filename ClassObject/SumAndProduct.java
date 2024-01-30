package ClassObject;

import java.util.Scanner;

class DigitOpr{


    public int sumofDigts(int num) {
        int sum=0,n=num;
        while (n>0){
            int d=n%10;
            sum+=d;
            n/=10;
        }
        return sum;
    }

    public int productOfDigits(int num) {
        int pro=1,n=num;
        while (n>0){
            int d=n%10;
            pro*=d;
            n/=10;
        }
        return pro;
    }

}


public class SumAndProduct {
    public static void main(String[] args) {
        System.out.println("Enter a Positive Digit:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        DigitOpr dg=new DigitOpr();

        System.out.println("Sum of All Digits are:"+dg.sumofDigts(n));
        System.out.println("PRODUCT of All Digits:"+dg.productOfDigits(n));
    }
}
