package observer.concrete;

import observer.OnClickListener;
import target.Button;

public class ButtonOnClickListener implements OnClickListener {

	@Override
	public void onClick(Button button) {
		System.out.println(button.getName() + " ��ư�� Ŭ���߽��ϴ�!");
	}

}
