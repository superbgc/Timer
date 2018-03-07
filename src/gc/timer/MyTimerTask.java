package gc.timer;

import java.util.TimerTask;

/**
 * 定时任务
 * @author Superb
 *   定义定时任务需要继承TimerTask类
 */
public class MyTimerTask extends TimerTask{
	private String name;
	//打印当前name的内容
	public MyTimerTask(String name) {
		// TODO Auto-generated constructor stub
		this.name=name;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Current exec name is:"+name);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
