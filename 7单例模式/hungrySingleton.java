public class Singleton
{
	private static Singleton singleton = new Singleton();//������˱��ʼ���õ�������
														//֮���Գ�֮Ϊ����ʽ����Ϊ��̫����
	private Singleton()
	{
	}
	public static Singleton getInstance()
	{
		return singleton;
	}
}
