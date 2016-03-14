package session5;
class Area
{
int length;
int breadth;
//This is parametrized constructor
Area(int a, int b)
{
length = a;
breadth = b;
}
Area(int a) //Constructor used when are of square needs to be calculated
{
length=breadth=a;
}
public void CalculateArea()
{
	System.out.println("Area is : "+length*breadth);
	

}
}
public class ConstructorOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Area Rectangle = new Area(10,20); //This will call
		Rectangle.CalculateArea();
		Area Square = new Area(5);
		Square.CalculateArea();
	}

}
