package edu.uprm.ece.icom4035.polynomial;

import java.util.Iterator;

import edu.uprm.ece.icom4035.list.List;

public class PolynomialImp implements Polynomial {
	private List<Term> list;
	
	

	public PolynomialImp(String poly) {
		this.list = new TermListFactory().newListFactory().newInstance();
		listMaker(poly);
	}
	public PolynomialImp() {
		this.list = new TermListFactory().newListFactory().newInstance();
	}

	
	private void listMaker(String a) {
		String [] str =a.split("\\+");
		
		for(int i =0;i<str.length;i++) {
			//System.out.println(list);
			if(str[i].contains("x")&& str[i].contains("^")&&(str[i].substring(0,str[i].indexOf("x")).length()<1)){
				list.add(new TermImp(1,Integer.parseInt(str[i].substring(str[i].indexOf("x")+2))));
			}
			else if(str[i].contains("x")&& !str[i].contains("^")&&(str[i].substring(0,str[i].indexOf("x")).length()<1)){
				list.add(new TermImp(1,1));
			}
			else if(str[i].contains("x")&& str[i].contains("^")) {
				if(Double.parseDouble(str[i].substring(0,str[i].indexOf("x")))==0)continue;
				list.add(new TermImp(Double.parseDouble(str[i].substring(0,str[i].indexOf("x"))),Integer.parseInt(str[i].substring(str[i].indexOf("x")+2))));
			}
			else if (str[i].contains("x")&& !str[i].contains("^")) {
				if(Double.parseDouble(str[i].substring(0,str[i].indexOf("x")))==0)continue;
				list.add(new TermImp(Double.parseDouble(str[i].substring(0,str[i].indexOf("x"))),1));
			}
			else if (!str[i].contains("x")&& !str[i].contains("^")) {
				
				list.add(new TermImp(Double.parseDouble(str[i]),0));
			}
		}
	}
	
	@Override
	public Iterator<Term> iterator() {
		return this.list.iterator();
	}

	@Override
	public Polynomial add(Polynomial P2) {
		PolynomialImp x = (PolynomialImp)P2;
		PolynomialImp tmp = new PolynomialImp();
		int i=0;
		int j=0;
		while(i<this.list.size()) {
			while(j<x.list.size()) {

				if(this.list.get(i).getExponent()<x.list.get(j).getExponent()) {
					tmp.list.add(new TermImp( x.list.get(j).getCoefficient(), x.list.get(j).getExponent() ) );
					j++;
					
				}
				else if(this.list.get(i).getExponent()>x.list.get(j).getExponent()){
					tmp.list.add(new TermImp( this.list.get(i).getCoefficient(), this.list.get(i).getExponent() ) );
					i++;
					
				}
				else {
					if(this.check(this.list.get(i).getCoefficient()+x.list.get(j).getCoefficient())){
						j++;
						i++;
					}
					tmp.list.add(new TermImp( this.list.get(i).getCoefficient()+x.list.get(j).getCoefficient() , this.list.get(i).getExponent() ) );
					j++;
					i++;
				}
			}
		}
		
		return tmp;
	}

	@Override
	public Polynomial subtract(Polynomial P2) {
		PolynomialImp tmp = new PolynomialImp();
		PolynomialImp x = (PolynomialImp)P2;
		if(this.equals(P2)) {
			tmp.list.add(new TermImp(0,0));
			return tmp;}
		for(int i=0;i<x.list.size();i++) {
			tmp.list.add(new TermImp(-1*( x.list.get(i).getCoefficient()), x.list.get(i).getExponent() ) );
		}
		
		return this.add(tmp);
	}

	@Override
	public Polynomial multiply(Polynomial P2) {
		PolynomialImp x = (PolynomialImp)P2;
		PolynomialImp tmp = new PolynomialImp();
		PolynomialImp tmp2 = new PolynomialImp();
		for(int i=0;i<this.list.size(); i++) {
			for (int j=0; j<x.list.size(); j++) {
				tmp.list.add(new TermImp(this.list.get(i).getCoefficient() * x.list.get(j).getCoefficient(), this.list.get(i).getExponent() + x.list.get(j).getExponent()));
			}
		}
			tmp2= this.sort(tmp);
			return tmp2;
	}
	
	@Override
	public Polynomial multiply(double c) {
		PolynomialImp x = new PolynomialImp();
		for(int i =0;i<this.list.size();i++) {
			if(this.check(this.list.get(i).getCoefficient()*c))continue;
			x.list.add(new TermImp((this.list.get(i).getCoefficient()*c),this.list.get(i).getExponent()));
			
		}
		if(x.list.isEmpty())x.list.add(new TermImp(0,0));
		return x;
	}
	

@Override
	public Polynomial derivative() {
		PolynomialImp x = new PolynomialImp();
		for(int i = 0; i < this.list.size()-1; i++) {
			if(this.check(this.list.get(i).getCoefficient()*(this.list.get(i).getExponent())))continue;
			x.list.add(new TermImp((this.list.get(i).getCoefficient()*(this.list.get(i).getExponent())),this.list.get(i).getExponent()-1));
		}
		if (x.list.isEmpty())
			x.list.add(new TermImp(0,0));
		return x;
	}

	@Override
	public Polynomial indefiniteIntegral() {
		PolynomialImp x = new PolynomialImp();
		for(int i=0; i<this.list.size();i++) {
			if(this.check(this.list.get(i).getCoefficient()))
					continue;
			x.list.add(new TermImp((this.list.get(i).getCoefficient()/ ((this.list.get(i).getExponent()) +1)),this.list.get(i).getExponent()+1));
			if((i+1) == this.list.size())
				x.list.add(new TermImp(1,0));
		}
		if (x.list.isEmpty())
			x.list.add(new TermImp(0,0));
		return x;
	}

	@Override
	public double definiteIntegral(double a, double b) {
		PolynomialImp x = new PolynomialImp();
		for(int i=0; i<this.list.size();i++) {
			if(this.check(this.list.get(i).getCoefficient()))
					continue;
			x.list.add(new TermImp((this.list.get(i).getCoefficient()/ ((this.list.get(i).getExponent()) +1)),this.list.get(i).getExponent()+1));
			if((i+1) == this.list.size())
				x.list.add(new TermImp(1,0));
		}
		if (x.list.isEmpty())
			x.list.add(new TermImp(0,0));
		double ult=x.evaluate(b);		
		double first=x.evaluate(a);
		return ult-first;
	}

	@Override
	public int degree() {
		return this.list.first().getExponent();
	}

	@Override
	public double evaluate(double x) {
		double sum=0;
		for (int i=0;i<list.size();i++) {
				sum+= list.get(i).getCoefficient()*Math.pow(x, list.get(i).getExponent());
		}
		return sum;
	}

	@Override
	public boolean equals(Polynomial P) {
		if(this.toString().equals(P.toString()))return true;
		return false;
	}
	public String toString() {
		String tmp= new String();
		for(int i=0;i<this.list.size();i++) {
			if (this.list.get(i).getExponent()>1) {
				Double doo = (this.list.get(i).getCoefficient());
				String str = String.format("%.2f", doo);
				tmp+=str+"x^"+Integer.toString(this.list.get(i).getExponent())+"+";
			}
			else if(this.list.get(i).getExponent()==1) {
				Double doo = (this.list.get(i).getCoefficient());
				String str = String.format("%.2f", doo);
				tmp+=str+"x+";
			}
			else {
				Double doo = (this.list.get(i).getCoefficient());
				String str = String.format("%.2f", doo);
				tmp+= str;
			}
		}
		
		return tmp;
	}
	public boolean check(double x) {
		return x==0;
	}

	private PolynomialImp sort(PolynomialImp P) {
		PolynomialImp r = new PolynomialImp();
		int i=0;
		int j;
		int coef = 0;
		while (i<P.list.size()) {
			j=i+1;
			coef += P.list.get(i).getCoefficient();
			while (j<P.list.size()) {
				if(P.list.get(i).getExponent() == P.list.get(j).getExponent()) {
					coef+= P.list.get(j).getCoefficient();
					P.list.remove(j);
					continue;
				}
				j++;
			}
			if(coef!=0) r.list.add(new TermImp(coef, P.list.get(i).getExponent()));
			i++;
			coef = 0;
		}
		if(r.list.isEmpty()) {
			r.list.add(new TermImp(0,0));
		}
		r = r.degreeSort(r);
		return r;
	}
	
	private PolynomialImp degreeSort(PolynomialImp P) {
		PolynomialImp r = new PolynomialImp();
		int max;
		while(!P.list.isEmpty()) {
			int i=0;
			max = i;
			while(i<P.list.size()) {
				if(P.list.get(max).getExponent()<P.list.get(i).getExponent()) {
					max = i;
				}
				i++;
			}
			r.list.add(P.list.get(max));
			P.list.remove(max);
		}
		return r;
	}

}
