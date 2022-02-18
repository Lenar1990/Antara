package model;
import java.sql.SQLOutput;
import java.util.Locale;
import java.util.random.*;


public class Kotik {
    static int catCount=0;
    private int satiety;
    private int  originSatiety;
    private int  minSatiety;
    private int  maxSatiety;
    private int weight;
    private String name;
    private String meow;
    private String food;
    private int  prettiness;
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
    public double getSatiety (){
        return satiety;
    }

    public void setMeow (String newMeow){
        meow = newMeow.toLowerCase();
    }

    public void setWeight (int newWeight){
        weight = newWeight;
    }
    public void setPrettiness (int  newPrettiness){
        prettiness = newPrettiness;
    }
    public void setName (String newName){
        name = newName;
    }
    public void setFood (String newFood){
        food = newFood;
    }
    public void setSatiety (){
        satiety = 100;
    }


    public Kotik() {
        count++;

        originSatiety = satiety;
        minSatiety = 0;
        maxSatiety = 100;


    }



    public boolean liveAnotherDay() {

        for (int i = 1; i <= 24; i++) {
        double method = 1 + 6 * Math.random();
        int method1 = (int) Math.round(method);
        switch (method1) {
                case 1:
                    jump();
                    //System.out.println("прыгает");
                    //System.out.println(satiety);
                    break;
                case 2:
                    lick_itself();
                    //System.out.println("облизывается");
                    //System.out.println(satiety);

                    break;
                case 3:
                    sharpen_claws();
                    //System.out.println("точит когти");
                    //System.out.println(satiety);

                    break;
                case 4:
                    climb();
                    //System.out.println("лазает");
                    //System.out.println(satiety);

                    break;
                case 5:
                    sleep();
                    //System.out.println("спит");
                    //System.out.println(satiety);

                    break;
                /*case 6:
                    eat();
                    //System.out.println("ест");
                    //System.out.println(satiety);

                    break;*/
            }


        }
        return true;
    }


    private boolean jump()    {
        satiety-=25;
        if (satiety>0) {
            System.out.println("прыгает");
            return true;
        }
        else {
            satiety =100;
            System.out.println("хочу есть. покорми меня. спасибо, поел");
            return false;
        }

    }


    private boolean lick_itself()    {
        satiety-=10;
        if (satiety>0) {
            System.out.println("облизывается");
            return true;
        }
        else {
            satiety =100;
            System.out.println("хочу есть. покорми меня. спасибо, поел");
            return false;
        }
    }


    private boolean sharpen_claws()      {
        satiety-=15;
        if (satiety>0) {
            System.out.println("точит когти");
            return true;
        }
        else {
            satiety =100;
            System.out.println("хочу есть. покорми меня. спасибо, поел");
            return false;
        }
    }


    private boolean sleep()    {
        satiety-=5;
        if (satiety>0) {
            System.out.println("спит");
            return true;
        }
        else {
            satiety =100;
            System.out.println("хочу есть. покорми меня. спасибо, поел");
            return false;
        }
    }


    private boolean climb()    {
        satiety-=20;
        if (satiety>0) {
            System.out.println("лазает");
            return true;
        }
        else {
            satiety =100;
            System.out.println("хочу есть. покорми меня. спасибо, поел");
            return false;
        }
    }


    private void eat(int satiety)    {
        satiety=100;

    }

    private void eat(int satiety, String food)    {
        satiety=100;
        food = "kitekat";


    }

    private void eat()    {
        eat();
    }
}
