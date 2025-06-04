/**
 * Controller class that uses the Parrot  class
 *
 */
public class ParrotController {
    /**
     * Instantiate the 3 parrots that will be used
     */
    Parrot p;
    Parrot parrotFriend1;
    Parrot parrotFriend2;

    /**
     * Constructor for parrot controller class. Three parrots will be created so this takes 3 parrots as params
     * @param p is the first parrot
     * @param parrotFriend1 is the second parrot
     * @param ParrotFriend2 is the third parrot
     */
    public ParrotController(Parrot p, Parrot parrotFriend1, Parrot parrotFriend2){
        this.p = p;
        this.parrotFriend1 = parrotFriend1;
        this.parrotFriend2 = parrotFriend2;
    }

    /**
     * Feeds a parrot
     * This calls the getCrumbs() and setCrumbs() from parrot class to increase crumbs and to determine if parrot is sick
     * This calls the getHealth() to make decisions about what to include in the return message
     * This calls the increaseHealth() from parrot to increase health
     * This calls the decreaseHealth() from parrot to decrease health if parrot is fed too much
     * This calls the getName() from parrot to customize the return string message
     * This calls the getTamedStatus() to determine whether to randomly tame the parrot
     * This calls the setAlive() if parrot dies
     * @param p is the parrot that is being fed
     * @return string message to give user some feedback
     */
    public String feed(Parrot p){
        String returnMessage = " ";

        //if random isTamed is true, let player know
        if(p.getTamedStatus()== false && p.tameRandomly()) {
            p.setTamed(true);
            returnMessage +=  p.getName() + " is now tamed!";
        }
        //Cover parrot getting sick use case
        if(p.getCrumbs()>=3.0){
            p.lowerHealth(1);
            returnMessage += p.getName()+ " is sick, he ate too much";
        }

        else {
            p.setCrumbs();
            p.increaseHealth(1);
            returnMessage += p.getName() + " is eating ";
        }
        return returnMessage;
    }

    /**
     * Method that hits the parrot
     * @param p is the parrot object that will suffer a hit
     * */
    public String hitParrot(Parrot p){
        String returnMessage = "";
        if(p.isAlive()) {
            p.lowerHealth(1);
            //if health goes to 0 or under, set parrot to dead
            if (p.getHealth() <= 0) {
                p.setAlive(false);
                returnMessage += "Sorry your parrot is dead and can't take any hits";
            }
            returnMessage += p.getName() +  "'s health went down :( ";
            // Set parrot Alive status to dead if health goes below 1
        }
        if(!p.isAlive()){
            returnMessage = "Sorry your parrot is dead and can't take any hits";
        }

        return returnMessage;
        }

    /**
     * Lets this parrot play with another parrot.
     * If both parrots are tamed, they become untamed after playing.
     * @param other the other parrot to play with
     */
    public String playWith(Parrot p, Parrot other) {
        String returnMessage = " ";

        if (!p.getTamedStatus() ||!other.getTamedStatus()){
            returnMessage += "Your parrots must both be tamed to play together";
        }else{
            returnMessage += "·.¸¸.·´´¯`··._."+ p.getName() + " and " + other.getName() + " played together! ·.¸¸.·´´¯`··._. \nThey are now both untamed.";
            p.setTamed(false);
            other.setTamed(false);
        }
        if(!p.isAlive()){
            returnMessage = "Sorry, either "+ p.getName() + " or "+ other.getName() +" is dead and can't play";
        }
        return returnMessage;
    }

    /**
     *Make parrot sit if it's tamed.
     * @param p is the parrot that will be sitting.
     * Parrot can only be either flying or sitting but not both, so isFlying(), setFlying() and setSitting() are used
     * @return string message for feedback
     */
    public String makeSit(Parrot p) {
        String returnMessage = " ";

        if (!p.getTamedStatus()){
            returnMessage += "Your parrot must be tamed to be able to sit";
        }else if(p.isFlying()){
            p.setSitting(true);
            p.setFlying(false);
        }else{
            returnMessage += "·.¸¸.·´´¯`··._."+ p.getName() + " is sitting ·.¸¸.·´´¯`··._. ";
            p.setSitting(true);
        }
        return returnMessage;
    }

    /**
     * Make parrot fly if it's tamed.
     * @param p is the parrot that will be flying.
     * Parrot can only be either flying or sitting but not both, so isSitting(), setSitting() and setFlying() are used
     * @return string message for feedback
     */
    public String makeFly(Parrot p) {
        String returnMessage = " ";

        if (!p.getTamedStatus()){
            returnMessage += "Your parrot must be tamed to be able to fly on command";
        }else if(p.isSitting()){
            p.setSitting(false);
            p.setFlying(true);
        }else{
            returnMessage += "·.¸¸.·´´¯`··._."+ p.getName() + " is flying ·.¸¸.·´´¯`··._. ";
            p.setFlying(true);
        }
        return returnMessage;
    }

    /**
     * Call tostring method from parrot class to output parrot stats
     * @param parrots is array of parrots passed in from view class
     * @return string report of parrot stats
     */
    public String parrotReport(Parrot[] parrots){
        String report = "";
        for(Parrot p : parrots){
            report += p.toString();
        }
        return report;
    }


}


