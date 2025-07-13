@@ -0,0 +1,25 @@
import java.util.Scanner;

public class Class_Problem {
    public static void main(String[] args) {
        HelloTillStop helloer = new HelloTillStop();
        helloer.showHello();
    }
}

class HelloTillStop {
    Scanner sc = new Scanner(System.in); // Used for reading user input

    void showHello() {
        String choice;
        do {
            System.out.println("For Hello type 'h', anything else to stop");
            choice = sc.next(); // Read user input

            if ("h".equals(choice)) { // Check if input is 'h'
                System.out.println("Hello"); // If yes, print "Hello"
            }

        } while ("h".equals(choice)); // Repeat the loop only if 'h' was entered
    }
}
