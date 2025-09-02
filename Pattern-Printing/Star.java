// Ques : Print the given pattern

// * * * * *
// * * * * *
// * * * * *
// * * * * *
// * * * * *


// Ans

public class Star {
    public static void main(String[] args) {
        int n = 5;

        // Simple pattern printing
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


