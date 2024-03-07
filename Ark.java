import java.util.ArrayList;

public class Ark {

    static ArrayList<Animal> arkWareHouse = new ArrayList<>();
    private static int numTotAnimales = 0;

    public static void Store(Animal animal) { // Directamente la clase Animal
        arkWareHouse.add(animal);
        numTotAnimales++;

        animal.move();
        animal.stop();

        System.out.println(
                "Acaba de entrar un/una " + animal.getSpecie() + " y ahora hay un total de: " + getNumTotAnimales()
                        + " animales en el arca.");
    }

    public static int getNumTotAnimales() {
        return numTotAnimales;
    }

    public static void setNumTotAnimales(int numTotAnimales) {
        Ark.numTotAnimales = numTotAnimales;
    }
}
