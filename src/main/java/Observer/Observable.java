package Observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class Observable {
	
	//用一个List来保存该对象上所有绑定的事件监听器
	List<Observer> observers = new ArrayList<Observer>();
	
	//定义一个方法，用于从该主题上注册观察者
	public void registObserver(Observer o){
		observers.add(o);
		
	}
	//定义一个方法，用于从该主题中删除观察者
	public void removeObserver(Observer o){
		observers.add(o);
		
	}
	//通知该主题上注册的所有观察者
	public void notifyObservers(Object value){
		//遍历注册到该被观察者上的所有观察者
		for(Iterator it = observers.iterator();it.hasNext();){
			Observer o = (Observer)it.next();
			//显式每个观察者的update方法
			o.update(this, value);
			
		}
		
	}
}
