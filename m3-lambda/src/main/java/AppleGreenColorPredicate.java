public class AppleGreenColorPredicate implements ApplePredicate {


    @Override
    public boolean test(Apples apples) {
        return apples.getColor().equals(Color.GREEN);
    }

}
