//Use of super on constructor

class Volume
{
	double length;
	double breadth;
	double height;
	
	Volume (double a, double b, double c)
	{
		length = a;
		breadth = b;
		height = c;
	}
}
	
class WeightBox extends Volume
{	
	double weight;
	WeightBox(double a, double b, double c, double d)
	{
		super(a, b, c);
		weight = d;
	}
	
	double volume()
	{
		return length*breadth*height;	
	}
}

class SuperUse
{
	public static void main(String [] args)
		{
			WeightBox wt = new WeightBox(5.5,6.5,7.5,8.5);
			double vol;
			vol = wt.volume();
			System.out.println("The volume of box is "+vol);
			System.out.println("The weight of box is "+wt.weight);
		}
}