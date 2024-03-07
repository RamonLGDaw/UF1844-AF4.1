public class OopFlop {
    public static void main(String[] args) {

        Giraffe jirafa1 = new Giraffe("jirafa", "M", "jirafa1", 3.5);
        Lion leon1 = new Lion("Leon", "H", "Leon1", "carne");
        Sheep oveja1 = new Sheep("Oveja", "M", "Oveja1", "Beeeeee", "hierba");

        Ark.Store(jirafa1);
        Ark.Store(leon1);
        Ark.Store(oveja1);

        System.out.println("\nEl leon se alimenta de " + leon1.getFeeding());
        System.out.println(oveja1.toString());
        System.out.println("La jirafa mide: " + jirafa1.getHeight() + " metros de altura.");
    }
}
