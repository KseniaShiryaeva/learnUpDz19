public class greenTest {
    public static void main(String[] args) {

        boolean itsGreenLight = false;

        players[] p2 = new players[10];

        p2[0] = new players("Ivan",3);
        p2[1] = new players("Maga",0);
        p2[2] = new players("Abdula",3);
        p2[3] = new players("Izya",10);
        p2[4] = new players("Misha",4);
        p2[5] = new players("Fillip",15);
        p2[6] = new players("Gena",9);
        p2[7] = new players("Ravshan",8);
        p2[8] = new players("Boris",17);
        p2[9] = new players("Vova",99);

        GreenList t = new GreenList();

        t.SpeedTest(p2,itsGreenLight);

    }
}

class players {
    public  String name;
    int speed;

    public players(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }
}

class GreenList{

    public void SpeedTest(players y[],boolean Light){
        int count = 0;

        if (Light == false) {
            System.out.println("Горит красный, выбывает : ");
            for (int i = 0; i < y.length; i++) {
                if (y[i].speed != 0) {
                    count++;
                    System.out.println(y[i].name + " " + y[i].speed);
                }
            }
            System.out.println("Кол-во выбывших : " + count);
        }

        else {
            System.out.println("Горит зелёный, выбывает : ");
            for (int i = 0; i < y.length; i++) {
                if (y[i].speed == 0){
                    count++;
                    System.out.println(y[i].name + " " + y[i].speed );
                }

            }
            System.out.println("Кол-во выбывших : " + count);
        }
    }
}
