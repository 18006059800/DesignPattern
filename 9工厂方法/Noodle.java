interface InstantNoodle{
	void addOil();//��˼�Ǽ���
	void addPeiLiao();//��˼�Ǽ�����,ԭ�����ú���ƴ����ʾ
}

class HaiXian implements InstantNoodle{//��˼�Ǻ�����
	public HaiXian(){
		System.out.println("����һ��������");
	}
	public void addOil(){
		System.out.println("���˵���");
	}
	public void addPeiLiao(){
		System.out.println("���˵㺣�ʷ�ζ������");
	}
}

class HongShao implements InstantNoodle{//��˼�Ǻ�����
	public HongShao(){
		System.out.println("����һ��������");
	}
	public void addOil(){
		System.out.println("���˵��ͣ����������ζ���Ƚ���Ŷ��");
	}
	public void addPeiLiao(){
		System.out.println("����ĺ���������");
	}
}

public class Main{
	public static void main(String[] args){
		//�������ڶ��Ӷ��ˣ���ʼ����
		System.out.println("��Ҫ��ʼ����������");
		InstantNoodle noodle1=new HongShao();
		noodle1.addOil();
		noodle1.addPeiLiao();
		System.out.println("��������");
		System.out.println("-----------------------------------------------");
		
		//����һ������Ҫ�Ժ�����
		System.out.println("��Ҫ��ʼ����������");
		InstantNoodle noodle2=new HaiXian();
		noodle2.addOil();
		noodle2.addPeiLiao();
		System.out.println("��������");
		System.out.println("-----------------------------------------------");
		
	}
}
