package gc.timer;

import java.util.Timer;
/**
 * ������ʱ��
 * @author Superb
 *
 */
public class MyTimer {
	public static void main(String[] args) {
		//������ʱ��
		Timer timer=new Timer(true);
		//��������
		MyTimerTask task=new MyTimerTask("No.1");
		//ִ������ ��2���ʼ   ÿ��ִ��һ��
		timer.schedule(task, 2000l, 1000l);
	}
}
