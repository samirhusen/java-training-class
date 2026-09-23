public class Qno14 {
    public static void main (String[] args) {
        // loop for the flag
        for (int row = 1; row <= 9; row++) {
            // alternate the flag sign like if the else will go 1,0,1,0,1......
            if (row % 2 == 1) {
                System.out.println("* * * * * * ==================================");
            } else {
                System.out.println(" * * * * *  ==================================");
            }
        }
        // remaining sign loop
        for (int row = 1; row <= 6; row++) {
            System.out.println("==============================================");
        }
    }
}
