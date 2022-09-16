package lecture_07_OOP;

public class Employee extends Person {
    //все остальные поля наследуем от класса Person
    public int salary;
    public int expirience;
    public boolean isHappy;
    public Laptop laptop;//объект каласса Laptop, объект класса использует другой(композиция)

    public Employee(){}//конструктор по умолчанию
    public Employee(String name, int age, String sex, int salary, int expirience){
        //super(name,age,sex);//super для наследования конструктора из класса Person.
                            // Конструкторы не наследуются, но подкласс может вызывать конструктор, определенный его суперклассом,
                            // с помощью следующей формы ключевого слова super: super(список_аргументов);
        super(name,age,sex);//в один конструктор можно уснаследовать только один родительский конструктор
        this.expirience = expirience;
        this.salary = expirience;
        if(salary>40000){
            this.isHappy=true;
        }
        else this.isHappy=false;
    }


    public void print(){
        System.out.printf("name = %s, age = %d, sex = %s, expirience = %s, salary = %s, isHappy = %b\n" , this.name, this.age, this.sex,this.expirience,this.salary, this.isHappy);//переопределили метод print класса Person(полиморфизм)
    }
    public void setLaptop(Laptop laptop){//на вход принимаем объект класса laptop
        this.laptop=laptop;
        laptop.owner=this;//у ноутбука появляется владелец текущиц объект Employee
        //Тони берет ноутбук и стает его владельцем, а у ноутбука появляется владелец
    }
    public void returnLaptop(Laptop laptop){
        this.laptop.owner = null;//обращаемся к сотруднику(this), обращаемся к его ноутбуку, обращаемся к владельцу и обнуляем его
        this.laptop = null;//обнуляем поле laptop для текущего объекта
    }

}