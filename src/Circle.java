import java.util.Objects;

public class Circle extends Figure{
    private double r;
    @Override
    double square(){
        return (Math.PI*r*r);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.r, r) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(r);
    }
    public Circle(double r){
        this.r=r;
    }
}
