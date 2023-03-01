import java.util.Random;
class DMVSimulator {
    public static void main( String args[] ) {
      Random rand = new Random(); 
      int upperbound = 100;
      int int_random = rand.nextInt(upperbound); 
      for (int i = 1; i <= int_random; i++){
            System.out.println(i);
        }
    }
}