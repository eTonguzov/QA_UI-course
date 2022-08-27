package lecture_07_OOP;



public class Main {
    public static void main(String[] args) {
        Person egor = new Person("Egor",0,"male");//создали человека объект egor(экземпляр класса Person)
        egor.print();
        /////////////////////////////////
        Employee tony = new Employee("Tony", 33,"no",50000,5);
        tony.print();//метод унаследован от класса Person и переопределен(полиаморфизм)
        ////////////////////////////////
        Employee james = new Employee();
        james.setAge(-32);//передали объекту plumer на вход возраст(нуже для доставки объекту какогото значения)
        System.out.println(james.getAge());
        james.print();
        ///////////////////////////////
        Laptop laptop = new Laptop("MacBook", 150000,43800);
        laptop.printInfo();
        /////////////////////////////
        tony.setLaptop(laptop);//обращаемся к менджеру Tony, вызываем метот setLaptop() и передаем ему ноутбук. (Простыми словами выдаем сотруднику ноутбук)
        tony.laptop.printInfo();//обращаемся к Tony, у Tony есть поле laptop(то есть доступ к классу laptop) т.к это ноутбук у него есть метод printInfo
        //здесь tony - сотрудник(класс Employee)
        //tony.laptop - полесотрудника, поэтом у метод printInfo вызывается из класса Laptop
        /////////////////////////////
        laptop.owner.print();//ноутбук имеет поле owner(объект класса Employee) а этот класс имеет метод print()
        System.out.println(tony.laptop.owner.name);//кто владелец ноутбука?
        /////////////////////////////
        Employee mikle = new Employee("Mikle", 33,"no",50000,3);//новый сотрудник
        Laptop lenovo = new Laptop("Lenovo", 270000,2323);//новый ноутбук
        mikle.setLaptop(lenovo);//выдаем сотруднику ноутбук lenovo
        lenovo.owner.print();//смотрим кто сотрудник ноутбука

        mikle.returnLaptop(lenovo);//Майк сдал ноутбук
        System.out.println(mikle.laptop.owner);//кто владелец ноутбука? ошибка, тк нет владельца
    }
}
