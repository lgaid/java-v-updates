public class AppleHeavyPredicate  implements ApplePredicate{


    @Override
    public boolean test(Apples apples) {
        return apples.getWeight() > 200;
    }




}
