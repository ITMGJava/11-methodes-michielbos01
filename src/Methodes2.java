import java.util.Scanner;

public class Methodes2 {
    public static void main(String[] args){
        helloworld();
        groet();
        tafels();
    }
    static void helloworld()

    {
        System.out.println("HelloWorld");

    }
    static void groet () {
        System.out.println("Hallo User");
    }
    static void tafels()
    {
        System.out.println("voer een woord in, en ik vertel je hoeveel letters erin zitten");
        Scanner s = new Scanner(System.in);
        var tekst = s.nextLine();
        System.out.println(tekst.length());
        System.out.println("voer een getal in, waar je de tafel van wil weten");
        int x = s.nextInt();
        System.out.println("de tafel van "+x+ " is: ");

        var uitkomst1=x*1;
        var uitkomst2=x*2;
        var uitkomst3=x*3;
        var uitkomst4=x*4;
        var uitkomst5=x*5;
        var uitkomst6=x*6;
        var uitkomst7=x*7;
        var uitkomst8=x*8;
        var uitkomst9=x*9;
        var uitkomst10=x*10;

        System.out.println("Dit is de tafel van " +x);
        System.out.println("1 x " +x+" = " +uitkomst1);
        System.out.println("2 x " +x+ " = " +uitkomst2);
        System.out.println("3 x "+x+ " = "+uitkomst3);
        System.out.println("4 x "+x+ " = "+uitkomst4);
        System.out.println("5 x "+x+ " = "+uitkomst5);
        System.out.println("6 x "+x+ " = "+uitkomst6);
        System.out.println("7 x "+x+ " = "+uitkomst7);
        System.out.println("8 x "+x+ " = "+uitkomst8);
        System.out.println("9 x "+x+ " = "+uitkomst9);
        System.out.println("10 x "+x+ " = "+uitkomst10);
    }


}
