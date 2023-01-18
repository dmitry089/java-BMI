public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int age = 35;// возраст
        int weight = 68; // вес
        double height = 1.77; //рост
        double bmi = service.calculate(weight, height, age); //расчет bmi
        String bmiResult = String.format("%.2f", bmi);
        System.out.println("Ваш возраст : " + age + "лет");
        System.out.println("Ваши Вес : " + weight + " кг");
        System.out.println("Ваш Рост : " + height + " м");
        System.out.println(bmiResult + " кг/см2");

    }
}

