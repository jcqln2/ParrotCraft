import java.util.Random;

/**
 * This is a Parrot object class to simulate pet behaviour.
 * This class models parrot-related interactions like flying, feeding, and
 * checking status of attributes like isTamed and isAlive.
 * This class demonstrates basic object-oriented principles and uses concepts such as:
 * encapsulation and input validation.
 *
 * @author : Jacqueline Robinson
 * */
public class Parrot {
    /**
     * Name of the Parrot pet
     * */
    private String name;
    /**
     * Health of Parrot (range: 0.0 to 5.0).
     * */
    private double health;
    /**
     * Crumbs to feed parrot in kg
     * */
    private double crumbs;
    /**
     * Whether or not parrot is tamed
     * */
    private boolean isTamed;
    /**
     * Is parrot alive or not
     * */
    private boolean isAlive;


    /**
     * Method that Feeds pet parrot. If the parrot becomes overfed, it may become sick.
     * @param foodInKg is amount of food to feed parrot
     * */
    public void feedParrot(double foodInKg){
        this.health += foodInKg;
        if(isSick(this.health)){
            System.out.println("Parrot is sick");
        }
    }
    /**
     * Method that causes parrot to fly
     * @param isTamed lets user know if parrot is tamed and allows certain actions
     * */
    public void makeFly(boolean isTamed){

    }
    /**
     * Method that causes parrot to stay
     * @param isTamed lets user know if parrot is tamed and allows certain actions
     * */
    public void makeStay(boolean isTamed){

    }
    /**
     * Method that hits the parrot
     * @param hits is amount of time user needs to hit parrot
     * */
    public void hitParrot(int hits){

    }

    /**
     * Method that tells user the health status of the parrot being sick or not
     * @param health is parrot's current health value
     * */
    public boolean isSick(double health){
        boolean isSick = false;
        if(health < 1.0 || health > 3.0){
            isSick = true;
        }

        return  isSick;
    }
    /**
     * Method that tells user the health status of being sick or not
     * @param health is parrot's current health value
     * */
    public boolean isTamed(){
        boolean isTamed = Math.random() < 0.5;
        System.out.println(isTamed);
        return  isTamed;
    }
    /**
     * Method that tells user the  status of being sick or not
     * @param health is parrot's current health value
     * */
    public boolean isAlive(double health) {
        boolean isAlive = true;
        if(health <= 0.0){
            isAlive = false;
        }
        return isAlive;
    }

    /**
     * This method returns a joke related to birds
     * @return A joke
     */
    public String tellAJoke(){
        String[] jokes = {
                "What do you call a lost parrot? \n A polygon",
                "What do you call two black birds that stick together? \n Vel-Crows",
                "Why do hummingbirds hum? \nThey don’t know the lyrics"
        };
        Random random = new Random();
        int randomIndex = random.nextInt(jokes.length);
        return jokes[randomIndex];
    }



    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public void setTamed(boolean tamed) {
        isTamed = tamed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    /**
     * Constructor for Parrot with default values such as name "Petey",
     * full health, and set to alive and tamed.
     */
    public Parrot(){
        this.name = "Petey";
        this.health = 3.0;
        this.isTamed = true;
        this.isAlive = true;
    }
    /**
     * Creates a customized Parrot object
     *
     * @param name the name of the parrot
     * @param health the initial health value
     * @param isTamed whether the parrot is tamed
     * @param isAlive whether the parrot is alive
     */
    public Parrot(String name, double health, boolean isTamed, boolean isAlive){
        this.name = name;
        this.health = health;
        this.isTamed = isTamed;
        this.isAlive = isAlive;
    }

    /**
     * Returns a short summary of the parrot's current state
     * @return string report
     */
    @Override
    public String toString() {
        return "Parrot Report"+"\n--------------"+ "\nName:"+
                this.name + "\nHealth: "+
                this.health +"\nisTamed: "+
                this.isTamed +"\nisAlive:  "+ this.isAlive;
    }
}
