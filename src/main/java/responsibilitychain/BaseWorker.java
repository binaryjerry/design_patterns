package responsibilitychain;

/**
 * @author Jerry
 * @date 2018/10/26
 * 描述：责任链工作者基类
 */
public abstract class BaseWorker {

    protected BaseWorker nextWorker;

    public BaseWorker getNextWorker() {
        return nextWorker;
    }

    public void setNextWorker(BaseWorker nextWorker) {
        this.nextWorker = nextWorker;
    }
}
