public class Ravenclaw extends Student {
    private int smart;
    private int wise;
    private int witty;
    private int FullOfCreativity;

    public Ravenclaw (String name, int magicPower, int transgressionDistance, int smart, int wise, int witty, int FullOfCreativity) {
        super(name, magicPower, transgressionDistance);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.FullOfCreativity = FullOfCreativity;
    }

    public void getDescription() {
        System.out.println("Качества Когтеврана:");
        System.out.println("Ум: " + smart);
        System.out.println("Мудрость: " + wise);
        System.out.println("Остроумие: " + witty);
        System.out.println("Полнота креатива: " + FullOfCreativity);
    }
}