interface Beverage{
	String description = "unknown beverage";
	public String getDescription();//����������
	public double cost();//���ؼ۸��
}

class CoffeeBean1 implements Beverage{
	String description = "ѡ�˿��ȶ�1��";
	public String getDescription(){
		return description;
	}
	public double cost(){
		return 30;//�����۸�30Ԫ
	}
}

class CoffeeBean2 implements Beverage{
	String description = "ѡ�˿��ȶ�2:";
	public String getDescription(){
		return description;
	}
	public double cost(){
		return 28;//�����۸�28Ԫ
	}
}

class Decorator implements Beverage{
	String description = "unknown װ��";
	Beverage beverage;
	public String getDescription(){
		return description;
	}
	public double cost(){
		return 0;//�����������������װ�μ۸�
	}
}

class Milk extends Decorator{
	String description = "����ţ��";
	public Milk(Beverage beverage){
		this.beverage=beverage;
	}
	public String getDescription(){
		return beverage.getDescription()+"\n"+description;//���б�װ���ߵ�����
	}
	public double cost(){
		return 5+beverage.cost();//��ţ�̵ļ۸���5Ԫ,���ü�������beverage�ļ۸�
	}
}
class Soy extends Decorator{
	String description = "���˶���";
	public Soy(Beverage beverage){
		this.beverage=beverage;
	}
	public String getDescription(){
		return beverage.getDescription()+"\n"+description;//���б�װ���ߵ�����
	}
	public double cost(){
		return 4+beverage.cost();//�Ӷ����ļ۸���4Ԫ,���ü�������beverage�ļ۸�
	}
}
class Mocha extends Decorator{
	String description = "����Ħ��";
	public Mocha(Beverage beverage){
		this.beverage=beverage;
	}
	public String getDescription(){
		return  beverage.getDescription()+"\n"+description;//���б�װ���ߵ�����
	}
	public double cost(){
		return 6+beverage.cost();//��Ħ���ļ۸���6Ԫ,���ü�������beverage�ļ۸�
	}
}

public class Main{
	public static void main(String[] args){
		Beverage coffee=new CoffeeBean1();//һ��ʼѡ�˿��ȶ�1
		coffee=new Mocha(coffee);//����Ħ��
		coffee=new Milk(coffee);//����ţ��
		System.out.println(coffee.getDescription());
		System.out.println("���ȵļ۸�Ϊ:"+coffee.cost());
	}
}


