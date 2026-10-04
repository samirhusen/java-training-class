public class mock1 {

    public static void main(String[] args) {

        String[] stringArr = {"a", "b", "b", "c", "c", "c", "d"};
        boolean[] counted = new boolean[stringArr.length];

        for (int i = 0; i < stringArr.length; i++) {
            if (counted[i]) {
                continue; // This letter was already counted.
            }

            int counter = 1; // Include the letter at index i.

            for (int j = i + 1; j < stringArr.length; j++) {
                if (stringArr[i].equals(stringArr[j])) {
                    counter++;
                    counted[j] = true;
                }
            }

            if (counter > 1) {
                System.out.println("The letter " + stringArr[i] + " appears " + counter + " times");
            }
        }
    }

}
