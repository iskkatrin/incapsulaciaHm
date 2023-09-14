public class Hufflepuff extends Student {
    private int hardworking;
    private int loyal;
    private int honest;

    public Hufflepuff (String name, int magicPower, int transgressionDistance, int hardworking, int loyal, int honest) {
        super(name, magicPower, transgressionDistance);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public void getDescription() {
        System.out.println("Качества Хаффлпаффа:");
        System.out.println("Трудолюбивость: " + hardworking);
        System.out.println("Лояльность: " + loyal);
        System.out.println("Честность: " + honest);
    }
}