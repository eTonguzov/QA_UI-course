package basketball_game.team;

public abstract class Sportsman {
    private int sport_skill;
    private String name;


    public Sportsman(int sport_skill) {
        this.sport_skill = sport_skill;
    }

    public void setSport_skill(int sport_skill) {
        this.sport_skill = sport_skill;
    }

    public int getSport_skill() {
        return sport_skill;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
