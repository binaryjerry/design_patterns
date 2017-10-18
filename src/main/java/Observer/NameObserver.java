package Observer;

import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.JLabel;


//具体观察者：具体观察者是实现了观察者接口的一个类。具体观察者包含有可以存放
//具体主题引用的主题接口变量，以便具体观察者让具体
public class NameObserver implements Observer {
	//实现观察者必须实现的update方法
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		if(arg instanceof String){
			//产品名称改变值在name中
			String name = (String) arg;
			//启动一个JFrame窗口来显示被观察对象的状态改变
			JFrame f = new JFrame("观察者");
			JLabel l = new JLabel("名称改变为："+name);
			f.add(l);
			f.pack();
			f.setVisible(true);
			System.out.println("名称观察者："+o+"物品名称已经改变为："+name);
		}
		
	}

}
