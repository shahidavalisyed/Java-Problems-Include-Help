package ClassObject;

import java.util.Scanner;

class DigitsCount{
    int num;
    public void readDigit(int x){
        num=x;
    }
    public int countDigits(){
        int count=0,n;
        n=num;
        while (n>0){
            n=n/10;
            count++;
        }

        return count;
    }
}

public class Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter a Positive Digit NUmber:");
        n=sc.nextInt();

        DigitsCount dg=new DigitsCount();

        dg.readDigit(n);
        System.out.println("Total Number of Digits are:"+dg.countDigits());


    }
}
