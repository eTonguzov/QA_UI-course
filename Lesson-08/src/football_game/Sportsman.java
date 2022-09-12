package football_game;

public abstract class Sportsman{
    private int salary;
    private String name;
    private int age;
    private int weight;
    private int lenght;


    public Sportsman(String name, int age, int weight, int lenght, int salary){
        this.name =name;
        this.age =age;
        this.weight =weight;
        this.lenght =lenght;
        this.salary =salary;
    }
    public abstract void info_player();

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSalary() {
        return salary;
    }
    public int getAge() {
        return age;
    }
    public int getWeight() {
        return weight;
    }
    public int getLenght() {
        return lenght;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public void setLenght(int lenght) {
        this.lenght = lenght;
    }
}
