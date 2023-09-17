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
        super.getDescription();
        System.out.println("Качества Хаффлпаффа:");
        System.out.println("Трудолюбивость: " + hardworking);
        System.out.println("Лояльность: " + loyal);
        System.out.println("Честность: " + honest);
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

    public void compareHufflepuffStudents(Hufflepuff student1, Hufflepuff student2) {
        int sumStudent1 = student1.getHardworking() + student1.getLoyal() + student1.getHonest();
        int sumStudent2 = student2.getHardworking() + student2.getLoyal() + student2.getHonest();
        if (sumStudent1 > sumStudent2) {
            System.out.println(student1.getName() + " - лучший Пуффендуйец, чем Седрик Диггори");
        } else if (sumStudent1 < sumStudent2) {
            System.out.println(student2.getName() + " - лучший Пуффендуйец, чем Захария Смит");
        } else {
            System.out.println("Ученики Пуффендуйя имеют одинаковую сумму свойств");
        }
    }
}
