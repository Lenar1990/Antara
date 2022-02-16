package model;
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

    public liveAnotherDay() {

    }

    private boolean jump()    {
        return true;
    }


    private boolean lick_itself()    {
        return true;
    }


    private boolean sharpen_claws()      {
        return true;
    }


    private boolean sleep()    {
        return true;
    }


    private boolean climb()    {
        return true;
    }


    private void eat()    {
        satiety++;
        if (satiety==100) {
            System.out.println("I am full");
        }
    }



}
