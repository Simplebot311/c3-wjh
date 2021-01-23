/**
 * @author yufeng1900
 * @create 2021-01-23 15:39
 */
public class Circle_5 {
    private double radius;
    private double area;
    private double perimeter;


    public Circle_5(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        area = Math.PI*radius*radius;
        return area;
    }

    public double getPerimeter() {
        perimeter = Math.PI*2*radius;
        return perimeter;
    }
}
