public class BmiService {
    public double calculate(int age, int weight, double height) {
        double bmi = weight / (height * height); // расчет bmi
        return bmi;
    }
}
