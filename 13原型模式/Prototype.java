interface Prototype extends Cloneable {//ʵ��cloneable�ӿ�
	public Prototype clone();//���������ԭ������ȥʵ��
}

class ConcretePrototype implements Prototype{
	public Prototype clone(){//����ʵ���Լ���clone����
		Prototype prototype = null;  
        try{  
            prototype = (Prototype)super.clone();  
        }catch(CloneNotSupportedException e){  
            e.printStackTrace();  
        }  
        System.out.println("�ɹ��õ�һ��ԭ�͸���Ʒ");
        return prototype;   
	}
}

class Client{
	Prototype prototype=new ConcretePrototype();
	void getPrototype(){
		Prototype pt=prototype.clone();//ͨ��ԭ�ͣ��õ�һ���µ�ԭ��
	}
}

public class Main{
	public static void main(String[] args){
		new Client().getPrototype();
	}
}
