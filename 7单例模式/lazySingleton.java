public class Singleton
{
	private static Singleton singleton;

	private Singleton()
	{
	}
	//ע������synchronized����֤���̰߳�ȫ,��˼����ÿ��ֻ��һ���߳��ܹ����ʸ÷���
	public static synchronized Singleton getInstance()
	{
		if (singleton == null) 
		{//��singletonҪ�õ�ʱ��ų�ʼ�������жϱ����ظ���ʼ������ֻ֤new��һ��
			singleton = new Singleton();
		}
		return singleton;
	}
}
