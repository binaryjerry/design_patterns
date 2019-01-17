package adapter.object;

/**
 * @author Jerry
 * @date 2019/1/17
 */
public class Adaper{

    private Adapee adapee;

    public Adaper(Adapee adapee) {
        this.adapee = adapee;
    }

    public void func1(){
        //直接委派给adapee对象
        adapee.func1();
    }

    public void func2(){
        //手动补充2
    }
}
