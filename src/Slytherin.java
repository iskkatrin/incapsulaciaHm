public class Slytherin extends Student {

    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstForPower;

    public Slytherin(String name, int magicPower, int transgressionDistance, int cunning, int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(name, magicPower, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\n Хитрость " + getCunning()
                + "\n Решительность " + getDetermination()
                + "\n Амбициозность" + getAmbition()
                + "\n Находчивость " + getResourcefulness()
                + "\n Жажда власти " + getThirstForPower();
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }


    public void compareSlytherinStudents(Slytherin student2) {

        int sumStudent1 = this.getCunning() + this.getDetermination() + this.getAmbition() + this.getResourcefulness() + this.getThirstForPower();
        int sumStudent2 = student2.getCunning() + student2.getDetermination() + student2.getAmbition() + student2.getResourcefulness() + student2.getThirstForPower();
        if (sumStudent1 > sumStudent2) {
            System.out.println(this.getName() + " - лучший Слизеринец, чем student2.getName()");
        } else if (sumStudent1 < sumStudent2) {
            System.out.println(student2.getName() + " - лучший Слизеринец, чем this.getName()");
        } else {
            System.out.println("Ученики Слизерина имеют одинаковую сумму свойств");
        }
    }

}