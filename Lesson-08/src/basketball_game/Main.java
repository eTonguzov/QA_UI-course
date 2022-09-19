package basketball_game;

/*Для проработки принципов ООП, */

import basketball_game.team.BasketballPlayer;
import basketball_game.team.BasketballTeam;
import basketball_game.team.Game;

public class Main {
    public static void main(String[] args) {
        /*Создаем команды*/
        BasketballTeam lakers = new BasketballTeam("Lakers");
        BasketballTeam dallas = new BasketballTeam("Dallas");
        /*Создаем игроков*/
        BasketballPlayer lebron = new BasketballPlayer(71, 56);
        BasketballPlayer kobe = new BasketballPlayer(99, 99);
        BasketballPlayer dirk_nowizki = new BasketballPlayer(50, 99);
        BasketballPlayer luka_doncic = new BasketballPlayer(99, 99);
        /*Добавляем игроков в команды*/
        lakers.setPlayer(lebron);
        lakers.setPlayer(kobe);
        dallas.setPlayer(dirk_nowizki);
        dallas.setPlayer(luka_doncic);
        /*Рейтинг игрока(сумма по всем скиллам)*/
        System.out.println(lebron.getSummAll_skills());
        /*Ираем первую игру*/
        Game play_game= new Game();
        System.out.println(play_game.playGame(lakers, dallas));//У кого больше рейтинг (средний по игрокам,тот и победит)

        System.out.println(lakers.getRoster());//попробовать переопределить
        System.out.println(lebron.hashCode());




//        lebron.setTeam(lakers);
//        kobe.setTeam(lakers);
//        dirk_nowizki.setTeam(dallas);
//        luka_doncic.setTeam(dallas);
//        System.out.println(lakers.count_player);


    }
}
