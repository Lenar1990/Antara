import model.Kotik;

import java.util.Locale;

public class Application {
    public static void main(String[] args) {

        Kotik Vasya = new Kotik();
        int count1 = Kotik.count;
        /*Vasya.setMeow("мяу");
        Vasya.setWeight(3000);
        Vasya.setPrettiness(5.5);
        Vasya.setName("Вася");
        Vasya.setFood("китекат");*/

        Kotik Boris = new Kotik();
        int count2 = Kotik.count;
        /*Boris.setMeow("Мяу");
        Boris.setWeight(4000);
        Boris.setPrettiness(7.5);
        Boris.setName("Борис");
        Boris.setFood("вискас");
        System.out.println("Кот " + Vasya.getName() + " вес " + Vasya.getWeight() + " г" + " милота " + Vasya.getPrettiness() + " мурлычит " + Vasya.getMeow() + " ест " + Vasya.getFood());
        System.out.println("Кот " + Boris.getName() + " вес " + Boris.getWeight() + " г" + " милота " + Boris.getPrettiness() + " мурлычит " + Boris.getMeow() + " ест " + Boris.getFood());
        if (Boris.getMeow().equals(Vasya.getMeow())) {
            System.out.println("они мурлычат одинаково");
        }
        else {
            System.out.println("они мурлычат по-разному");
        }
        System.out.println("создано " + count2 + " котика");*/

        Vasya.liveAnotherDay();
        Vasya.liveAnotherDay();

        //Boris.liveAnotherDay();

    }
}
