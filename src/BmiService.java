public class BmiService {
    public int calculate(int kg, double h) {
        int index;
        index = (int) (kg / (h * h));
        return index;
    }
}
