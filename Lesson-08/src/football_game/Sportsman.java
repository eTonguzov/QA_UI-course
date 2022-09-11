package football_game;

public class Player extends Person{
    private String position;
    private int salary;
    Futball_Club futball_club;//null

    public Player(String name, int age, String position, int salary){
        super();//пустой конструктор
        this.name = name;
        this.age = age;
        this.position = position;
        this.salary = salary;
    }

    public void setFutball_club(Futball_Club futball_club) {
        this.futball_club = futball_club;
    }

    public int getSalary() {
        return salary;
    }


    public void info_player(){
        System.out.printf("Имя игрока = %s, Команда: %s возраст = %d, позиция: %s, зарплата: %d", this.name, this.position, this.age, this.position);
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
}
