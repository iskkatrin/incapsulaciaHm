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

    @Override
    public String toString() {
        return super.toString()
                + "\n Трудолюбивость " + getHardworking()
                + "\n Лояльность " + getLoyal()
                + "\n Честность" + getHonest() ;
    }


    public int getHardworking() {
        return hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public int getHonest() {
        return honest;
    }

    public void compareHufflepuffStudents(Hufflepuff student2) {

        int sumStudent1 = this.getHardworking() + this.getLoyal() + this.getHonest();
        int sumStudent2 = student2.getHardworking() + student2.getLoyal() + student2.getHonest();
        if (sumStudent1 > sumStudent2) {
            System.out.println(this.getName() + " - лучший Пуффендуйец, чем student2.getName()");
        } else if (sumStudent1 < sumStudent2) {
            System.out.println(student2.getName() + " - лучший Пуффендуйец, чем this.getName()");
        } else {
            System.out.println("Ученики Слизерина имеют одинаковую сумму свойств");
        }
    }

}
