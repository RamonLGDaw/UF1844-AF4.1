public class OopFlop {
    public static void main(String[] args) {

        Ark arca = new Ark();

        Giraffe jirafa1 = new Giraffe("jirafa", "male", "jirafa1", 3.5);
        Lion leon1 = new Lion("Leon", "H", "Leon1", "carne");
        Sheep oveja1 = new Sheep("Sheep", "M", "Oveja1", "Beeeeee", "hierba");

        arca.Store(jirafa1);
        arca.Store(leon1);
        arca.Store(oveja1);

        System.out.println("\nEl leon se alimenta de " + leon1.getFeeding());
        System.out.println("El oveja se alimenta de " + oveja1.getFeeding());
        System.out.println("La jirafa mide: " + jirafa1.getHeight() + " metros de altura.");
    }
}
