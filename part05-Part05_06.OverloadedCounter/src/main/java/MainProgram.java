
public class MainProgram {

    public static void main(String[] args) {
        // Test your counter here
        Counter c = new Counter();
        System.out.println(c.value());
        c.increase();
        System.out.println(c.value());
        c.decrease();
        System.out.println(c.value());
        c.increase(5);
        System.out.println(c.value());
        c.decrease(5);
        System.out.println(c.value());

        Counter cc = new Counter(11);
        System.out.println(cc.value());
        cc.increase();
        System.out.println(cc.value());
        cc.decrease();
        System.out.println(cc.value());
        cc.increase(5);
        System.out.println(cc.value());
        cc.decrease(5);
        System.out.println(cc.value());
    }
}
