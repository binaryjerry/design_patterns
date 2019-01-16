package decorator;

/**
 * @author Jerry
 * @date 2019/1/16
 */
public class SwimCar extends SuperCar{


    public SwimCar(Icar icar) {
        super(icar);
    }

    public void swim(){
        System.out.println("我会游泳");
    }

    @Override
    public void move() {
        super.move();
        swim();
    }
}
