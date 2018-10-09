//Basic underestanding of inheritance and use of superclass variable as a reference a subclass objet

class Volume
{
	double length;
	double breadth;
	double height;
	double volume ()
	{
		return length*breadth*height;
	}
	double area()
	{
		return length * breadth;
	}
}

class VolumeExt extends Volume
{
	
	VolumeExt(double l, double b, double h)
	{
		length = l;
		breadth = b;
		height = h;
	}
		
} 

class RefDemo
{
	public static void main (String [] args)
	{
		VolumeExt ext = new VolumeExt(10.5,5.5,2.5);
		double vol;
		vol = ext.area();
		System.out.println("The area is "+vol);
		System.out.println("The volume is "+ext.volume());
		Volume volu = new Volume();
		volu = ext; //reference Variable
		System.out.println("The volume is "+volu.volume());
	}
}