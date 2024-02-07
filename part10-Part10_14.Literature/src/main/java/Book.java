public class Book {
    private String name;
    private int age;
    public Book(String name, int age) {
        this.name=name;
        this.age=age;
    }
    public String name() {
        return name;
    }
    public int age() {
        return age;
    }
    public String toString() {
        return name + " (recommended for " + age + " year-olds or older)";
    }
}
