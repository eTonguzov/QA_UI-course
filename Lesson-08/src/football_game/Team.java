package football_game;

public abstract class Team{
    private String name;//имя и
    private String slogan;//девиз как перемнные константы которые не меняются никогда и идут с начала основания футбоьного клуба
    private String stadiumName;

    public Team(String name, String slogan, String stadiumName){
        this.name=name;
        this.slogan=slogan;
        this.stadiumName=stadiumName;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getSlogan() {
        return slogan;
    }
    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    public String getStadiumName() {
        return stadiumName;
    }

    public void setStadiumName(String stadiumName) {
        this.stadiumName = stadiumName;
    }

    public abstract void football_club_info();//информация о клубе
    //public abstract void saySlogan();//девиз комаеды


}