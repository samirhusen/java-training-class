package exercise5;

public class Main {
    public static void main(String[] args){
        Sports football = new Football();
        Sports basketball = new Basketball();
        Sports rugby = new Rugby();

        football.play();
        basketball.play();
        rugby.play();
    }
}
