public class Context {
  
    private Strategy strategy; //������ԵĶ���
	
    // ���캯�������Դ���һ��������Զ���
    public Context(Strategy strategy){
        this.strategy = strategy;
    }
   
    public void contextInterface(){
        
        strategy.strategyInterface(); //������Context��Ҫʹ��ĳ�����Զ���ķ�����
    }
    
	public void setStrategy(Strategy strategy){
		 this.strategy = strategy;
	}
	
	public Strategy getStrategy(){
		return strategy;
	}
}