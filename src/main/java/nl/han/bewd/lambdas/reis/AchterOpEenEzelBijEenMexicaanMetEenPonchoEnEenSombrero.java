package nl.han.bewd.lambdas.reis;

public class AchterOpEenEzelBijEenMexicaanMetEenPonchoEnEenSombrero implements VervoerStrategy {
    @Override
    public int berekenReistijd(boolean isReisTijdensSpits) {
        if (isReisTijdensSpits) {
            return 268; //de ezel is bang van auto's
        } else {
            return 25;
        }
    }
}
