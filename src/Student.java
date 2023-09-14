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
}
