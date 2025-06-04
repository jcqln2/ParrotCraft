/**
 * A Parrot object class to simulate pet parrot attributes
 *
 * */
public class Parrot {
    /**
     * Name of the Parrot pet
     * */
    private String name;
    /**
     * Health of Parrot measured in ints, range 0- 5. If he has more than 3.0 kgs in his stomach his health goes down
     * */
    private int health;
    /**
     * Crumbs to feed parrot in kg
     * */
    public double crumbs = 0.0;
    /**
     * Whether parrot is tamed
     * */
    private boolean isTamed;
    /**
     * Is parrot alive or not
     * */
    private boolean isAlive;
    /**
     * Is parrot sitting or not
     */
    private boolean isSitting;

    /**
     * Is parrot flying or not
     */
    private boolean isFlying;

    /**
     * This uses math.random to assign true or false to tame.
     * @return boolean to let someone know if a parrot is tamed or not
     */
    public boolean tameRandomly(){
        /* Will return true if the random number is between 0 and 0.5, false otherwise */
        boolean tame = (Math.random() < 0.50);
        return  tame;
    }

    /**
     *
     * @return boolean to let consumer know whether a parrot is alive or not.
     */
    public boolean isAlive() {
        return isAlive;
    }

    /**
     * This sets the parrot's alive status to true or false
     * @param alive
     */
    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    /**
     * This sets the parrot's tamed status to true or false
     * @param tamed
     */
    public void setTamed(boolean tamed) {
        isTamed = tamed;
    }

    /**
     * This helps someone know if a parrot is tamed or not
     * @return boolean for whether parrot is tamed or not
     */
    public boolean getTamedStatus(){
        return this.isTamed;
    }

    /**
     * This returns the name of the parrot
     * @return string of name of parrot
     */
    public String getName() {
        return name;
    }

    /**
     * This sets the name of a parrot
     * @param name is used to set name of parrot
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns health of a parrot measured in int units
     * @return health value
     */
    public int getHealth() {
        return this.health;
    }

    /**
     * Lowers health of parrot based on int health amount
     * @param health is how many health units to decrease for parrot
     */
    public void lowerHealth(int health) {
        this.health = this.health - health;
    }

    /**
     * Increases health of parrod based on int health amount
     * @param health is how many health units to increase for parrot
     */
    public void increaseHealth(int health) {
        this.health = this.health + health;
    }

    /**
     * Constructor for Parrot with default  name "Polly"
     */
    public Parrot(){
        this.name = "Polly";
        this.crumbs = 0.1;
        this.health = 3;
        this.isTamed = false;
        this.isAlive = true;
        this.isSitting = false;
        this.isFlying = true;

    }
    /**
     * Creates a customized Parrot object
     *
     * @param name will be the name of the parrot
     */
    public Parrot(String name){
        this.name = name;
        this.health = 3;
        this.isTamed = false;
        this.isAlive = true;
        this.crumbs = 0.1;
        this.isSitting = false;
        this.isFlying = true;

    }

    /**
     * Returns a short summary of a parrot's current state on Name, health, istamed, isAlive, isFlying, isSitting
     * and how many crumbs it has in its stomach
     * @return string report
     */
    @Override
    public String toString() {
        return "\nParrot Stats"+"\n--------------"+ "\nName:"+
                this.name + "\nHealth: "+
                this.health +"\nisTamed: "+
                this.isTamed +"\nisAlive:  "+ this.isAlive +
                "\nIs Flying: "+
                this.isFlying + "\nIs Sitting: "+
                this.isSitting + "\nHas this many crumbs in stomach: "+ this.crumbs +"\n";
    }

    /**
     * This is a hardcoded overloaded toString method because I wanted all the parrot stats to display horizontally
     * @param p is the first parrot object
     * @param p1 is the second parrot object
     * @param p2 is the third parrot object
     * @return String which is a report on all the parrot attributes such as name, health, isTamed, isAlive, isFlying, is
     * Sitting, has crumbs in stomach
     */
    public String toString(Parrot p, Parrot p1, Parrot p2) {
        return "Parrot Stats"+"\n----------------------------------------------------------------------"+ "\nName:"+
                p.getName() + "\t\t\t\t\t"+ "Name:"+p1.getName() + "\t\t\t\t"+ "Name:"+ p2.getName() +
                "\nHealth: "+
                p.getHealth() + "\t\t\t\t\t"+ "Health: "+ p1.getHealth() + "\t\t\t\t"+ "Health: "+ p2.getHealth() +"\t\t"	+"\nisTamed: "+
                p.getTamedStatus() + "\t\t\t\t"+ "isTamed: "+ p1.getTamedStatus() + "\t\t\t"+ "isTamed: "+ p2.getTamedStatus() +"\nisAlive:  "+
                p.isAlive() + "\t\t\t\t"+  "isAlive: "+ p1.isAlive() + "\t\t\t"+  "isAlive: "+ p2.isAlive() +
                "\nIs Flying: "+
                p.isFlying() + "\t\t\t\t"+ "isFlying: "+ p1.isFlying() + "\t\t\t"+ "isFlying: "+ p2.isFlying() + "\nIs Sitting: "+
                p.isSitting() + "\t\t\t"+ "isSitting: "+ p1.isSitting() + "\t\t"+ "isSitting: "+ p2.isSitting() +
                "\ncrumbs in stomach: "+ p.getCrumbs() +"kg "+ "\t"+  "crumbs in stomach: "+ p1.getCrumbs() +"kg "+
                "crumbs in stomach: "+  p2.getCrumbs()+"kg ";
    }

    /**
     * This sets the amount of crumbs in a parrot's stomach by increasing by 1
     */
    public void setCrumbs(){
        this.crumbs += 1;
    }

    /**
     * This returns how many crumbs are in a parrot's stomach
     * @return the crumb amount in double format
     */
    public double getCrumbs(){
        return this.crumbs;
    }

    /**
     * This sets the parrot's status of sitting to be true or false
     * @param sitting is a boolean to toggle a parrot sitting
     */
    public void setSitting(Boolean sitting){
        this.isSitting = sitting;
    }

    /**
     * This returns the boolean for whether a parrot is flying
     * @return boolean for if parrot is flying
     */
    public boolean isFlying(){
        return this.isFlying;
    }
    /**
     * This sets the parrot's status of flying to be true or false
     * @param flying is a boolean to toggle a parrot flying
     */
    public void setFlying(Boolean flying){
        this.isFlying = flying;
    }

    /**
     * This returns whether a parrot is sitting or not
     * @return boolean for parrot's sitting status
     */
    public boolean isSitting(){
        return this.isSitting;
    }

}
