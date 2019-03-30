import java.util.Objects;

public class Square extends Figure{
    private double a;
    @Override
    double square() {
        return (a*a);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return Double.compare(square.a, a) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a);
    }
    public Square(double a){
        this.a =a;
    }
}
