package example_from_the_lesson;

public class sQueue {
    sNode first;
    sNode last;
    int size;

    public sQueue() {};

    public void push(sNode n) {

        if(n == null)
            return;
        else {
            if(first == null) {
                last = n;
                first = last;
                size++;
            }
            else {
                last.next = n;
                last = last.next;
                size++;
            }
        }
    }
    public sNode pop() {
        if(first == null)
            return null;
        else {
            if(first == last) {
                sNode temp = first;
                first = null;
                last = null;
                size--;
                return temp;
            }
            else {
                sNode temp = first;
                first = first.next;
                size--;

                return temp;
            }
        }
    }

    public void print() {

        System.out.print("Queue consists of: ");

        sNode temp = first;

        while(temp != null) {
            System.out.print(temp.data.model + " | ");
            temp = temp.next;
        }

        System.out.println("length = " + this.getSize());
    }

    public int getSize() {
        if(this == null)
            return 0;
        else
            return this.size;
    }

    public void findCar(String name) {

        sNode temp = first;
        int quantity = 0;

        while(temp != null) {
            if(temp.data.model == name) {
                quantity++;
                temp = temp.next;
            }
            else {
                temp = temp.next;
            }
        }
        System.out.printf("Quantity of %s-s = %d\n", name, quantity);

    }

}
