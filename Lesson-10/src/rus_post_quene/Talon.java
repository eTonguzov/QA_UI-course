package rus_post_quene;

public class Talon {
    Person data;//персональные данные человека стоящего в очереди
    Talon next;//указатель на следующий талон
    //Talon gen_number;

    public Talon(Person data){
        this.data = data;
    }
    public static int talonGen(){
        int gen_number = 1;
        gen_number++;
        return gen_number;

    }

}
