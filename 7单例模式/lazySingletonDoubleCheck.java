public class Singleton
{
	private static Singleton instance = null;

	private Singleton()
	{
		// dosomething
	}

	public static Singleton getInstance()
	{
		if (instance == null)
		{
			synchronized (Singleton.class)//����˼��һ�£�Ϊʲô�������Ч��
			{
				if (null == instance)
				{
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
}
/*
 Double check ��д����
	1 ��һ��������˵�����ʵ�������ˣ��ǾͲ���Ҫͬ���ˣ�ֱ�ӷ��ؾͺ��ˡ�
	2 ��Ȼ�����ǾͿ�ʼͬ���̡߳�
	3 �ڶ���������˵�������ͬ�����߳��У���һ���̴߳����˶�����ô����߳̾Ͳ����ٴ����ˡ�

*/
