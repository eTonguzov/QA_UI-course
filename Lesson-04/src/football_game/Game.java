package football_game;
//Description:
//В чемпионате по футболу за выгрыш дают 3 очка, за ничью 1, за поражение 0.
//Известно кол-во очков полученных за игру, определить словесный результат.

import java.io.*;
public class Game {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int num;
        while (true) {
            try {
                System.out.println("Введите колличество очков, которые были начисленны вашей команде, полсе очередного тура чемпионата по футболу");
                num = Integer.parseInt(bufferedReader.readLine());//принимаем число от пользователя
                if (num > 3 || num < 0 || num==2){
                    System.out.println("Нет в футболе столько очков не дают, введите 0, 1 или 3");
                }
                else break;
            } catch (NumberFormatException exception) {
                System.out.println("Это не число!");
            }
        }
            System.out.println(num == 3 ? "Победа!" : num == 1 ? "Ничья" : "Поражение");
    }
}

