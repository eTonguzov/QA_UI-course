package lecture_07_OOP;

public class Manager extends Employee{

    private int bonus;//можно общаться только внутри этого класса

    public Manager(String name, int age, String sex, int salary, int expirience){
        super( name,  age,  sex,  salary, expirience);//наследуем конструктор из класса Employee
        this.bonus = generateBonus();

        }
        private int generateBonus(){
        if(salary>100){
            this.bonus =
        }
        }

}
