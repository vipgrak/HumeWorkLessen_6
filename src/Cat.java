public class Cat extends Animals {
    static int count;

    Cat(String name) {
        super(name);
        ++count;
    }
    void run(int distance) {
        if (distance > 200) {
            System.out.println("Коты не бегают больше 200м!");
        } else {
            System.out.println(this.name + " пробежал " + distance + "м");
        }

    }

    void swim(int distance) {
        if (distance > 0) {
            System.out.println("Коты не умеют плавать!");
        } else {
            System.out.println(this.name + " пробежал " + distance + "м");
        }

    }
}