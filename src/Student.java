public class Student {

    private String name;
    private int magicPower;
    private int transgressionDistance;

    public Student(String name, int magicPower, int transgressionDistance) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;

    }

    public String getName() {
        return name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void getDescription() {
        System.out.println("Имя: " + getName());
        System.out.println("Магическая сила: " + getMagicPower());
        System.out.println("Расстояние трансгрессии: " + getTransgressionDistance());
    }

    public void compareStudents (Student student1,Student student2) {
        int sumStudent1 = student1.getMagicPower() + student1.getTransgressionDistance();
        int sumStudent2 = student2.getMagicPower() + student2.getTransgressionDistance();
        if (sumStudent1 > sumStudent2) {
            System.out.println("Грегори Гойл обладает большей мощностью магии, чем Финч-Флетчли. ");
        } else {
            System.out.println("Финч-Флетчли обладает большей мощностью магии, чем Грегори Гойл . ");
        }
    }
}
