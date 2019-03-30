import java.util.Objects;

public class Pram extends Figure {
    private double a;
    private double b;

    @Override
    double square() {
        return (a * b);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pram pram = (Pram) o;
        return Double.compare(pram.a, a) == 0 &&
                Double.compare(pram.b, b) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }

    public Pram(double a, double b) {
        this.a = a;
        this.b = b;
    }
}
