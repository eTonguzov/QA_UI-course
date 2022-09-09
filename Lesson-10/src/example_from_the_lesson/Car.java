package example_from_the_lesson;

public class Car {
    String model;
    String color;
    private int id;

    public Car(int id, String model, String color) {
        this.id = id;
        this.model = model;
        this.color = color;
    }

    public void print() {
        System.out.printf("Car = %s, color = %s, id = %d", this.model, this.color, this.id);
    }

}
