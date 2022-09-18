package basketball_game.team;

public class Game {
    BasketballTeam team;
    BasketballTeam anotherTeam;

    public String playGame(BasketballTeam team, BasketballTeam anotherTeam){

        if(team.getTeamSkill() < anotherTeam.getTeamSkill()){
           return  anotherTeam.getName() + " win";
        }else return team.getName() + " win";
    }
}
