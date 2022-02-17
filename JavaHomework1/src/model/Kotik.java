package model;
import java.sql.SQLOutput;
import java.util.Locale;
import java.util.random.*;


public class Kotik {
    static int catCount=0;
    private double satiety;
    private double originSatiety;
    private double minSatiety;
    private double maxSatiety;
    private int weight;
    private String name;
    private String meow;
    private String food;
    private double prettiness;
    //private int method1;


    public static int count;

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }
    public String getMeow() {
        return meow.toLowerCase();
    }
    public String getFood() {
        return food;
    }
    public double getPrettiness() {
        return prettiness;
    }

    public void setMeow (String newMeow){
        meow = newMeow.toLowerCase();
    }

    public void setWeight (int newWeight){
        weight = newWeight;
    }
    public void setPrettiness (double newPrettiness){
        prettiness = newPrettiness;
    }
    public void setName (String newName){
        name = newName;
    }
    public void setFood (String newFood){
        food = newFood;
    }

    public Kotik() {
        count++;
        satiety = 0 + 100.0*Math.random();
        originSatiety = satiety;
        minSatiety = 0.0;
        maxSatiety = 100.0;


    }



    public boolean liveAnotherDay() {
        for (int i = 1; i <= 26; i++) {
        double method = 1 + 6 * Math.random();
        int method1 = (int) Math.round(method);

            switch (method1) {
                case 1:
                    jump();
                    System.out.println("я прыгаю");
                    break;
                case 2:
                    lick_itself();
                    System.out.println("я облизываюсь");
                    break;
                case 3:
                    sharpen_claws();
                    System.out.println("я точу когти");
                    break;
                case 4:
                    climb();
                    System.out.println("я лазаю");
                    break;
                case 5:
                    sleep();
                    System.out.println("я сплю");
                    break;
                case 6:
                    eat();
                    System.out.println("я ем");
                    break;
            }


        }
        return true;
    }


    private boolean jump()    {
        satiety--;
        if (satiety<=0) {
            System.out.println("я хочу есть");
        }
        return true;
    }


    private boolean lick_itself()    {
        satiety--;
        if (satiety<=0) {
            System.out.println("я хочу есть");
        }
        return true;
    }


    private boolean sharpen_claws()      {
        satiety--;
        if (satiety<=0) {
            System.out.println("я хочу есть");
        }
        return true;
    }


    private boolean sleep()    {
        satiety--;
        if (satiety<=0) {
            System.out.println("я хочу есть");
        }
        return true;
    }


    private boolean climb()    {
        satiety--;
        if (satiety<=0) {
            System.out.println("я хочу есть");
        }
        return true;
    }


    private void eat()    {
        satiety++;
        if (satiety==100) {
            System.out.println("я наелся");
        }
    }



}
