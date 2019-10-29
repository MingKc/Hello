package test;

class RegularPolygon{
	private int n;	//边数
	
	private double side;	//长度
	
	private double x;	//x坐标
	
	private double y;	//y坐标
	
	//无参构造函数
	public RegularPolygon(){		
	
	}
	
	public RegularPolygon(int n,double side){
		this.n=n;
		this.side=side;
		x=y=0;
	}
	
	public RegularPolygon(int n,double side,double x,double y){
		this.n=n;
		this.side=side;
		this.x=x;
		this.y=y;
	}
	
	public void setN(int n){
		this.n=n;
	}
	
	public int getN(){
		return this.n;
	}
	
	public void setSide(double side){
		this.side=side;
	}
	
	public double getSide(){
		return this.side;
	}
	
	public void setX(double x){
		this.x=x;
	}
	
	public double getX(){
		return this.x;
	}
	
	public void setY(double y){
		this.y=y;
	}
	
	public double getY(){
		return this.y;
	}
	
	public double getPerimeter(){
		return n*side;
	}
	
	public double getArea(){
		return n*side*side/(4*Math.tan(3.1715926/n));
	}
}

public class ProblemNith9 {
	public static void main(String[] args) {
		RegularPolygon p1=new RegularPolygon();
		RegularPolygon p2=new RegularPolygon(6,4);
		RegularPolygon p3=new RegularPolygon(10,4,5.6,7.8);
		
		System.out.println(p1.getPerimeter());
		System.out.println(p1.getArea());
		
		System.out.println(p2.getPerimeter());
		System.out.println(p2.getArea());
		
		System.out.println(p3.getPerimeter());
		System.out.println(p3.getArea());		
	}
}
