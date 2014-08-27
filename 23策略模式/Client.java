interface Strategy{
	public double cost(double money); //���ݴ���ȥ�ļ۸񣬷���һ��ȷ�еļ۸���Ϊ���ռ۸��������������
}

class PuTong implements Strategy{//ԭ����ֱ��������ƴ����

	@Override
	public double cost(double money)
	{
		return money*0.8;//��ͨ��Ա��8��
	}
	
}

class Super implements Strategy{

	@Override
	public double cost(double money)
	{
		
		return money*0.6; //�ƽ��Ա���6��
	}
	
}

public class Client{
	public static void main(String[] args)
	{
		Strategy strategy = new Super();//�����õ��ǳ�����Ա��
		System.out.println("ԭ��100������������Ҫ����"+strategy.cost(100)); //������100�᲻����˵�ٺ�
		
		strategy = new PuTong();
		System.out.println("ԭ��30������������Ҫ��: "+strategy.cost(30)); //��ͨ��������ۣ�����������~~
	}
}

