package polynomial;

public class TermImp implements Term{
	private Double co;
	private Integer ex;
    
    public TermImp(Double c,Integer e) {
    	co=c;
    	ex=e;
    }
	@Override
	public double getCoefficient() {
	   
	    
		return co;
	}

	@Override
	public int getExponent() {
	
		return ex;
	}

	@Override
	public double evaluate(double x) {
		double result= co*Math.pow(x,ex);
		return result;
	}
	

}
