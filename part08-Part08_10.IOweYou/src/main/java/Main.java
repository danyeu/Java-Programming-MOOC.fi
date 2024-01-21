
public class Main {

    public static void main(String[] args) {
        IOU mattsIOU = new IOU();
        mattsIOU.setSum("Arthur", 51.5);
        mattsIOU.setSum("Michael", 30);

        System.out.println(mattsIOU.howMuchDoIOweTo("Arthur"));
        System.out.println(mattsIOU.howMuchDoIOweTo("Michael"));

        IOU mattsIOU2 = new IOU();
        mattsIOU2.setSum("Arthur", 51.5);
        mattsIOU2.setSum("Arthur", 10.5);

        System.out.println(mattsIOU2.howMuchDoIOweTo("Arthur"));
    }
}
