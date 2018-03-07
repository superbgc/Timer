package gc.timer;

import java.util.Timer;
/**
 * 启动定时器
 * @author Superb
 *
 */
public class MyTimer {
	public static void main(String[] args) {
		//创建定时器
		Timer timer=new Timer(true);
		//声明任务
		MyTimerTask task=new MyTimerTask("No.1");
		//执行任务 格2秒后开始   每秒执行一次
		timer.schedule(task, 2000l, 1000l);
	}
}
