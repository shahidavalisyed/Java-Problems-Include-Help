package ClassObject;

import javax.sound.midi.Soundbank;
import java.util.Scanner;
class PalindromDigitOpr{

    public boolean isPalindrom(int num) {

        int sum=0,n=num;

        while (n>0){
            int d=n%10;
            sum=(sum*10)+d;
            n=n/10;
        }

        if(sum==num){
            return true;
        }else return false;

    }
}

public class Palindrom {
    public static void main(String[] args) {
        System.out.println("Enter Positive Number:");
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        PalindromDigitOpr dg=new PalindromDigitOpr();

        if(dg.isPalindrom(n)){
            System.out.println(n+" Is a Palindrome Number");
        }else{
            System.out.println(n+" is Not Palindrom");
        }
    }
}
