package genericity;

public class TwoTuple<A,B> {
    public final A first;
    public final B second;
    public TwoTuple(A first, B second) {
        this.first = first;
        this.second = second;
    }
    @Override
    public String toString() {
        return "TwoTuple{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}
class ThreeTuple<A,B,C> extends TwoTuple<A,B> {

    public final C third;
    public ThreeTuple(A first, B second, C c) {
        super(first, second);
        third = c;
    }

}