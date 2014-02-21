/**
 * FizzBuzz for those who don't know BrainFuck.
 */
public final class FizzBuzz {

    public static void main(String[] args) {
        
        for (int i = 1; i <= 100; i++) {
            String out = "";

            if (i % 3 == 0) {
                out += "Fizz";
            }

            if (i % 5 == 0) {
                out += "Buzz";
            }

            if (out.isEmpty()) {
                out = i + "";
            }

            System.out.println(out);
        }
    }
}