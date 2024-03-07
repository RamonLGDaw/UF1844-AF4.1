public class Sheep extends Animal {

    private String sound;
    private String feeding;

    public Sheep(String specie, String sex, String name, String sound, String feeding) {
        super(specie, sex, name);
        this.sound = sound;
        this.feeding = feeding;
    }

    @Override
    public void move() {
        System.out.println("The sheep moves into de Ark");
        
    }

    @Override
    public void stop() {
        System.out.println("The sheep stops moving");
        
    }

    @Override
    public String toString() {
        return "The sheep eats " + getFeeding();
    }

    public void makeSound(){
        System.out.println("The sheep sounds like: " + this.sound);
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getFeeding() {
        return feeding;
    }

    public void setFeeding(String feeding) {
        this.feeding = feeding;
    }
}
