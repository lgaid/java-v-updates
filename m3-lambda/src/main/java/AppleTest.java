import java.util.ArrayList;
import java.util.List;

public class AppleTest {


    public static void main(String[] args) {

        List<Apples> inventory = new ArrayList<>();
        inventory.add(new Apples(300,Color.GREEN));
        inventory.add(new Apples(100,Color.RED));
        inventory.add(new Apples(200,Color.GREEN));
        inventory.add(new Apples(50,Color.RED));

       AppleHeavyPredicate abc = new AppleHeavyPredicate();
       List<Apples> heavyApple = filterApples(inventory,abc);
        System.out.println(heavyApple);


        List<Apples> greenApple = filterApples(inventory,new AppleGreenColorPredicate());


        System.out.println(greenApple);

        ApplePredicate weightApple = (Apples apples) ->apples.getWeight() > 200;
        filterApples(inventory,weightApple);

    }
private static List<Apples> filterApples(List<Apples> inventory, ApplePredicate applePredicate){

        List<Apples> result = new ArrayList<>();
    for (Apples apples : inventory) {
        if (applePredicate.test(apples)) {
            result.add(apples);
        }
    }
    return result;
}


}
