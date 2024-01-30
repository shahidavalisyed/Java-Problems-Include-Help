package ClassObject;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

class Distance{
    int feets;
    int inches;
    public void getDistance(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Feets:");
        feets=sc.nextInt();
        System.out.println("Enter Inches:");
        inches=sc.nextInt();
    }
    public void addDistances(Distance d1,Distance d2){
        inches=d1.inches+d2.inches;
        feets=d1.feets+d2.feets+(inches/12);
        inches=inches%12;
    }
    public void showDistances(){
        System.out.println("Feets :"+feets+"   Inches: "+inches);
    }
}

public class AddTowDistances {
    public static void main(String[] args) {
        Distance D1=new Distance();
        Distance D2=new Distance();
        Distance D3=new Distance();

        System.out.println("Enter First Distance:");
        D1.getDistance();
        System.out.println("Enter Second Distances:");
        D2.getDistance();


        D3.addDistances(D1,D2);
        System.out.println("Total Distances is :");
        D3.showDistances();
    }
}
