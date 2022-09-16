package basketball_game;

//import basketball_game.team.BasketballPlayer;

import basketball_game.team.BasketballPlayer;
import basketball_game.team.BasketballTeam;

public class Main {
    public static void main(String[] args) {

        BasketballTeam lakers = new BasketballTeam("Lakers");
        BasketballTeam dallas = new BasketballTeam("Dallas");
        BasketballPlayer lebron = new BasketballPlayer(97,89);
        BasketballPlayer kobe = new BasketballPlayer(99,99);
        BasketballPlayer dirk_nowizki = new BasketballPlayer(99,99);
        BasketballPlayer luka_doncic = new BasketballPlayer(99,99);
        lebron.setTeam(lakers);
        kobe.setTeam(lakers);
        dirk_nowizki.setTeam(dallas);
        luka_doncic.setTeam(dallas);
        System.out.println(lakers.count_player);



    }
}
