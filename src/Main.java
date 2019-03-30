import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String [] agrs){
//        abstract class Figure{ Абстрактный класс      в нем нет объекта
//          private int funsquare(){}
//          он ничего не делает
//       если abstact не можешь создать Figure f = new Figure;
//        } но можно делать для потомков и использовать эти методы(объединения)
        List<Figure> fs=new ArrayList<>();
        Figure square1 = new Square(5);
        Figure square2 = new Circle(3);
        Figure square3 = new Triangle(1,2,3);
        Figure square4 = new Pram(4,5.6);
        fs.add(square1);
        fs.add(square2);
        fs.add(square3);
        fs.add(square4);
        for(int i=0;i<fs.size();++i){
            System.out.println(fs.get(i).square());
        }

    }
}
