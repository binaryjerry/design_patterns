package decorator;

/**
 * @author Jerry
 * @date 2019/1/16
 */
public class FlyCar extends SuperCar{

    public FlyCar(Icar icar) {
        super(icar);
    }

    public void fly(){
        System.out.println("我可以上天");
    }

    @Override
    public void move() {
        super.move();
        fly();
    }
}
