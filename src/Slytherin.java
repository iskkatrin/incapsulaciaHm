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

    public void getDescription() {
        super.getDescription();
        System.out.println("Слизеринские качества:");
        System.out.println("Хитрость: " + cunning);
        System.out.println("Решительность: " + determination);
        System.out.println("Амбициозность: " + ambition);
        System.out.println("Находчивость: " + resourcefulness);
        System.out.println("Жажда власти: " + thirstForPower);
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


    public void compareSlytherinStudents(Slytherin student1, Slytherin student2) {
        int sumStudent1 = student1.getCunning() + student1.getDetermination() + student1.getAmbition() + student1.getResourcefulness() + student1.getThirstForPower();
        int sumStudent2 = student2.getCunning() + student2.getDetermination() + student2.getAmbition() + student2.getResourcefulness() + student2.getThirstForPower();
        if (sumStudent1 > sumStudent2) {
            System.out.println(student1.getName() + " - лучший Слизеринец, чем Грэхэм Монтегю");
        } else if (sumStudent1 < sumStudent2) {
            System.out.println(student2.getName() + " - лучший Слизеринец, чем Драко Малфой");
        } else {
            System.out.println("Ученики Слизерина имеют одинаковую сумму свойств");
        }
    }


}