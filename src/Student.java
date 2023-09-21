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

    @Override
    public String toString() {
        return "Имя: " + getName() +
                "\n Магическая сила: " + getMagicPower() +
                "\n Расстояние трансгрессии: " + getTransgressionDistance();
    }


    public void compareStudents(Student student) {
        int sumThisStudent = this.getMagicPower() + this.getTransgressionDistance();
        int sumOtherStudent = student.getMagicPower() + student.getTransgressionDistance();
        if (sumThisStudent > sumOtherStudent) {
            System.out.println(this.getName() + " обладает большей мощностью магии, чем " + student.getName());
        } else {
            System.out.println(student.getName() + " обладает большей мощностью магии, чем " + this.getName());
        }

    }
}
