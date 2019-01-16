package decorator;

/**
 * @author Jerry
 * @date 2019/1/16
 */
public class SuperCar implements Icar{

    private Icar icar;

    public SuperCar(Icar icar) {
        this.icar = icar;
    }

    @Override
    public void move() {
        icar.move();
    }
}
