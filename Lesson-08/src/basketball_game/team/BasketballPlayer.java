package basketball_game.team;


public class BasketballPlayer extends Sportsman {

    private int basketball_skill;//баскетбольные скилы
    public BasketballTeam team;
    private int all_skills;

    public BasketballPlayer(int sport_skill, int basketball_skill) {
        super(sport_skill);//используем конструктор из родительского абстрактного класса
        this.basketball_skill = basketball_skill;
    }

    public void setTeam(BasketballTeam team) {
        this.team = team;//у баскетболиста появляется команда
        team.player = this;//а у команды появляется этот игрок(класс BasketballPlayer)
    }

    @Override
    public void setName(String name){
        super.setName(name);
    }
    @Override
    public String getName(){
        return super.getName();
    }

    @Override
    public void setSport_skill(int sport_skill) {
        super.setSport_skill(sport_skill);
    }
    @Override
    public int getSport_skill() {
        return super.getSport_skill();
    }
    public void setBasketball_skill(int basketball_skill) {
        this.basketball_skill = basketball_skill;
    }
    public int getBasketball_skill() {
        return basketball_skill;
    }

    public int summAll_skills() {
        return this.all_skills = (basketball_skill + getSport_skill())/2;
    }


    public int getAll_skills() {
        return all_skills;
    }
}

