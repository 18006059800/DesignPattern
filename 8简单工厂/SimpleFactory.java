class fruit{
	
}
class apple extends fruit{
	public apple(){
		System.out.println("������һ��ƻ��");
	}
}

class banana extends fruit{
	public banana(){
		System.out.println("������һ���㽶");
	}
}

class Factory{
	//ͨ���������Ĳ���str������������ʲô��Ʒ
	public fruit create(String str){
		if(str.equals("apple"))
			return new apple();
		if(str.equals("banana"))
			return new banana();
		return null;
	}
}

public class Main{
	public static void main(String[] args){
		Factory fac=new Factory();
		apple a=(apple)fac.create("apple");//����apple������apple
		banana b=(banana)fac.create("banana");
	}
}