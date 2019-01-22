package zhy;

/**
 * @author: zhangocean
 * @Date: 2019/1/21 21:33
 * Describe:
 */
public class HelloService {

	private String text;

	public void setText(String text) {
		this.text = text;
	}

	public void print(){
		System.out.println(text);
	}

}
