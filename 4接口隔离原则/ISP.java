/**
 * ���Գ�����
 * @author zhonghuan
 */
interface Exam
{
	public void chinese();//������
	public void math();//����ѧ
}

/**
 * ��������Խӿ�
 */
interface ScienceExam{
	public void physics();//������
}

/**
 * �Ŀ������Խӿ�
 */
interface LiberalArtExam{
	public void geolography();//������
}

/**
 * �Ŀ�������ʵ����
 * @author zhonghuan
 */
class ExamForLiberalArtStu implements Exam,LiberalArtExam
{
	public void chinese()
	{
		System.out.println("������");
	}

	public void math()
	{
		System.out.println("����ѧ");
	}

	public void geolography()
	{
		System.out.println("������");
	}
}

/**
 * ���������ʵ����
 * @author zhonghuan
 */
class ExamForScienceStu implements Exam,ScienceExam
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
}

class LiberalArtStu
{
	public ExamForLiberalArtStu exam;
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
	public ExamForScienceStu exam;
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