ackage Domashka_25;

 interface Swimmer {
     void swim ();
}
 interface Ranner {
     void run ();
}
interface Fahrad {
     void fahrad ();
}
class Triathlete implements Swimmer, Ranner {
    @Override
    public void swim() {
        System.out.println("Спортсмен плавает.");
    }

    @Override
    public void run() {
        System.out.println("Спортсмен бегает. ");
    }


}


public class Main {
    public static void main(String[] args) {
        Triathlete triathlete = new Triathlete();
        triathlete.swim();
        triathlete.run();

    }
}
