package Strategy;

public class OldDiscount implements DiscountStrategy {

	@Override
	public double getDiscount(double originPrice) {
		// 重写getDiscount()方法，提供旧书打折算法
	
		System.out.println("使用旧书折扣...");
		return originPrice*0.7;
	}
		
		
	}


