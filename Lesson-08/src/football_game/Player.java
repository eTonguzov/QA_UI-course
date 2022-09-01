package football_game;

public class Player extends Person{
    String position;
    private int salary;
    Futball_Club futball_club;//null

    public Player(String name, int age, String position, int salary){
        this.name = name;
        this.age = age;
        this.position = position;
        this.salary = salary;
    }

    public void info_player(){
        System.out.printf("Имя игрока = %s, возраст = %d, позиция: %s, зарплата: %d", this.name, this.age, this.position);
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
}
