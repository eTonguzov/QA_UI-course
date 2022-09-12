package football_game;

public class BasketballPlayer extends Sportsman {

    private String basket_position;//позиция на площадке
    private int basketball_skill;//баскетбольные скилы

    public BasketballPlayer(String name, int age, int weight, int lenght, int salary, String basket_position, int basketball_skill) {
        super(name, age, weight, lenght, salary);
        this.basket_position = basket_position;
        this.basketball_skill = basketball_skill;
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }
    @Override
    public String getName() {
        return super.getName();
    }
    public void setAge(int age) {
        if (age < 0) {
            super.setAge(25);
        } else {
            super.setAge(age);
        }
    }
    public int getAge(){
        return this.age;
    }

    @Override
    public void info_player() {
        System.out.println(this.getName());
    }

    public void setBasket_position(String basket_position){
        this.basket_position = basket_position;
    }
    public String getBasket_position(){
        return basket_position;
    }
    public void setBasketball_skill(int basketball_skill) {
        this.basketball_skill = basketball_skill;
    }
    public int getBasketball_skill() {
        return basketball_skill;
    }
}
