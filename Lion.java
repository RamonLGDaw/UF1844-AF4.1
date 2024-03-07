public class Lion extends Animal {

    private String feeding;

    public Lion(String specie, String sex, String name, String feeding) {
        super(specie, sex, name);
        this.feeding = feeding;
    }

    @Override
    public void move() {
        System.out.println("The lion moves into the Ark.");
    }

    @Override
    public void stop() {
        System.out.println("The lion stops moving");
        
    }

    @Override
    public String toString() {
        
        return "The lion eats " + getFeeding();
    }

    public String getFeeding() {
        return feeding;
    }

    public void setFeeding(String feeding) {
        this.feeding = feeding;
    }
}
