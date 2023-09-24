import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        isPalindrom();

    }


    static boolean isPalindrom(){

        Scanner getNumber = new Scanner(System.in);

        System.out.print("Please Enter a Number : ");

        int number = getNumber.nextInt();

        int temp = number;
        int reverseNumber = 0;
        int lastNumber;

        while(temp != 0){

            System.out.println("*********************************************");

            System.out.println("Number : " + temp);

            lastNumber = temp % 10;  // Son Rakamı Bulma

            System.out.println("Last Number : " + lastNumber);

            reverseNumber = (reverseNumber * 10) + lastNumber;   // Ters SAyıyı Yazdırma

            System.out.println("New Number : " + reverseNumber);

            temp /= 10;

            if(number == reverseNumber){

                System.out.println(number + " is a Palindrom Number !!!");

            }

            else{
                System.out.println(number + " is not a Palindrom Number !!!");
            }



        }

        return true;

    }

}
