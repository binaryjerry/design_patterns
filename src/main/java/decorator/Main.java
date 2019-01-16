package decorator;

/**
 * @author Jerry
 * @date 2019/1/16
 */
public class Main {



    public static void main(String[] args) {
        TargetCar targetCar = new TargetCar();
        SwimCar swimCar = new SwimCar(new FlyCar(targetCar));
        swimCar.move();
    }

}
