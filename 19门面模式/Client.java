class ModuleA {
    //ʾ�ⷽ��
    public void doFirst(){
        System.out.println("��ɵ�һ��");
    }
}

class ModuleB {
    //ʾ�ⷽ��
    public void doSecond(){
        System.out.println("KO�ڶ���");
    }
}

class ModuleC{
	public void doThird(){
		System.out.println("��������ɱ��");
	}
}
//�������ɫ
class Facade {
    //ʾ�ⷽ��������ͻ�����Ҫ�Ĺ���
    public void doSth(){
        ModuleA a = new ModuleA();
        a.doFirst();
        ModuleB b = new ModuleB();
        b.doSecond();
        ModuleC c = new ModuleC();
        c.doThird();
		System.out.println("���Խ���");
    }
}
//�ͻ��˽�ɫ
public class Client{
	public static void  main(String[] args){
		Facade tem = new Facade();
		tem.doSth();
	}
}