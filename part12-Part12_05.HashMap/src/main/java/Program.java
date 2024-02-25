

public class Program {

    public static void main(String[] args) {
        // You can test the class here
        HashMap<Integer, String> hm = new HashMap<>();
        System.out.println(hm);
        hm.add(1, "Daniel");
        hm.add(2, "James");
        hm.add(3, "Bob");

        System.out.println(hm);


        System.out.println(hm.get(2));
        hm.remove(2);
        System.out.println(hm);

    }

}
