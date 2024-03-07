public class Giraffe extends Animal {

    private double height;

    public Giraffe(String specie, String sex, String name, double height) {
        super(specie, sex, name);
        this.height = height;
    }

    @Override
    public void move() {
        System.out.println("La jirafa se mueve hacia el arca.");

    }

    @Override
    public void stop() {
        System.out.println("La jirafa para de moverse.");
    }

    @Override
    public String toString() {

        return "The height of the giraffe is" + getHeight();
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
