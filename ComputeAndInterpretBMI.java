import java.util.Scanner;

public class ComputeAndInterpretBMI {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.print("Enter weight in pounds: ");
		double weight=input.nextDouble();
		
		System.out.print("Enter height in inches: ");
		double height=input.nextDouble();
		
		final double Kg=0.45359237;
		final double METERS=0.0254;
		
		double weightInkilograms=weight*Kg;
		double heightInMeters =height*METERS;
		double bmi=weightInkilograms/(heightInMeters*heightInMeters);
		
		System.out.println("BMI is "+bmi);
		if(bmi<18.5){
			System.out.println("Underweight");
		}else if(bmi<25){
			
			System.out.println("Normal");
		}else if(bmi<30){
			System.out.println("Overweight");
		}else{
			System.out.println("Obese");
		}
		
		
		
	}
	
	

}
