package football_game;

public class Main {
    public static void main(String[] args) {
        Futball_Club cska = new Futball_Club("CSKA","We are CSKA", "VEB Arena", 400000, 65,88);//Цска
        Futball_Club spartak = new Futball_Club("Spartak","We are Spartak", "Otkrytie Arena", 6000000, 65,87);
        Futball_Club zenit = new Futball_Club("Zenit","We are Zenit", "Petrovsky Arena", 100000000, 75,59);
        Futball_Club lokomotiv = new Futball_Club("Lokomotive","We are Lokomotive", "Cherkizovo Arena", 35000000, 43,58);

        Player ronaldo = new Player("Ronaldo", 33,"Forward",9000);
        ronaldo.setFutball_club(zenit);
        ronaldo.futball_club.football_club_info();
        ronaldo.info_player();
    }
}
