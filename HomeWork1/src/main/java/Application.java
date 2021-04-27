import model.Kotik;

public class Application {

    public static void main(String[] args) {
        Kotik sam = new Kotik(1, "Sam", 5, "Cat is playing");
        Kotik tom = new Kotik();
        tom.setKotik(2, "Tom", 7, "Cat is sleeping!");

        if(sam.getMeow().equals(tom.getMeow()))
            System.out.println("Коты мяукают одинаково");
        else
            System.out.println("Коты мяукают по-разному " + sam.getName() + " - " + sam.getMeow() + "; "  + tom.getName() + " - " + tom.getMeow());

        System.out.println("Кот: " + sam.getName() + " весит " + sam.getWeight() + "кг");
        sam.liveAnotherDay();
        System.out.println("Количество котов: " + Kotik.getObjectCounter());
    }
}