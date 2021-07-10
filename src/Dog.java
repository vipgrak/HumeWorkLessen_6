public class Dog extends Animals {
    static int count;

    Dog(String name) {
        super(name);
        ++count;
    }
    void run(int distance) {
        if (distance > 500) {
            System.out.println("Собаки не бегают больше 500 м");
        } else {
            System.out.println(this.name + " пробежал " + distance + "м");
        }

    }

    void swim(int distance) {
        if (distance > 10) {
            System.out.println("Собаки не плавают больше 10 м");
        } else {
            System.out.println(this.name + " проплыл " + distance + "м");
        }

    }
}