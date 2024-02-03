
public class Main {

    public static void main(String[] args) {
        // Test your code here!
        TripleTacoBox tt = new TripleTacoBox();
        CustomTacoBox ct = new CustomTacoBox(10);
        System.out.println(tt.tacosRemaining());
        System.out.println(ct.tacosRemaining());
        tt.eat();
        for (int i = 0; i < 3; i++) {
            ct.eat();
        }
        System.out.println(tt.tacosRemaining());
        System.out.println(ct.tacosRemaining());

    }
}
