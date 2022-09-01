package football_game;

public class Main {
    public static void main(String[] args) {
        Futball_Club cska = new Futball_Club("CSKA","We are CSKA", "VEB Arena", 400000, 65,88);//Цска
        Futball_Club spartak = new Futball_Club("Spartak","We are Spartak", "Otkrytie Arena", 6000000, 65,87);
        Futball_Club zenit = new Futball_Club("Zenit","We are Zenit", "Petrovsky Arena", 100000000, 75,59);
        Futball_Club lokomotiv = new Futball_Club("Lokomotive","We are Lokomotive", "Cherkizovo Arena", 35000000, 43,58);
        cska.football_club_info();
        spartak.football_club_info();
        zenit.football_club_info();
        lokomotiv.football_club_info();
        Player ronaldo = new Player("Ronaldo", 33,"Forward",9000);
        System.out.println(ronaldo.futball_club);
    }
}
