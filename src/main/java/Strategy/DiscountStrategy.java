package Strategy;

public interface DiscountStrategy {
	//策略模式用于封装系列的算法，这些算法通常被封装在一个被称为Context的类中，
	//客户端程序可以自由选择其中一种算法，或让Context为客户端选择一种最佳算法
	//————使用策略模式的优势是为了支持算法的自由切换。
	
	//定义一个用于计算打折价的方法
	double getDiscount(double originPrice);
	
	
	

}
