package gc.timer;

import java.util.TimerTask;

/**
 * ��ʱ����
 * @author Superb
 *   ���嶨ʱ������Ҫ�̳�TimerTask��
 */
public class MyTimerTask extends TimerTask{
	private String name;
	//��ӡ��ǰname������
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
