
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int kg = 68;
        double h = 1.68;
        int myBmi = service.calculate(68,1.68);
        System.out.println(myBmi);

    }
}