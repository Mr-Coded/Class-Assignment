
public class AssQ5 {
	public class Complex{

		  double real, img;

		 
		  Complex(double r, double i){

		this.real = r;

		this.img = i;

		  }

		 

		  public  Complex sum(Complex c1, Complex c2)

		  {


		       Complex temp = new Complex(0, 0);

		       temp.real = c1.real + c2.real;

		       temp.img = c1.img + c2.img;


		       return temp;

		   }

		    {

		Complex c1 = new Complex(6.7, 4);

		Complex c2 = new Complex(2.3, 4.5);

		       Complex temp = sum(c1, c2);

		       System.out.printf("Sum is: "+ temp.real+" + "+ temp.img +"i");

		   }

}
}