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
        super.getDescription();
        System.out.println("Качества Когтеврана:");
        System.out.println("Ум: " + smart);
        System.out.println("Мудрость: " + wise);
        System.out.println("Остроумие: " + witty);
        System.out.println("Полнота креатива: " + FullOfCreativity);
    }


    public int getSmart() {
        return smart;
    }

    public int getWise() {
        return wise;
    }

    public int getWitty() {
        return witty;
    }

    public int getFullOfCreativity() {
        return FullOfCreativity;
    }


    public void compareRavenclawStudents(Ravenclaw student1, Ravenclaw student2) {
        int sumStudent1 = student1.getSmart() + student1.getWise() + student1.getWitty() + student1.getFullOfCreativity();
        int sumStudent2 = student2.getSmart() + student2.getWise() + student2.getWitty() + student2.getFullOfCreativity();
        if (sumStudent1 > sumStudent2) {
            System.out.println(student1.getName() + " - лучший Когтевранец, чем Падма Патил");
        } else if (sumStudent1 < sumStudent2) {
            System.out.println(student2.getName() + " - лучший Когтевранец, чем Чо Чанг");
        } else {
            System.out.println("Ученики Когтеврана имеют одинаковую сумму свойств");
        }
    }
}