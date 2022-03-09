public class Main {
    public static void main(String[] args) {

        // true-зелёный false-красный
        boolean itsGreenLight = true;

        //игроки
        int speedOfPlayer1 = 0;
        int speedOfPlayer2 = 6;
        int speedOfPlayer3 = 7;

        // кол-во выбывших

        int count = 0;
        int countSpeed = speedOfPlayer1;
        int countSpeed2 = speedOfPlayer2;
        int countSpeed3 = speedOfPlayer3;


        //Создаем массив игроков (собираем их в кучку чтобы можно было их перечислить)
        int players[] = {speedOfPlayer1, speedOfPlayer2, speedOfPlayer3};
        int speed [] = {speedOfPlayer1, speedOfPlayer2, speedOfPlayer3};

        // если горит красный
        if (itsGreenLight == false) {
            // перебираем игроков;
            for (int i = 0; i < 3; i++) {
                //если скорость игрока не 0 то count увеличивается на 1
                if (players[i] != 0) count++;
            }
            System.out.println("Горит красный, выбывает " + count + " игроков");
            while (speedOfPlayer1 < 0)
                for (int ii = 0; ii < 3; ii++)
                    if (speed[ii] != 0) countSpeed = speedOfPlayer1;
            System.out.println("Скорость игрока = " + countSpeed );
            while (speedOfPlayer2 < 0)
                for (int ii = 0; ii < 3; ii++)
                    if (speed[ii] != 0) countSpeed2 = speedOfPlayer2;
            System.out.println("Скорость игрока = " + countSpeed2 );
            while (speedOfPlayer3 < 0)
                for (int ii = 0; ii < 3; ii++)
                    if (speed[ii] != 0) countSpeed3 = speedOfPlayer3;
            System.out.println("Скорость игрока = " + countSpeed3 );
        }
        // если не красный (значит горит зелёный)
        else {
            for (int i = 0; i < 3; i++) {
                //если скорость игрока равна 0 то count увеличивается на 1
                if (players[i] == 0) count++;
            }
            System.out.println("Горит зелёный, выбывает " + count + " игроков");
            while (speedOfPlayer1 < 0)
                for (int ii = 0; ii < 3; ii++)
                    if (speed[ii] != 0) countSpeed = speedOfPlayer1;
            System.out.println("Скорость игрока = " + countSpeed );
            while (speedOfPlayer2 < 0)
                for (int ii = 0; ii < 3; ii++)
                    if (speed[ii] != 0) countSpeed2 = speedOfPlayer2;
            System.out.println("Скорость игрока = " + countSpeed2 );
            while (speedOfPlayer3 < 0)
                for (int ii = 0; ii < 3; ii++)
                    if (speed[ii] != 0) countSpeed3 = speedOfPlayer3;
            System.out.println("Скорость игрока = " + countSpeed3 );
        }

    }
}
