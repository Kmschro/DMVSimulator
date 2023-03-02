import java.util.Random;
class DMVSimulator {
    public static void main( String args[] ) {
        System.out.println("Welcome to the DMV");
        Random rand = new Random(); 
        int upperbound = 100;
        int int_random = rand.nextInt(upperbound); 
        System.out.println("Your number is " + int_random + " and you will have to wait until your number is called.");
        for (int i = 1; i <= int_random; i++){
            System.out.println(i);
        }
        System.out.println("I am sorry to tell you, but you do not have the required paperwork.");
    }
}