public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();

        double h = 1.80; // рост в метрах.
        int m = 70; // Вес в кг.
        int index = (int) service.calculate(h,m);
        System.out.println("Индекс массы тела: " + index);


    }

}
