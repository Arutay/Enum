package Transport;

public enum Weight {

    N1(0D,3.5),
    N2(3.5,12D),
    N3(12D, 0.0);

    private final double from;
    private final double to;

    Weight(double from, double to) {
        this.from = from;
        this.to = to;
    }


    public double getFrom() {
        return from;
    }

    public double getTo() {
        return to;
    }
}
