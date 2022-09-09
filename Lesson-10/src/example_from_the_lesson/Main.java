package example_from_the_lesson;

public class Main {
    public static void main(String[] args) {

        Car c1 = new Car(1, "Audi", "green");
        Car c2 = new Car(2, "Skoda", "black");
        Car c3 = new Car(3, "Skoda", "white");

        sNode s1 = new sNode(c1);
        sNode s2 = new sNode(c2);
        sNode s3 = new sNode(c3);

        sQueue q = new sQueue();
        q.print();

        q.push(s1);
        q.print();

        q.push(s2);
        q.print();

        q.push(s3);
        q.print();

        q.findCar("Lada");

    }

}
