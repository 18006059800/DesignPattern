import java.util.ArrayList;

abstract class Component
{
    protected String name; //���������ʾһ�½ڵ�
    public Component(String name)
    {
        this.name = name;
    }
 
    public abstract void add(Component c);//���Ӷ��ӽڵ�
    public abstract void remove(Component c);//ɾ�����ӽڵ�
}

class Leaf extends Component
{
    public Leaf(String name)
    {
       super(name);
    }
 
    public  void add(Component c)
    {
       System.out.println("Ҷ�ӽڵ㲻�������ӽڵ�");
    }
 
    public void remove(Component c)
    {
    	System.out.println("Ҷ�ӽڵ�û���ӽڵ㣬�Ƴ�����");
    }
}

class Composite extends Component
{
 
    ArrayList<Component> child;
 
    public Composite(String name)
    {
    	super(name);
        if (child == null)
        {
            child = new ArrayList<Component>();
        }
    }
 
    public void add(Component c)
    {
        this.child.add(c);
    }
 
    public void remove(Component c)
    {
        this.child.remove(c);
    }
}

public class Client{
	public static void main(String[] args)
	{
		Component tree=new Composite("A");//���ڵ�һ����composite�ڵ㣬�����ڵ�ȡ��A
		Component leafB=new Leaf("B");//������һ��Ҷ�ӽڵ�B
		tree.add(leafB);//���ڵ���һ��Ҷ�ӽڵ����
		
		Component branchC=new Composite("C");//һ����֦�ڵ�C
		tree.add(branchC);//��֦�ڵ�C�Ǹ��ڵ�A���ӽڵ�
		
		Component leafD = new Leaf("D");
		branchC.add(leafD);//��֦�ڵ�C��һ��Ҷ���ӽڵ�D
		
		//���ṹ���¹������
	}
}