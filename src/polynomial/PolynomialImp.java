package polynomial;

import java.util.Iterator;
import java.util.NoSuchElementException;

import list.ArrayList;
import list.List;
import list.ListFactory;

public class PolynomialImp extends TermListFactory implements Polynomial {
	private List<Term> list;

   
	
	   public PolynomialImp(String s) {        // constructor with parameter string
		   list = newListFactory().newInstance();
           termtoPolynomial(s);
           
           
      }

	   public PolynomialImp() {                       // constructor with out string, to get only new list
		   list = newListFactory().newInstance();
      }


	@Override
	public Iterator<Term> iterator() {  // iterator of terms
		// TODO Auto-generated method stub
		return new PolynomialIterator();
	}

	@Override
	public Polynomial add(Polynomial P2) {// this method add P2 to this and return P3
		Polynomial P3=new PolynomialImp(); // polynomial to return
		List<Term> list2= ((PolynomialImp)P2).list;
		List<Term> list3= ((PolynomialImp)P3).list;
		Iterator<Term> iter=((PolynomialImp)P2).list.iterator();
     	Iterator<Term> iter2=list.iterator();
		int curr=0;
		Double co;
		if(list.size()==list2.size()) {  //verify if the lists have the same size
		while(iter.hasNext()) {
		
			if(iter.next().getExponent()==iter2.next().getExponent()) {
				co=list.get(curr).getCoefficient()+list2.get(curr).getCoefficient();
				if(co!=0.00) {
				list3.add((new TermImp(co,list2.get(curr).getExponent())));
				}
				curr++;
			  }
		    }
		    }else {
			int curr1=0;
			if(list.size()<list2.size()) {  //verify if the this.list.size is less than list2.size
				while(iter2.hasNext()) {
				    int lpnum=list2.size();
					    for(int i=0; i<lpnum;i++) {
						if(list2.get(curr1).getExponent()==list.get(i).getExponent()) {  // if exponent equals add to the list
							
						co=list2.get(curr1).getCoefficient()+list.get(i).getCoefficient();  
						if(co!=0.00) {
						list3.add((new TermImp(co,list2.get(curr1).getExponent())));
						}
						}
						else{
							   int notappear=0;
					           for(int j=0; j<list.size();j++) { //if not, verify if the exponent is in the list if not is added to the list
					    	    if(list.get(j).getExponent()!=list2.get(i).getExponent()) {
					    	    	notappear++;
					    	    }
					    	    }
					            if(notappear==list.size()) {
					    	    list3.add((new TermImp(list2.get(i).getCoefficient(),list2.get(i).getExponent())));
					    	    list2.remove(i);	
					    	    i--;
					    	    lpnum--;
					    	    }
							
						}
					}
					iter2.next();
					curr1++;
			}
			}
			else {
				while(iter.hasNext()) {			//this.list.size is greater than list2.size
				    int lpnum=list.size();
					    for(int i=0; i<lpnum;i++) {
						if(list2.get(curr1).getExponent()==list.get(i).getExponent()) {
						co=list2.get(curr1).getCoefficient()+list.get(i).getCoefficient();
						if(co!=0.00) {
						list3.add((new TermImp(co,list2.get(curr1).getExponent())));
						}
						}
						else{
							   int notappear=0;               //if not, verify if the exponent is in the list if not is added to the list
					           for(int j=0; j<list2.size();j++) {
					    	    if(list.get(i).getExponent()!=list2.get(j).getExponent()) {
					    	    	notappear++;
					    	    }
					    	    }
					            if(notappear==list2.size()) {
					    	    list3.add((new TermImp(list.get(i).getCoefficient(),list.get(i).getExponent())));
					    	    list.remove(i);	
					    	    i--;
					    	    lpnum--;
					    	    }
							
						}
					}
					iter.next();
					curr1++;
					
			}
			}	
		}
		
		return P3;
		
	}

	@Override
	public Polynomial subtract(Polynomial P2) { // this method subtract P2 to this
		Polynomial P3=this.add(P2.multiply(-1)); // create a new polynomial and use the method add(P2) in his negative form
			return P3;
			
		}

	@Override
	public Polynomial multiply(Polynomial P2) {
		Polynomial P3=new PolynomialImp();              //Polynomial to return
		List<Term> list2= ((PolynomialImp)P2).list;     // list of P2
		List<Term> list3= ((PolynomialImp)P3).list;     // empty list of P3
		Iterator<Term> iter=this.list.iterator();            // iterator of this.list;
     	Iterator<Term> iter2=list2.iterator();           // iterator of list of P2
     	
		int curr=0;           //varible declaration
		Double co;
		Integer ex;
		if(list.size()==list2.size()) {         //verify if the lists have the same size
		   while(iter.hasNext()) {
		       
			    int lpnum=list2.size();
				
				for(int i=0; i<lpnum;i++) {                                            // this iterate over the list and get the results of the multiplication
					co=list.get(curr).getCoefficient()*list2.get(i).getCoefficient();
					ex=list.get(curr).getExponent()+list2.get(i).getExponent();
					if(co!=0.00) { //verify if all the coefficient were 0
					list3.add((new TermImp(co,ex)));
					}
					
				}
				iter.next();
				curr++;
				
		   } 
		}else {
			if(list.size()>list2.size()) { //verify if the list > list of P2
				while(iter.hasNext()) {
				       
				    int lpnum=list2.size();
					
					for(int i=0; i<lpnum;i++) {												 // this iterate over the list and get the results of the multiplication
						co=list.get(curr).getCoefficient()*list2.get(i).getCoefficient();
						ex=list.get(curr).getExponent()+list2.get(i).getExponent();
						if(co!=0.00) { //verify if all the coefficient were 0
						list3.add((new TermImp(co,ex)));	
						}
					}
					iter.next();
					curr++;
					
			   } 
			}else {                                                    // list < list of P2
				while(iter2.hasNext()) {
				       
				    int lpnum=list.size();
					
					for(int i=0; i<lpnum;i++) {													 // this iterate list2 and get the results of the multiplication
						co=list2.get(curr).getCoefficient()*list.get(i).getCoefficient();
						ex=list2.get(curr).getExponent()+list.get(i).getExponent();
						if(co!=0.00) { //verify if all the coefficient were 0
						list3.add((new TermImp(co,ex)));	
						}
					}
					iter2.next();
					curr++;
				}
				
			}
			
			
		}
		if(list3.isEmpty()) { //verify if all the coefficient were 0, nothing was added to the list and return the empty list
			return P3;
		}
		orderList(list3); // this helper method re organize the list and sum the terms that have equals exponent
		
		return P3;
	}

	@Override
	public Polynomial multiply(double c) {
		Polynomial P3=new PolynomialImp();    //polynomial to return
		List<Term> list3= ((PolynomialImp)P3).list;    // new list of P3
     	Iterator<Term> iter2=list.iterator();          // iterator of this.list
		int curr=0;
		Double co;
		Integer ex;
		while(iter2.hasNext()) {                      // this iterate over the list and multiply by c
			    iter2.next();
				co=list.get(curr).getCoefficient()*c;
				ex=list.get(curr).getExponent();
				if(co!=0.00) {  //verify if the co is 0
				list3.add((new TermImp(co,ex)));
				}
				curr++;
			}
		return P3;	
		}
	


	@Override
	public Polynomial derivative() {            // this method calculate the derivative of the polynomial
		Polynomial P3=new PolynomialImp();   // polynomial to return
		List<Term> list3= ((PolynomialImp)P3).list;  // empty list of P3
     	Iterator<Term> iter2=list.iterator(); //iterator of this.list
		Double co;
		Integer ex, curr=0;;
		if(this.degree()==0) {
			return new PolynomialImp("0");
		}
		while(iter2.hasNext()) {  // iterate over the list
			    iter2.next();
				co=list.get(curr).getCoefficient()*list.get(curr).getExponent();
				ex=list.get(curr).getExponent()-1;
				list3.add((new TermImp(co,ex)));
				if(list3.get(curr).getExponent()<0) {
					list3.remove(curr);
				}
				curr++;
			}
		return P3;	
		}
	

	@Override
	public Polynomial indefiniteIntegral() { // this method calculate the indefinite Integral of the polynomial
		Polynomial P3=new PolynomialImp(); //polynomial to return
		List<Term> list3= ((PolynomialImp)P3).list; // empty list of P3
     	Iterator<Term> iter2=list.iterator(); // iterator of the this.list
		int curr=0;
		Double co;
		Integer ex;
		while(iter2.hasNext()) {           // iterate over the list
			    iter2.next();
			    ex=list.get(curr).getExponent()+1;
			    double mult=(1/(double)ex);
			    co=list.get(curr).getCoefficient()*mult;
				list3.add((new TermImp(co,ex)));
				curr++;

			}
		return P3;	
	}

	@Override
	public double definiteIntegral(double a, double b) { //this method calculate the definite Integral of the polynomial
		Polynomial P3=this.indefiniteIntegral(); // P3 call the method indefinite integral and save the result in P3
		
		double result=P3.evaluate(b)-P3.evaluate(a); // result is the evaluation of the indefinite integral 
		return result;
	}

	@Override
	public int degree() {  // this method return the degree
	   return this.list.first().getExponent();
	}

	@Override
	public double evaluate(double x) { // this method evaluate the given polynomial, the result is double
     	Iterator<Term> iter=list.iterator();
		int curr=0;
		Double co=0.0;
		while(iter.hasNext()) {
		 iter.next();
		 co +=list.get(curr).getCoefficient()*Math.pow(x,list.get(curr).getExponent());
		 curr++;
		}
		return co;
		
	
	}


	@Override
	public boolean equals(Polynomial P2){ // verify if the string given is equals to the one calculate
		
		if (this.toString().equals(P2.toString())) {
			return true;
		}
		else {
			return false;
		}
	}
	public void termtoPolynomial(String s) { //this method convert the string given in the constructor and split them in to terms, then the terms are added to the list
		String[] term=s.split("\\+"); // split in every + sign
		for(String t: term) {
			int cont=0;
			if(t.contains("x")) {
				cont++;
			}
			String[] g=t.split("x"); // split x
			if(g.length>1) {
				if(g[0].equals("")) {
			     list.add(new TermImp(1.0, Integer.parseInt((g[1].substring(1)))));	
				 }
				 else {
				 list.add(new TermImp(Double.parseDouble(g[0]), Integer.parseInt((g[1].substring(1)))));
				 }
			} else if(cont>0) {
				
				   if(g.length==0) {
					    list.add(new TermImp(1.0, 1));	
				    }
				   else{
				     list.add(new TermImp(Double.parseDouble(g[0]), 1));
				    }
			        }
			else {
		        list.add(new TermImp(Double.valueOf(g[0]),0)); 
			  }
			}
		}
		

	public String toString() { //this method get the terms in this.list and create a string, this string is the corresponding string
		String str="";
		
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getExponent()==0) {
				str+=list.get(i).getCoefficient()+"0";
			}
			else if(list.get(i).getExponent()==1){
				str += list.get(i).getCoefficient()+"0x";
			}
			else
			{
		       str += list.get(i).getCoefficient()+"0x^"+ list.get(i).getExponent();
			}
			if(i!=list.size()-1) {
				str+="+";
			}
		}
		if(list.size()==0) { // if the list is empty return 0
			return "0.00";
		}
		return str;
	}
    public List<Term> orderList(List<Term> listtr){ // this method re order the list and add if the terms have the same exponent;
    	Iterator<Term> iter3=listtr.iterator(); 
		int curr=0,ex=0;
         double co;
		int k=1, listrun=listtr.size();
		while(iter3.hasNext()) {
		 
		 for (int i = k; i < listrun ; i++) {
			if(listtr.get(curr).getExponent()==listtr.get(i).getExponent()) {              // if the exponent are equal they sum each other and set to the curr and remove i 
			      co=listtr.get(curr).getCoefficient()+listtr.get(i).getCoefficient();
			      ex=listtr.get(i).getExponent();
			      listtr.set(curr,new TermImp(co,ex)); 
			      listtr.remove(i);
			      listrun--;
			      
			}
			else if(listtr.get(curr).getExponent()<listtr.get(i).getExponent()) {   // if the curr exponent is less than i, is going to add in curr the i. remove the one that I move
				listtr.add(curr,new TermImp(listtr.get(i).getCoefficient(),listtr.get(i).getExponent()));
				listtr.remove(i+1);
				
			}
		 }
		 iter3.next();
		 curr++;
		 k++;
		}
		
		return listtr;
    }
	
	
	
	private class PolynomialIterator<E> implements Iterator<Term>{ // iterator of terms 
		private int curr=0;
		private Term a;
		@Override
		public boolean hasNext() {
			return curr < list.size();
		}

		@Override
		public Term next() {
			if (!hasNext()) throw new NoSuchElementException("No more elements ...");
			a=list.get(curr);
			curr ++; // prepare for the future ... for the next execution of this operation..
			return a;
			}
	}

}
