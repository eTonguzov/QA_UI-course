package football_game;

public class Futball_Club extends Team{
    int money;
    int skill_deffence;
    int skill_attack;

    public Futball_Club(){}

    public Futball_Club(String name, String slogan, String stadiumName, int money, int skill_deffence, int skill_attack){
        this.name = name;
        this.slogan = slogan;
        this.stadiumName = stadiumName;
        this.money = money;
        if(skill_attack>1){
                this.skill_attack =skill_attack;
            }
            else this.skill_attack = 10;

        if(skill_deffence>1){
            this.skill_deffence =skill_deffence;
        }
        else this.skill_deffence = 10;

    }
    public void saySlogan(){
        System.out.println(this.slogan);
    }

    public void football_club_info(){
        System.out.printf("Название кооманды = %s, Навзвание стадиона = %s, Бюджет команды = %d$, Рейтинг защиты = %d, Рейтинг атаки = %d", this.name, this.stadiumName, this.money, this.skill_deffence, this.skill_attack);
    }

}
