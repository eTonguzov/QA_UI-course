package rus_post_quene;

public class Person {

    private String name;
    private String sex;
    private int age;
    Talon number; //номер выданного талона

    public Person(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public int talonNum() {
        if(number == null){
            return 0;
        }else return number.talonGen();
    }

    public void person_Info() {
        System.out.printf("Имя = %s, Пол = %s, Возраст = %s", this.name, this.sex, this.age);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

