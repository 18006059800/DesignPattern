interface Duck{
	public void quack();//Ѽ�����ɽ�
	public void fly();//Ѽ�ӻ��
}

class MallardDuck implements Duck{
	public void quack(){
		System.out.println("Ѽ�����ɽ�");
	}
	public void fly(){
		System.out.println("������ͷѼ�������ڷ���");
	}
}

interface Turkey{
	public void gobble();
	public void fly();
}

class WildTurkey implements Turkey{
	public void gobble(){
		System.out.println("�𼦿�����");
	}
	public void fly(){
		System.out.println("���ǻ𼦣������ڷɣ����Ƿɲ�Զ");
	}
}

class TurkeyAdapter implements Duck{
	Turkey turkey;//�������Ҫ�����Ļ�
	public TurkeyAdapter(Turkey turkey){
		this.turkey=turkey;//��ʼ��ʱ��������������Ҫð��Ļ�
	}
	public void quack(){
		turkey.gobble();//�𼦲������ɽУ�ֻ���ÿ�������������
	}

	public void fly(){
		for(int i=0;i<5;i++){
			turkey.fly();//�𼦷ɵò�Զ�����Զ�ɼ��������档
		}
	}
}

public class Main{
	public static void main(String[] args){
		WildTurkey turkey=new WildTurkey();//�ȴ���һֻ��
		Duck turkeyAdapter = new TurkeyAdapter(turkey);//������������װ�����
		//����������ͺ���һ��Ѽ��һ������quack����fly
		turkeyAdapter.quack();
		turkeyAdapter.fly();
	}
}