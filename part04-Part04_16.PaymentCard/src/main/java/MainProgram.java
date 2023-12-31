
public class MainProgram {

    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        
        // Here you can write code to test that PaymentCard works as intended
        // be sure to erase the extra code for the last part of the exercise!
        PaymentCard card_paul = new PaymentCard(20);
        PaymentCard card_matt = new PaymentCard(30);
        card_paul.eatHeartily();
        card_matt.eatAffordably();
        System.out.println("Paul: " + card_paul.toString());
        System.out.println("Matt: " + card_matt.toString());
        card_paul.addMoney(20);
        card_matt.eatHeartily();
        System.out.println("Paul: " + card_paul.toString());
        System.out.println("Matt: " + card_matt.toString());
        card_paul.eatAffordably();
        card_paul.eatAffordably();
        card_matt.addMoney(50);
        System.out.println("Paul: " + card_paul.toString());
        System.out.println("Matt: " + card_matt.toString());
    }
}
