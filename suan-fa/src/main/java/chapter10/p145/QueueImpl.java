/**
 * 
 */
package chapter10.p145;

/**
 * ����ʵ�֣��Ƚ��ȳ�ʵ�ֻ���
 * 
 * @author snoopy
 *
 */
public class QueueImpl {

	private int head = 0;
	private int tail = 0;
	private String[] Q;

	private final int max_size;

	public QueueImpl(int size) {
		Q = new String[size];
		this.max_size = size;
	}

	public QueueImpl() {
		this(100);
	}

	// ���
	public synchronized boolean enqueue(String s) {
		if (tail >= max_size) {
			return false;
		}
		Q[tail] = s;
		tail++;
		return true;
	}
	//����
	public synchronized String dequeue(){
		String str=null;
		if(head<tail){
			str=Q[head];
		}		 
		head++;	
		if(head==max_size){
			head=0;
		}
		return str;
	}
	
	
	
}
