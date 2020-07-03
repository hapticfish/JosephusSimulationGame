import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;


public class JosephusDriver {


    public static int safeSpot=0;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("%nWould you like to play the Josephus Simulation? Please type [ y ] or [ n ]");
        String input = scan.nextLine();

        if (input.equals("y")){

            System.out.println("Please enter your Variables for the Simulation. ");

            System.out.printf("The Number of People that are in the array: %n");
            int inputArrayLength = scan.nextInt();

            int numberOfPeopleAlive = inputArrayLength;

            boolean[] peopleAlive = new boolean[inputArrayLength];


            boolean isAlive = true;
            for(int i=0; i < peopleAlive.length; i++ ){
                peopleAlive[i] = isAlive;
            }

            System.out.printf("%nYour Starting Position in the Array as an Integer: %n");
            int indexStart = scan.nextInt();

            System.out.printf("%nThe Number of people to skip after your postion: %n");
            int skipNumber = scan.nextInt();


            while (numberOfPeopleAlive > 1) {
                int alivePeopleCounted = 0;

                while( alivePeopleCounted < skipNumber ) {
                    indexStart++;

                    if ( indexStart >= inputArrayLength )
                        indexStart = 0;


                    if (peopleAlive[indexStart] == true)
                        alivePeopleCounted++;
                }
                peopleAlive[indexStart] = false;
                numberOfPeopleAlive--;
            }

            while (peopleAlive[safeSpot] == false ){
                safeSpot++;

            }

            System.out.printf("the safe spot for your skips was %d. Great job!!",safeSpot );

        }
    }//end main
}//end driver class


