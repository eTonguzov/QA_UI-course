package rus_post_quene;

public class Queue {//очередь
    Talon first;//первый человек в очереди
    Talon last;//последний человек в очереди
    int size;

    public Queue(){}//пустая очередь
    public void push(Talon talon){//наполнение очереди
        if(talon == null){//если талонов нет, очереди тоже нет
            return;
        }else if(first == null){//если в переди вас в очреди никого нет
            last = talon;//то ваш талон станет последним
            first = last;//и первым(первый==последний)
            size++; //очередь образовалась
        }else {
            last.next = talon;//последний талон(last) указывает на следующий(новопришедший в очередь) (объект last, имеет пременую next класса Talon, и теперь указывает на новый объект talon который станет поледним)
            last = last.next;//новоприщедший становится последним
            size++;//очередь увеличилась
        }
    }
    public Talon pop(){//убывание очереди
        if(first == null){//если нет никого в очереди
            return null;
        }else if(first == last){
            Talon temp = first;//сохранили первый элемент во временной переменной
            last = null;//последнего больше нет
            first = null;//первого тоже больше нет
            size--;//уменьшается очередь
            return temp;
        }else{
            Talon temp = first;//првый первый на прием
            first = first.next;//первым становится тот кто был вторым
            size--;
            return temp;
        }
    }
    public void printAllTalon(){
        System.out.print("Очередь состоит из: ");

        Talon temp = first;

        while (temp!=null){
            System.out.print(temp.data.getName() + " | ");//обращаемся к temp(обект класса Talon) обращаемся к его методу getData() который возвращает приватные данные владельца талона

            temp = temp.next;//временный становится следующий за ним
        }
        System.out.println(this.getSize() + " человек");
    }
    public int getSize(){
        if(this == null){//если очередь пуста
            return 0;
        }else return this.size;
    }
}
