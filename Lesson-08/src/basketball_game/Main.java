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
        BasketballPlayer lebron = new BasketballPlayer("Lebron James", 50, 56);
        BasketballPlayer kobe = new BasketballPlayer("Kobe Bryant",99, 99);
        BasketballPlayer dirk_nowitzki = new BasketballPlayer("Dirk Novitzki",50, 99);
        BasketballPlayer luka_doncic = new BasketballPlayer("Luka Doncic",99, 99);
        BasketballPlayer luka_doncic2 = new BasketballPlayer("Luka Doncic2",99, 99);
        BasketballPlayer luka_doncic3 = new BasketballPlayer("Luka Doncic3",99, 99);
        //BasketballPlayer westbrook = new BasketballPlayer("Westbrook", 65,78);
        /*Добавляем игроков в команды*/
        lakers.setPlayer(lebron);
        lakers.setPlayer(kobe);
        dallas.setPlayer(dirk_nowitzki);
        dallas.setPlayer(luka_doncic);
        dallas.setPlayer(luka_doncic2);
        dallas.setPlayer(luka_doncic3);

        //lakers.setPlayer(westbrook);
        /*Рейтинг игрока(сумма по всем скиллам)*/
        //System.out.println(lebron.getSummAll_skills());
        /*Ираем первую игру*/
        Game play_game= new Game();
        System.out.println(play_game.playGame(lakers, dallas));//У кого больше рейтинг (средний по игрокам,тот и победит)
        /*Вывод составов команд*/
        System.out.println(dallas.getRoster());//переопределил toString
        System.out.println(lakers.getRoster());
        System.out.println(lebron.toString());//toString



    }
}
