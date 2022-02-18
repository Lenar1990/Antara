import model.Kotik;

import java.util.Locale;

public class Application {
    public static void main(String[] args) {

        Kotik Vasya = new Kotik();
        int count1 = Kotik.count;
        Vasya.setMeow("мяу");
        Vasya.setWeight(3000);
        Vasya.setPrettiness(10);
        Vasya.setName("Вася");
        Vasya.setFood("китекат");
        Vasya.setSatiety();


        Kotik Boris = new Kotik();
        int count2 = Kotik.count;
        Boris.setMeow("Мяу");
        Boris.setWeight(4000);
        Boris.setPrettiness(10);
        Boris.setName("Борис");
        Boris.setFood("вискас");
        if (Boris.getMeow().equals(Vasya.getMeow())) {
            System.out.println("котики мурлычат одинаково");
        }
        else {
            System.out.println("котики мурлычат по-разному");
        }

        Vasya.liveAnotherDay();
        System.out.println("========================");
        Boris.liveAnotherDay();

        System.out.println("========================");
        System.out.println("создано " + count2 + " котика");




    }
}
