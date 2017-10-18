package cn.itheima.mybatis.po;

public class Singleton {
	/**public static void main(String[] args) {
		//创建Singleton对象不能通过构造器，只能通过getInstance方法
		Singleton s1 = new Singleton.getInstance();
		Singleton s2 = new Singleton.getInstance();
		System.out.println(s1==s2);
		//使用一个变量来缓存曾经创建的实例
		Singleton instance;
		//将构造器使用private修饰，隐藏该构造器
		private void Singleton(){
			System.out.println("Singleton被构造！");
		}
		//提供一个静态方法，用于返回Singleton实例
		//该方法可以加入自定义的控制，保证只产生一个Singleton对象
		public static Singleton getInstance(){
			
		}
		
		
	}*/

}
