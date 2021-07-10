public class Lessen_6 {
    public Lessen_6() {
    }
    public static void main(String[] args) {
        Cat cat = new Cat("Мурзик");
        Dog dog = new Dog("Платошка");
        cat.run(600);
        cat.swim(5);
        dog.run(450);
        dog.swim(1);
        System.out.println("Создано " + Cat.count + " Котов");
        System.out.println("Создано " + Dog.count + " Собак");
        System.out.println("Создано " + Animals.count + " Животных");
    }
}
