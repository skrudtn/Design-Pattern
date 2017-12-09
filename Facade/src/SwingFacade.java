
public class SwingFacade {
	private Frame f;
	private Panel p;
	private Label l;
	private Textbox t;
	private ComboBox c;
	public SwingFacade() {
		f = new Frame();
		p = new Panel();
		l = new Label();
		t = new Textbox();
		c = new ComboBox();
	}
	
	public void generateSwing(String str) {
		// TODO Auto-generated method stub
		switch(str) {
		case "text":
			System.out.println("�ؽ�Ʈȭ�� �����");
			f.on();
			p.on();
			t.on();
			break;

		case "combo":
			System.out.println("�޺��ڽ�ȭ�� �����");
			f.on();
			p.on();
			c.on();
			break;

		case "label":
			System.out.println("��ȭ�� �����");
			f.on();
			p.on();
			l.on();
			break;

		case "init":
			System.out.println("���� �ʱ�ȭ");
			f.off();
			p.off();
			l.off();
			c.off();
			t.off();
			break;
		}
		
	}

}
