public class Hogwarts {
    public static void main(String[] args) {

        Gryffindor harryPotter = new Gryffindor("Гарри Поттер", 100, 200, 5, 10, 15);
        Gryffindor hermioneGranger = new Gryffindor("Гермиона Грейнджер", 90, 180, 20, 25, 30);
        Gryffindor ronWeasley = new Gryffindor("Рон Уизли", 80, 160, 35, 40, 50);
        Slytherin dracoMalfoy = new Slytherin("Драко Малфой", 70, 140, 55, 60, 65, 70, 75);
        Slytherin grahamMontague = new Slytherin("Грэхэм Монтегю", 60, 120, 80, 85, 90, 95, 100);
        Slytherin gregoryGoyle = new Slytherin("Грегори Гойл", 50, 100, 1, 2, 3, 4, 5);
        Hufflepuff zachariasSmith = new Hufflepuff("Захария Смит", 40, 80, 6, 7, 8);
        Hufflepuff cedricDiggory = new Hufflepuff("Седрик Диггори", 30, 60, 9, 10, 1);
        Hufflepuff justinFinchFletchley = new Hufflepuff("Джастин Финч-Флетчли", 20, 40, 2, 3, 4);
        Ravenclaw choChang = new Ravenclaw("Чо Чанг", 10, 20, 5, 6, 7, 8);
        Ravenclaw padmaPatil = new Ravenclaw("Падма Патил", 5, 10, 9, 10, 1, 2);
        Ravenclaw marcusBelby = new Ravenclaw("Маркус Белби", 2, 4, 3, 4, 5, 6);


        harryPotter.getDescription();
        hermioneGranger.getDescription();
        ronWeasley.getDescription();
        dracoMalfoy.getDescription();
        grahamMontague.getDescription();
        gregoryGoyle.getDescription();
        zachariasSmith.getDescription();
        cedricDiggory.getDescription();
        justinFinchFletchley.getDescription();
        choChang.getDescription();
        padmaPatil.getDescription();
        marcusBelby.getDescription();

    }
}