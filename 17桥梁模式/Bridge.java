abstract class Furniture
{
	abstract void turnOn();

	abstract void turnOff();
}

class TV extends Furniture
{
	void turnOn()
	{
		System.out.println("���Ӵ���");
	}

	void turnOff()
	{
		System.out.println("���ӹر���");
	}
}

class Computer extends Furniture
{
	void turnOn()
	{
		System.out.println("���Դ���");
	}

	void turnOff()
	{
		System.out.println("���Թر���");
	}
}

class Light extends Furniture
{
	void turnOn()
	{
		System.out.println("��ƴ���");
	}

	void turnOff()
	{
		System.out.println("��ƹر���");
	}
}

abstract class OnOff
{ // ���󿪹���
	Furniture fur;

	abstract void turnOn();

	abstract void turnOff();

	void set(Furniture fur)
	{
		this.fur = fur;
	}
}

// �ֻ�����
class SmartPhone extends OnOff
{
	void turnOn()
	{
		fur.turnOn();
		System.out.println("���ֻ�����");
	}

	void turnOff()
	{
		fur.turnOff();
		System.out.println("���ֻ��ص�");
	}
}

// ���ӿ���
class TVOnOFF extends OnOff
{
	void turnOn()
	{
		fur.turnOn();
		System.out.println("�õ����ϵİ�ť����");
	}

	void turnOff()
	{
		fur.turnOff();
		System.out.println("�õ����ϵİ�ť�ص�");
	}
}

// ���Կ���
class ComputerOnOff extends OnOff
{
	void turnOn()
	{
		fur.turnOn();
		System.out.println("�õ��԰�ť����");
	}

	void turnOff()
	{
		fur.turnOff();
		System.out.println("�õ��԰�ť�ص�");
	}
}

// ��ƿ���
class LightOnOff extends OnOff
{
	void turnOn()
	{
		fur.turnOn();
		System.out.println("�õ�ư�ť����");
	}

	void turnOff()
	{
		fur.turnOff();
		System.out.println("�õ�ư�ť�ص�");
	}
}
