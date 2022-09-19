package basketball_game.team;

import java.util.ArrayList;

public class BasketballTeam {
    BasketballPlayer player;//У команды есть игроки
    private String name;
    ArrayList<BasketballPlayer> roster = new ArrayList<>();

    public BasketballTeam(String name){
        this.name = name;
    }
    public void setPlayer(BasketballPlayer player){
        this.player = player;//этот игрок становится игроком команды
        player.team = this;//а у этой команды появляется игрок
        roster.add(player);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<BasketballPlayer> getRoster() {
        return roster;
    }

    public int getTeamSkill(){
        int count = 0;
        int count_player = 0;
        for(BasketballPlayer pl : roster){
                count = count + pl.getSummAll_skills();
                count_player++;
        }
        return count/count_player;
    }
}