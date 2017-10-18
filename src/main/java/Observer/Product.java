package Observer;

public class Product extends Observable {
	//被观察类，具体主题，是一个实现主题接口的类，该类包含了会经常
	//发生变化的数据，而且还有一个集合，该集合存放是观察者的引用。
	
	
	//定义两个属性
	private String name;
	private double price;
	
	
	
	
	
	
	public Product() {
		//super();
	}
	public Product(String name, double price) {
		//super();
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	
	//当程序调用name的setter方法来修改Product的name属性时
	//程序自然触发该对象上注册的所有观察者
	public void setName(String name) {
		this.name = name;
		notifyObservers(name);
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
		notifyObservers(price);
	}

}
