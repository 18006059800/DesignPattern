/**
 * ���Գ�����
 * @author zhonghuan
 */
interface Exam
{
	public void chinese();//������

	public void math();//����ѧ

	public void physics();//������

	public void geolography();//������
}

/**
 * �Ŀ���ʵ�ֿ��Գ����࣬�Ŀ�����������
 * @author zhonghuan
 */
class ExamForLiberalArtStu implements Exam
{
	public void chinese()
	{
		System.out.println("������");
	}

	public void math()
	{
		System.out.println("����ѧ");
	}

	public void physics()
	{
		//"��������",  ����ʵ�֣� û������
	}

	public void geolography()
	{
		System.out.println("������");
	}
}

/**
 * �����ʵ�ֿ��Գ����࣬�������������
 * @author zhonghuan
 */
class ExamForScienceStu implements Exam
{
	public void chinese()
	{
		System.out.println("������");
	}

	public void math()
	{
		System.out.println("����ѧ");
	}

	public void physics()
	{
		System.out.println("������");
	}

	public void geolography()
	{
		//�����������������ʵ��û������
	}
}

class LiberalArtStu
{
	public Exam exam;
	public void test(){
		System.out.println("�Ŀ�����ʼ����:");
		exam.chinese();
		exam.math();
		exam.geolography();
		System.out.println("���Խ���");
		System.out.println();
	}
}

class ScienceStu
{
	public Exam exam;
	public void test(){
		System.out.println("�������ʼ����:");
		exam.chinese();
		exam.math();
		exam.physics();
		System.out.println("���Խ���");
		System.out.println();
	}
}

public class Main
{
	public static void main(String[] args)
	{
		LiberalArtStu stu1=new LiberalArtStu();  //new ��һ���Ŀ���
		stu1.exam=new ExamForLiberalArtStu(); 
		
		ScienceStu stu2=new ScienceStu();  // new ��һ�������
		stu2.exam=new ExamForScienceStu();
		
		stu1.test();//�������ʼ����
		stu2.test();//�Ŀ�����ʼ����
	}
}