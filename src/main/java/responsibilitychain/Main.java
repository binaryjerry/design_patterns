package responsibilitychain;

/**
 * @author Jerry
 * @date 2018/10/26
 * 描述：主流程方法
 */
public class Main {

    public static void main(String[] args) {
        WorkerOne workerOne = new WorkerOne();
        workerOne.setNextWorker(new WorkerTwo());
    }
}
