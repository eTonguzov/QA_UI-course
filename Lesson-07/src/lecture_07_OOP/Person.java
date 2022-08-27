package lecture_07_OOP;

public class Person {
    public String name;
    public int age;
    public String sex;

    public Person() {//конструктор по умолчанию
    }
    public Person(String name){//на вход подаем имя
        this.name=name;//указатель this, указатель на текущий объект(объект Person)
    }
    public Person(String name, int age){
        this(name);//первый конструктор только с name
        if(age<=0){
            this.age = 18;
        }
        else this.age=age;
    }
    public Person(String name, int age, String sex){
        this(name, age);//второй конструктор с name и age
        if((sex=="male")||(sex=="female")){
            this.sex=sex;
        }
        else this.sex=null;
    }
    public void setAge(int age){//делаем сеттор для того что-бы в главном методе передать в него значения если нужно
        if(age<=0){
            this.age = 18;
        }
        else this.age=age;
    }
    public int getAge(){//геттер что бы выдать значение
        return this.age;
    }
    public void print(){//метод вывода значений конструктора
        System.out.printf("name = %s, age = %d, sex = %s\n", this.name, this.age, this.sex);
    }
}
