public class Animals {
    protected String name;
    static int count;
    Animals(String name) {
        this.name = name;
        ++count;
    }
}
