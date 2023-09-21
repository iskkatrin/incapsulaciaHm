public class Gryffindor extends Student {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name, int magicPower, int transgressionDistance, int nobility, int honor, int bravery) {
        super(name, magicPower, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return super.toString() + "\n Благородство " + getNobility() + "\n Честь " + getHonor() + "\n Храбрость" + getBravery();
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


    public void compareGryffindorStudents(Gryffindor student2) {

        int sumStudent1 = this.getNobility() + this.getHonor() + this.getBravery();
        int sumStudent2 = student2.getNobility() + student2.getHonor() + student2.getBravery();
        if (sumStudent1 > sumStudent2) {
            System.out.println(this.getName() + " - лучший Гриффиндорец, чем student2.getName()");
        } else if (sumStudent1 < sumStudent2) {
            System.out.println(student2.getName() + " - лучший Гриффиндорец, чем this.getName()");
        } else {
            System.out.println("Ученики Гриффиндора имеют одинаковую сумму свойств");
        }
    }

}