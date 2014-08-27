import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

//������Ԫ��ɫ
abstract class Flyweight {
	abstract public void show(String state);// ������һ��show��������������չʾ��ĸ
}

class ConcreteFlyweight extends Flyweight {
	private Character intrinsicState = null;// �ڲ�״̬

	// ���캯�����ڲ�״̬��Ϊ��������ȥ
	public ConcreteFlyweight(Character state) {
		intrinsicState = state;
	}

	// �����ⲿ״̬��չʾ
	public void show(String state) {
		System.out.println("����  " + intrinsicState + "    ��ǰ����Ϊ��" + state);
	}
}

class FlyweightFactory {
	private HashMap<Character,Flyweight> map = new HashMap<Character,Flyweight>(); // �����洢��Ԫ����

	public FlyweightFactory() {
	}

	// ������Ԫ����ķ������ڲ�״̬��Ϊ��������
	public Flyweight factory(Character state) {
		if (map.containsKey(state)) {
			return map.get(state);
		} else {
			Flyweight ft = new ConcreteFlyweight(state);
			map.put(state, ft);
			return ft;
		}
	}

	// ������Ԫ
	public void checkFlyweight(){
		System.out.println("=========checkFlyweight==================");
		int i=0;
		for(Iterator it = map.entrySet().iterator();it.hasNext();i++){
			Map.Entry e = (Map.Entry)it.next();
			System.out.println("��"+i+"���ǣ�"+e.getKey());
		}
		System.out.println("=========checkFlyweight==================");
	}
}

public class Client {
	FlyweightFactory factory = new FlyweightFactory();
	
	void run(){
		Flyweight fly = factory.factory(new Character('a'));
		fly.show("����");// ���a������ĸ�ʽ
		fly = factory.factory(new Character('b'));
		fly.show("xx��");// ���b��xx��ĸ�ʽ
		factory.checkFlyweight();
	}
	public static void main(String[] args) {
		new Client().run();
	}
}
