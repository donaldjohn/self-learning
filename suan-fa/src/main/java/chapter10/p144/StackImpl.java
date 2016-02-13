/**
 * 
 */
package chapter10.p144;

/**
 * ջʵ�� �Ƚ������ʵ�ֻ���
 * 
 * @author snoopy
 *
 */
public class StackImpl {

	private static String[] str;
	private int top = 0;// ��ǰջ��λ��
	private final int max_size;

	public StackImpl() {
		this(100);
	}

	public StackImpl(int size) {
		str = new String[size];
		this.max_size=size;
	}

	public boolean isEmpty() {
		if (size() == 0) {
			return true;
		} else {
			return false;
		}
	}

	public synchronized boolean push(String s) {
		if (top >= max_size) {
			return false;
		}
		str[top] = s;
		top++;

		return true;
	}

	public synchronized String pop() {
		if (isEmpty()) {
			return "underflow";
		} else {
			top = top - 1;
			return str[top];
		}
	}

	public synchronized int size() {
		return top;
	}

}
