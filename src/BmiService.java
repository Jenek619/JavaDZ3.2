public class BmiService {

    public double calculate (double h, int m){
        double index;
        index = (int) m/(h*h);
        return index;
    }

}
