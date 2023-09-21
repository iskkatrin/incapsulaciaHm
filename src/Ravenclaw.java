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

    @Override
    public String toString() {
        return super.toString()
                + "\n Ум " + getSmart()
                + "\n Мудрость" + getWise()
                + "\n Остроумие " + getWitty()
                + "\n Полнота креатива " + getFullOfCreativity();
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



    public void compareRavenclawStudents(Ravenclaw student2) {

        int sumStudent1 = this.getSmart() + this.getWise() + this.getWitty() + this.getFullOfCreativity();
        int sumStudent2 = student2.getSmart() + student2.getWise() + student2.getWitty() + student2.getFullOfCreativity();
        if (sumStudent1 > sumStudent2) {
            System.out.println(this.getName() + " - лучший Когтевранец, чем student2.getName()");
        } else if (sumStudent1 < sumStudent2) {
            System.out.println(student2.getName() + " - лучший Когтевранец, чем this.getName()");
        } else {
            System.out.println("Ученики Когтевранец имеют одинаковую сумму свойств");
        }
    }


}