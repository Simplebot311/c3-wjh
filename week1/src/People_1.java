/**
 * @author yufeng1900
 * @create 2021-01-23 15:40
 */
public class People_1 {
    private double weight;
    private double height;
    private double BMI;

    public People_1(double weight, double height) {
        this.weight = weight;
        this.height = height;
        this.BMI = weight/(height*height);
    }

    public double getBMI() {
        return BMI;
    }
}
