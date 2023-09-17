public class Gryffindor extends Student{
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name, int magicPower, int transgressionDistance, int nobility, int honor, int bravery) {
        super(name, magicPower, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public void getDescription() {
        super.getDescription();
        System.out.println("Гриффиндорские качества:");
        System.out.println("Благородство: " + nobility);
        System.out.println("Честь: " + honor);
        System.out.println("Храбрость: " + bravery);
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void compareGryffindorStudents(Gryffindor student1, Gryffindor student2) {
        int sumStudent1 = student1.getNobility() + student1.getHonor() + student1.getBravery();
        int sumStudent2 = student2.getNobility() + student2.getHonor() + student2.getBravery();
        if (sumStudent1 > sumStudent2) {
            System.out.println(student1.getName() + " - лучший Гриффиндорец, чем Гермиона");
        } else if (sumStudent1 < sumStudent2) {
            System.out.println(student2.getName() + " - лучший Гриффиндорец, чем Гарри Поттер");
        } else {
            System.out.println("Ученики Гриффиндора имеют одинаковую сумму свойств");
        }
    }


}