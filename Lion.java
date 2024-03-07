public class Lion extends Animal {

    private String feeding;

    public Lion(String specie, String sex, String name, String feeding) {
        super(specie, sex, name);
        this.feeding = feeding;
    }

    @Override
    public void move() {
        System.out.println("El león se mueve hacia el arca.");
    }

    @Override
    public void stop() {
        System.out.println("El león deja de moverse.");

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
