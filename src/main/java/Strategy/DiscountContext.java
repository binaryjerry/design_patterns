package Strategy;

public class DiscountContext {
	//组合一个DiscountStrategy对象
	private DiscountStrategy strategy;
	//构造器，传入一个DiscountStrategy对象
	public DiscountContext(DiscountStrategy strategy){
		this.strategy = strategy;
		
	}
	
	//根据实际所使用的DiscountStrategy对象得到折扣价
	public double getDiscountPrice(double price){
		
		//如果strategy为null，系统自动选择OldDiscount类
		if(strategy == null){
			strategy = new OldDiscount();
			
		}
		return this.strategy.getDiscount(price);
		
		
	}
	//提供切换算法的方法
	public void setDiscount(DiscountStrategy strategy){
		this.strategy = strategy;
		
	}

}
