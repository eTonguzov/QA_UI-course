package rus_post_quene;
// Реализовать очередь в почтовом отделении по выданным номерам. Пример талона: Т23.
public class RussianPost {
    Person person;
    public static void main(String[] args) {
        Person egor = new Person("Egor", "male", 29 );
        Person kate = new Person("Kate", "female", 23);
        Person tony = new Person("Tony", "male", 43);

        Talon talon1 = new Talon(egor);//Егор получает талон 1
        Talon talon2 = new Talon(kate);//Кейт получает талон 2
        Talon talon3 = new Talon(tony);//Тони получает талон 3

        Queue queue = new Queue();//создаем объект очердеи, пока она пустая
        queue.printAllTalon();

        queue.push(talon1);//в очереди талон 1
        queue.push(talon3);//в очереди талон 2
        queue.push(talon2);//в очереди талон 3
        queue.printAllTalon();

    }
}
