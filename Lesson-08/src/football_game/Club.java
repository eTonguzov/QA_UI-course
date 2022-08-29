package football_game;

public class Club extends Team{
    int money;
    int skill_deffence;
    int skill_attack;

    public void setSlogan(String slogan){
        this.slogan = slogan;
    }
    public String getSlogan(){
        return slogan;
    }
    public void football_club_info(){
        System.out.printf("Название кооманды = %s, Навзвание стадиона = %s, Бюджет команды = %d, Рейтинг защиты = %d, Рейтинг атаки = %d", this.name, this.stadiumName, this.money,this.skill_deffence,skill_attack);
    }
}
