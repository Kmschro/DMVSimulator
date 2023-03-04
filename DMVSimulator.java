import java.util.Random;
class DMVSimulator {
    public static void main( String args[] ) {
        System.out.println("Welcome to the DMV");
        Random rand = new Random(); 
        int upperbound = 200;
        int int_random = rand.nextInt(upperbound); 
        System.out.println("Your number is " + int_random + " and you will have to wait until your number is called.");
        for (int i = 1; i <= int_random; i++){
            System.out.println(i);
        }
        if (int_random > 99)
        {
            System.out.println("You have all your required documents");
        }
        else
        {
            System.out.println("Dumbass, you do not have the required paperwork.  Hahahahahaha");
        }
    }
}