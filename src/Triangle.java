import java.util.Objects;

public class Triangle extends Figure {
    private double a,c,b;
    @Override
    double square() {
        return(Math.sqrt(((a+b+c)/2)*(((a+b+c)/2)-a)*(((a+b+c)/2)-b)*(((a+b+c)/2)-c)));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.a, a) == 0 &&
                Double.compare(triangle.c, c) == 0 &&
                Double.compare(triangle.b, b) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, c, b);
    }

    public Triangle(double a, double c, double b) {
        this.a = a;
        this.c = c;
        this.b = b;
    }
}
