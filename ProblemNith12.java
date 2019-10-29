package test;

import java.util.Scanner;
class LinearEquation{
	private double a;
	private double b;
	private double c;
	private double d;
	private double e;
	private double f;
	
	public LinearEquation(double a,double b, double c, double d,double e, double f){		
		this.a=a;
		this.b=b;
		this.c=c;
		this.d=d;
		this.e=e;
		this.f=f;
	}
	
	public double getA(){
		return this.a;
	}
	
	public double getB(){
		return this.b;
	}
	
	public double getC(){
		return this.c;
	}
	
	public double getD(){
		return this.d;
	}
	
	public double getE(){
		return this.e;
	}
	
	public double getF(){
		return this.f;
	}
	
	public boolean isSolvable(){
		if(a*d-b*c==0){
			return false;
		}else{
			return true;
		}
	}
	
	public double getX(){
		return (e*d-b*f)/(a*d-b*c);
	}
	
	public double getY(){
		return (a*f-e*c)/(a*d-b*c);
	}
}

public class ProblemNith12 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("«Î ‰»Î8∏ˆ ˝:");
		double x1=input.nextDouble();
		double y1=input.nextDouble();
		double x2=input.nextDouble();
		double y2=input.nextDouble();
		double x3=input.nextDouble();
		double y3=input.nextDouble();
		double x4=input.nextDouble();
		double y4=input.nextDouble();
		double a=y1-y2;
		double b=-(x1-x2);
		double e=(y1-y2)*x1-(x1-x2)*y1;
		double c=y3-y4;
		double d=-(x3-x4);
		double f=(y3-y4)*x3-(x3-x4)*y3;
		LinearEquation p=new LinearEquation(a, b, c, d, e, f);
		System.out.println("X:"+p.getX()+" Y:"+p.getY());
	
	}
}
