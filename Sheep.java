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
        System.out.println("La oveja se mueve hacia el arca.");
        
    }

    @Override
    public void stop() {
        System.out.println("La oveja deja de moverse.");
        
    }

    @Override
    public String toString() {
        return "La oveja se alimenta de " + getFeeding();
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
