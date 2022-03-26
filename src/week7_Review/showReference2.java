package week7_Review;

public class showReference2 {

	
		
		private void printThis(){
	         
	        System.out.println("hello");
	        
	    }
	    
	    public void printThis(String x) {
	        
	        System.out.println(x);
	    }
	    private String privateStr=";";
	    public String pubString="";
	    protected String protectedStr="";
	    
	    protected void printThis(String x,String x2) {
	    	System.out.println(x+x2);
	    }
		
	public int thisReturns1() {
		return 1;
	}
	public int thisReturns1or2(int x) {
		if(x%2==0) {
			return 1;
		}else {
			return 2;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
