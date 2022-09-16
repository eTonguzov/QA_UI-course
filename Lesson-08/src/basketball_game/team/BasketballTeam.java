package basketball_game.team;

public class BasketballTeam {
    BasketballPlayer player;//У команды есть игровки
    private String name;
    BasketballPlayer [] roster = new BasketballPlayer[12];

    public BasketballTeam(String name){
        this.name = name;
    }
    public void setPlayer(BasketballPlayer player){
        this.player = player;//этот игрок становится игроком команды
        player.team = this;//а у этой команды появляется игрок
        for(int i = 0; i<=12; i++){
            if(roster[i]!=null){
                roster[i] = player;
                break;
            }
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public int getTeamSkill(BasketballPlayer [] roster){
        int count = 0;
        int count_player = 0;
        for(BasketballPlayer pl : roster){
            if(pl != null){
                count = count + player.getAll_skills();
                count_player++;
            }
        }
        return count/count_player;
    }

}
