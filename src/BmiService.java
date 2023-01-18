public class BmiService {
    public double calculate(int weight, double height, int age) {
        double bmi = weight / (height * height); // расчет bmi
        return bmi;
    }
}
